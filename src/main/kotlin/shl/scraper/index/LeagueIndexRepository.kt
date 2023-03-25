package shl.scraper.index

import me.xdrop.fuzzywuzzy.FuzzySearch
import shl.scraper.index.api.*
import shl.scraper.roster.TeamInfo
import shl.scraper.util.fuzzySearch

object LeagueIndexRepository {

    fun getDetailedStats(leagueType: LeagueType, season: Int?): List<DetailedTeamStats> {
        return IndexApiClient.get(leagueType).getDetailedTeamStats(season)
    }

    fun getTeamStats(teamInfo: TeamInfo, season: Int?): TeamStats? {
        val allTeams = getStandings(teamInfo.leagueType, season)
        val allDetailedStats =
            IndexApiClient.get(teamInfo.leagueType).getDetailedTeamStats(season).associateBy { it.id }
        allTeams.forEach {
            it.detailedStats = allDetailedStats[it.id]
        }
        val teamId = TeamIdRepository.requireFhmTeamId(teamInfo)

        val result = allTeams.find {
            it.teamInfoResponse?.id == teamId
        } ?: return null

        allTeams.forEach { team ->
            team.regularSeasonPlayerStats = getPlayerStatsForTeam(team.teamInfo!!, SeasonType.REGULAR, season)
        }

        result.leaguePosition = allTeams.sortedByDescending { it.points }.indexOfFirst { it.id == result.id }
        result.conferencePosition = allTeams.filter {
            it.conference == result.conference
        }.sortedByDescending { it.points }.indexOfFirst { it.id == result.id }
        result.divisionPosition = allTeams.filter {
            it.conference == result.conference && it.division == result.division
        }.sortedByDescending { it.points }.indexOfFirst { it.id == result.id }
        result.goalsForRank = allTeams.sortedByDescending { it.goalsPerGame }.indexOfFirst { it.id == result.id }
        result.goalsAgainstRank = allTeams.sortedBy { it.goalsAgainstPerGame }.indexOfFirst { it.id == result.id }
        result.pdoRank = allTeams.sortedByDescending { it.pdo }.indexOfFirst { it.id == result.id }
        result.corsiRank = allTeams.sortedByDescending { it.corsi }.indexOfFirst { it.id == result.id }

        result.shotsForRank =
            allTeams.sortedByDescending { it.detailedStats?.shotsForPerGame ?: 0.0 }.indexOfFirst { it.id == result.id }
        result.shotsAgainstRank =
            allTeams.sortedBy { it.detailedStats?.shotsAgainstPerGame ?: 0.0 }.indexOfFirst { it.id == result.id }
        result.shotDiffRank =
            allTeams.sortedByDescending { it.detailedStats?.shotDiff ?: 0.0 }.indexOfFirst { it.id == result.id }
        result.pimsRank =
            allTeams.sortedByDescending { it.detailedStats?.shotsForPerGame ?: 0.0 }.indexOfFirst { it.id == result.id }
        result.ppRank =
            allTeams.sortedByDescending { it.detailedStats?.ppPercentage ?: 0.0 }.indexOfFirst { it.id == result.id }
        result.pkRank =
            allTeams.sortedByDescending { it.detailedStats?.pkPercentage ?: 0.0 }.indexOfFirst { it.id == result.id }

        return result
    }

    fun getStandings(leagueType: LeagueType, season: Int?): List<TeamStats> {
        return IndexApiClient.get(leagueType).getStandings(season)
    }

    fun getDivisionStandings(leagueType: LeagueType, season: Int?): List<LeagueDivision> {
        val teams = getStandings(leagueType, season)
        val divisions = IndexApiClient.get(leagueType).getDivisions(season)
        divisions.forEach { division ->
            division.teams = teams.filter {
                division.conference == it.conference && division.id == it.division
            }
        }
        return divisions.filter { it.teams.isNotEmpty() }
    }

    fun getSchedule(teamInfo: TeamInfo, season: Int?): TeamSchedule {
        val teamId = TeamIdRepository.requireFhmTeamId(teamInfo)
        return getSchedule(teamId, teamInfo.leagueType, season, teamInfo.fullName)
    }

    fun getSchedule(teamId: Int, leagueType: LeagueType, season: Int?, teamName: String): TeamSchedule {
        val allGames = IndexApiClient.get(leagueType).getSchedule(season).filter {
            it.homeTeam == teamId || it.awayTeam == teamId
        }
        val completed = allGames.filter { it.played > 0 }
        val upcoming = allGames.filter { it.played <= 0 }
        return TeamSchedule(teamName, teamId, completed, upcoming)
    }

    fun getTeamInfos(leagueType: LeagueType, season: Int? = null): List<TeamInfoResponse> {
        return IndexApiClient.get(leagueType).getTeamInfos(season)
    }

    fun getPlayoffs(leagueType: LeagueType, season: Int?): List<List<PlayoffSeries>> {
        return IndexApiClient.get(leagueType).getPlayoffs(season)
    }

    fun getPlayerStats(name: String, seasonType: SeasonType?, season: Int?): BasePlayerStats? {
        val candidates = mutableListOf<Pair<BasePlayerStats?, Int>>()
        for (i in 0..3) {
            val player = when (i) {
                0 -> {
                    getPlayerStats(LeagueType.SHL, name, season, seasonType) ?: Pair(null, 0)
                }

                1 -> {
                    getPlayerStats(LeagueType.SMJHL, name, season, seasonType) ?: Pair(null, 0)
                }

                2 -> {
                    getGoalieStats(LeagueType.SHL, name, season, seasonType) ?: Pair(null, 0)
                }

                3 -> {
                    getGoalieStats(LeagueType.SMJHL, name, season, seasonType) ?: Pair(null, 0)
                }

                else -> throw IllegalStateException()
            }

            candidates.add(player)
        }

        return candidates.sortedWith(compareBy({ -it.second }, { -(it.first?.gamesPlayed ?: 0) })).firstOrNull()?.first
    }

    fun getPlayerStatsForTeam(
        teamInfo: TeamInfo,
        seasonType: SeasonType?,
        season: Int?
    ): List<PlayerStats> {
        val leagueType = teamInfo.leagueType
        return if (seasonType != null) {
            getPlayerStats(leagueType, seasonType, season).filter {
                teamInfo.nameRegex.matches(it.team)
            }
        } else {
            val playoffs = getPlayerStats(leagueType, SeasonType.POST, season).filter {
                teamInfo.nameRegex.matches(it.team)
            }
            val regular = getPlayerStats(leagueType, SeasonType.REGULAR, season).filter {
                teamInfo.nameRegex.matches(it.team)
            }
            return if (playoffs.any { it.gamesPlayed > 0 } && playoffs.firstOrNull()?.season == regular.firstOrNull()?.season) {
                playoffs
            } else {
                regular
            }
        }
    }

    fun getPlayerStatsSince(
        leagueType: LeagueType,
        seasonType: SeasonType,
        season: Int?,
        positionFilter: PositionFilter?,
        draftClass: Int?,
        teamInfo: TeamInfo?
    ): List<PlayerStats> {
        val seasons = IndexApiClient.get(leagueType).getAvailableSeasonsInfo().filter {
            season == null || it.season >= season
        }
        val prevDraftClassPlayerNames = mutableListOf<String>()
        if (draftClass != null) {
            for (i in (draftClass - 10) until (draftClass - 1)) {
                prevDraftClassPlayerNames.addAll(
                    getSthsOrFhmSkaterStats(LeagueType.SMJHL, i, SeasonType.REGULAR).map {
                        it.name.toLowerCase()
                    }
                )
                prevDraftClassPlayerNames.addAll(
                    getSthsOrFhmSkaterStats(LeagueType.SHL, i, SeasonType.REGULAR).map {
                        it.name.toLowerCase()
                    }
                )
            }
        }
        val requestedDraftClassPlayerNames = if (draftClass != null) {
            getSthsOrFhmSkaterStats(LeagueType.SMJHL, draftClass - 1, SeasonType.REGULAR).filter { player ->
                prevDraftClassPlayerNames.none { FuzzySearch.ratio(it, player.name.toLowerCase()) > 90 } &&
                        player.gamesPlayed > 25
            }.map { it.name.toLowerCase() }
        } else {
            null
        }

        val statsByName = mutableMapOf<String, MutableMap<String, PlayerStats>>()

        val allStats = seasons.map {
            IndexApiClient.get(leagueType).getPlayerStats(seasonType, it.season)
        }.flatten() + if (positionFilter == null && (season == null || season < 53)) {
            SthsIndexRepository.allPlayerStatsFixed.filter {
                it.season >= (season ?: 0) && leagueType.apiId == it.league && it.seasonType == seasonType
            }
        } else {
            emptyList()
        }.filter {
            draftClass == null || it.season >= draftClass - 1
        }

        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }
        allStats.filter { it.teamId == teamId || teamId == null }.forEach { player ->
            val key = player.id.toString() + if (positionFilter != null) player.isDefenseman else ""

            statsByName.putIfAbsent(key, mutableMapOf())
            val map = statsByName[key]!!
            val currentName = map.keys.find { FuzzySearch.ratio(it, player.name) >= 80 }
            if (currentName != null) {
                map[currentName] = map[currentName]!! + player
            } else {
                map[player.name] = player
            }
        }

        return statsByName.values.map { it.values }.flatten().filter { player ->
            if (draftClass != null && requestedDraftClassPlayerNames != null) {
                requestedDraftClassPlayerNames.any {
                    FuzzySearch.ratio(it, player.name.toLowerCase()) > 90
                }
            } else {
                true
            }
        }
    }

    fun getActivePlayerIds(leagueType: LeagueType): Set<Int> {
        return IndexApiClient.get(leagueType).getPlayerStats(SeasonType.REGULAR).map { it.id }.toSet() +
                IndexApiClient.get(leagueType).getGoalieStats(SeasonType.REGULAR).map { it.id }.toSet()
    }

    fun getGoalieStatsSince(
        leagueType: LeagueType,
        seasonType: SeasonType,
        season: Int?,
        draftClass: Int?,
        teamInfo: TeamInfo?
    ): List<GoalieStats> {
        val seasons = IndexApiClient.get(leagueType).getAvailableSeasonsInfo().filter {
            season == null || it.season >= season
        }
        val prevDraftClassPlayerNames = mutableListOf<String>()
        if (draftClass != null) {
            for (i in (draftClass - 10) until (draftClass - 1)) {
                prevDraftClassPlayerNames.addAll(
                    getSthsOrFhmGoalieStats(LeagueType.SMJHL, i, SeasonType.REGULAR).map {
                        it.name.toLowerCase()
                    }
                )
                prevDraftClassPlayerNames.addAll(
                    getSthsOrFhmGoalieStats(LeagueType.SHL, i, SeasonType.REGULAR).map {
                        it.name.toLowerCase()
                    }
                )
            }
        }
        val requestedDraftClassPlayerNames = if (draftClass != null) {
            getSthsOrFhmGoalieStats(LeagueType.SMJHL, draftClass - 1, SeasonType.REGULAR).filter { player ->
                prevDraftClassPlayerNames.none { FuzzySearch.ratio(it, player.name.toLowerCase()) > 90 } &&
                        player.gamesPlayed > 5
            }.map { it.name.toLowerCase() }
        } else {
            null
        }

        val statsByName = mutableMapOf<String, MutableMap<String, GoalieStats>>()

        val allStats = seasons.map {
            IndexApiClient.get(leagueType).getGoalieStats(seasonType, it.season)
        }.flatten() + if (season == null || season < 53) {
            SthsIndexRepository.allGoalieStatsFixed.filter {
                it.season >= (season ?: 0) && leagueType.apiId == it.league && it.seasonType == seasonType
            }
        } else {
            emptyList()
        }.filter {
            draftClass == null || it.season >= draftClass - 1
        }

        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }
        allStats.filter { it.teamId == teamId || teamId == null }.forEach { player ->
            val key = player.id.toString()

            statsByName.putIfAbsent(key, mutableMapOf())
            val map = statsByName[key]!!
            val currentName = map.keys.find { FuzzySearch.ratio(it, player.name) >= 80 }
            if (currentName != null) {
                map[currentName] = map[currentName]!! + player
            } else {
                map[player.name] = player
            }
        }

        return statsByName.values.map { it.values }.flatten().filter { player ->
            if (draftClass != null && requestedDraftClassPlayerNames != null) {
                requestedDraftClassPlayerNames.any {
                    FuzzySearch.ratio(it, player.name.toLowerCase()) > 90
                }
            } else {
                true
            }
        }
    }

    fun getPlayerStatsForRecords(
        leagueType: LeagueType,
        seasonType: SeasonType,
        teamInfo: TeamInfo?
    ): List<PlayerStats> {
        val result = mutableListOf<PlayerStats>()
        IndexApiClient.get(leagueType).getAvailableSeasonsInfo().forEach { season ->
            result.addAll(IndexApiClient.get(leagueType).getPlayerStats(seasonType, season.season))
        }
        result.addAll(SthsIndexRepository.allPlayerStatsFixed.filter {
            it.seasonType == seasonType && leagueType.apiId == it.league
        })
        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }
        return result.filter {
            it.teamId == teamId || teamId == null
        }
    }

    fun getPlayerStatsForLeaders(
        leagueType: LeagueType,
        seasonType: SeasonType,
        season: Int?,
        positionFilter: PositionFilter?,
        teamInfo: TeamInfo?,
        onlyRookies: Boolean
    ): List<PlayerStats> {
        val result = if ((season ?: 100) < 53) {
            SthsIndexRepository.allPlayerStatsFixed.filter {
                it.season == season && it.league == leagueType.apiId && it.seasonType == seasonType &&
                        positionFilter == null
            }
        } else {
            getPlayerStats(leagueType, seasonType, season)
        }

        if (result.isEmpty()) {
            return emptyList()
        }

        val prevSeasonsPlayerIds = mutableSetOf<Int>()
        val prevSeasonsPlayerNames = mutableSetOf<String>()
        for (i in 0..2) {
            val checkSeason = result[0].season - i - 1
            if (checkSeason <= 0) {
                break
            }

            val players = if (checkSeason < 53) {
                SthsIndexRepository.allPlayerStatsFixed.filter {
                    it.season == checkSeason && it.league == leagueType.apiId && it.seasonType == seasonType
                }
            } else {
                getPlayerStats(leagueType, seasonType, checkSeason)
            }

            prevSeasonsPlayerIds.addAll(players.map { it.id })
            prevSeasonsPlayerNames.addAll(players.map { it.name.toLowerCase() })
        }

        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }

        return result.filter {
            val isRookie = it.season == 1 || !prevSeasonsPlayerIds.contains(it.id) &&
                    !prevSeasonsPlayerNames.contains(it.name.toLowerCase()) &&
                    it.id > 0 && it.name.isNotBlank()

            when (positionFilter) {
                PositionFilter.F -> !it.isDefenseman
                PositionFilter.D -> it.isDefenseman
                else -> true
            } && (it.teamId == teamId || teamId == null) && (!onlyRookies || isRookie)
        }
    }


    fun getPlayerStats(
        leagueType: LeagueType,
        seasonType: SeasonType,
        season: Int?,
        positionFilter: PositionFilter? = null
    ): List<PlayerStats> {
        return IndexApiClient.get(leagueType).getPlayerStats(seasonType, season).filter {
            when (positionFilter) {
                PositionFilter.F -> !it.isDefenseman
                PositionFilter.D -> it.isDefenseman
                else -> true
            }
        }
    }

    fun getPlayerStats(
        leagueType: LeagueType,
        name: String,
        season: Int?,
        seasonType: SeasonType?
    ): Pair<PlayerStats, Int>? {
        val regular = getSthsOrFhmSkaterStats(leagueType, season, SeasonType.REGULAR)
        val playoffs = getSthsOrFhmSkaterStats(leagueType, regular.firstOrNull()?.season, SeasonType.POST)

        val playoffMatch = playoffs.fuzzySearch(name) { it.name }
        val regMatch = regular.fuzzySearch(name) { it.name } ?: return playoffMatch
        return when (seasonType) {
            SeasonType.REGULAR -> regMatch
            SeasonType.POST -> playoffMatch
            else -> {
                if (playoffMatch != null && playoffMatch.second >= 100) {
                    playoffMatch
                } else {
                    if (playoffMatch != null && playoffMatch.second >= regMatch.second) {
                        playoffMatch
                    } else {
                        regMatch
                    }
                }
            }
        }
    }

    private fun getSthsOrFhmSkaterStats(
        leagueType: LeagueType,
        season: Int?,
        seasonType: SeasonType
    ): List<PlayerStats> {
        return if (season != null && season < 53) {
            SthsIndexRepository.allPlayerStatsFixed.filter {
                it.league == leagueType.apiId && season == it.season && seasonType == it.seasonType
            }
        } else {
            IndexApiClient.get(leagueType).getPlayerStats(seasonType, season)
        }
    }

    private fun getSthsOrFhmGoalieStats(
        leagueType: LeagueType,
        season: Int?,
        seasonType: SeasonType
    ): List<GoalieStats> {
        return if (season != null && season < 53) {
            SthsIndexRepository.allGoalieStatsFixed.filter {
                it.league == leagueType.apiId && season == it.season && seasonType == it.seasonType
            }
        } else {
            IndexApiClient.get(leagueType).getGoalieStats(seasonType, season)
        }
    }

    fun getGoalieStatsForRecords(
        leagueType: LeagueType,
        seasonType: SeasonType,
        teamInfo: TeamInfo?
    ): List<GoalieStats> {
        val result = mutableListOf<GoalieStats>()
        IndexApiClient.get(leagueType).getAvailableSeasonsInfo().forEach { season ->
            result.addAll(IndexApiClient.get(leagueType).getGoalieStats(seasonType, season.season))
        }
        result.addAll(SthsIndexRepository.allGoalieStatsFixed.filter {
            it.seasonType == seasonType && leagueType.apiId == it.league
        })
        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }
        return result.filter {
            it.teamId == teamId || teamId == null
        }
    }

    fun getGoalieStatsForLeaders(
        leagueType: LeagueType,
        seasonType: SeasonType,
        season: Int?,
        teamInfo: TeamInfo?,
        isRookies: Boolean
    ): List<GoalieStats> {
        val result = if ((season ?: 100) < 53) {
            SthsIndexRepository.allGoalieStatsFixed.filter {
                it.season == season && it.league == leagueType.apiId && it.seasonType == seasonType
            }
        } else {
            getGoalieStats(leagueType, seasonType, season)
        }

        if (result.isEmpty()) {
            return emptyList()
        }

        val prevSeasonsPlayerIds = mutableSetOf<Int>()
        val prevSeasonsPlayerNames = mutableSetOf<String>()
        for (i in 0..2) {
            val checkSeason = result[0].season - i - 1
            if (checkSeason <= 0) {
                break
            }

            val players = if (checkSeason < 53) {
                SthsIndexRepository.allGoalieStatsFixed.filter {
                    it.season == checkSeason && it.league == leagueType.apiId && it.seasonType == seasonType
                }
            } else {
                getGoalieStats(leagueType, seasonType, checkSeason)
            }

            prevSeasonsPlayerIds.addAll(players.map { it.id })
            prevSeasonsPlayerNames.addAll(players.map { it.name.toLowerCase() })
        }

        val teamId = teamInfo?.let { TeamIdRepository.requireFhmTeamId(it) }

        return result.filter {
            (!isRookies || (it.season == 1 || !prevSeasonsPlayerIds.contains(it.id) && !prevSeasonsPlayerNames.contains(
                it.name.toLowerCase()
            ))
                    && it.id > 0 && it.name.isNotBlank()) && (it.teamId == teamId || teamId == null)
        }
    }

    fun getGoalieStats(leagueType: LeagueType, seasonType: SeasonType, season: Int?): List<GoalieStats> {
        return IndexApiClient.get(leagueType).getGoalieStats(seasonType, season)
    }

    fun getGoalieStats(
        leagueType: LeagueType,
        name: String,
        season: Int?,
        seasonType: SeasonType?
    ): Pair<GoalieStats, Int>? {
        val regular = getSthsOrFhmGoalieStats(leagueType, season, SeasonType.REGULAR)
        val playoffs = getSthsOrFhmGoalieStats(leagueType, regular.firstOrNull()?.season, SeasonType.POST)

        val playoffMatch = playoffs.fuzzySearch(name) { it.name }
        val regMatch = regular.fuzzySearch(name) { it.name } ?: return playoffMatch
        return when (seasonType) {
            SeasonType.REGULAR -> regMatch
            SeasonType.POST -> playoffMatch
            else -> {
                if (playoffMatch != null && playoffMatch.second >= 100) {
                    playoffMatch
                } else {
                    if (playoffMatch != null && playoffMatch.second >= regMatch.second) {
                        playoffMatch
                    } else {
                        regMatch
                    }
                }
            }
        }
    }

    fun getCareerStats(name: String): CareerStats? {
        val shlAvailableSeasons = (1..52).map { AvailableSeason(0, it) } + ShlIndexApiClient.getAvailableSeasonsInfo()
        val smjhlAvailableSeasons =
            (1..52).map { AvailableSeason(1, it) } + SmjhlIndexApiClient.getAvailableSeasonsInfo()

        var lastRegularStats: Pair<BasePlayerStats, Int>? = null
        shlAvailableSeasons.reversed().forEach { season ->
            if ((lastRegularStats?.second ?: 0) >= 100) {
                return@forEach
            }
            val stats = getPlayerStats(LeagueType.SHL, name, season.season, SeasonType.REGULAR)
            if (stats != null && stats.second > (lastRegularStats?.second ?: 0)) {
                lastRegularStats = stats
            }

            val goalieStats = getGoalieStats(LeagueType.SHL, name, season.season, SeasonType.REGULAR)
            if (goalieStats != null && goalieStats.second > (lastRegularStats?.second ?: 0)) {
                lastRegularStats = goalieStats
            }
        }
        smjhlAvailableSeasons.reversed().forEach { season ->
            if ((lastRegularStats?.second ?: 0) >= 100) {
                return@forEach
            }
            val stats = getPlayerStats(LeagueType.SMJHL, name, season.season, SeasonType.REGULAR)
            if (stats != null && stats.second > (lastRegularStats?.second ?: 0)) {
                lastRegularStats = stats
            }

            val goalieStats = getGoalieStats(LeagueType.SMJHL, name, season.season, SeasonType.REGULAR)
            if (goalieStats != null && goalieStats.second > (lastRegularStats?.second ?: 0)) {
                lastRegularStats = goalieStats
            }
        }

        val lastRegular = lastRegularStats?.first ?: return null
        val resolvedId = lastRegular.id
        val resolvedName = lastRegular.name
        val isGoalie = lastRegular is GoalieStats

        val result = mutableListOf<CareerStats.Season>()
        var smjhlSeason = 0
        for (i in smjhlAvailableSeasons.indices) {
            val season = smjhlAvailableSeasons[i]
            val allRegThisSeason = if (season.season < 53) {
                SthsIndexRepository.getAllStats(isGoalie).filter {
                    it.league == LeagueType.SMJHL.apiId && it.seasonType == SeasonType.REGULAR &&
                            it.season == season.season
                }
            } else {
                SmjhlIndexApiClient.getStats(SeasonType.REGULAR, season.season, isGoalie)
            }
            val allPoThisSeason = if (season.season < 53) {
                SthsIndexRepository.getAllStats(isGoalie).filter {
                    it.league == LeagueType.SMJHL.apiId && it.seasonType == SeasonType.POST &&
                            it.season == season.season
                }
            } else {
                SmjhlIndexApiClient.getStats(SeasonType.POST, season.season, isGoalie)
            }

            val reg = allRegThisSeason.find {
                it.id == resolvedId && LeagueType.SMJHL.apiId == lastRegular.league &&
                        FuzzySearch.ratio(it.name, resolvedName) >= 80
                        || it.name == resolvedName
            } ?: if (smjhlSeason > 0) break else continue
            val playoffs = allPoThisSeason.find {
                it.id == resolvedId && LeagueType.SMJHL.apiId == lastRegular.league &&
                        FuzzySearch.ratio(it.name, resolvedName) >= 80
                        || it.name == resolvedName
            }

            smjhlSeason = season.season
            result.add(CareerStats.Season(LeagueType.SMJHL, season.season, reg, playoffs))
        }

        for (i in shlAvailableSeasons.indices) {
            val season = shlAvailableSeasons[i]
            if (season.season <= smjhlSeason) {
                continue
            }

            val allRegular = if (season.season < 53) {
                SthsIndexRepository.getAllStats(isGoalie).filter {
                    it.league == LeagueType.SHL.apiId && it.seasonType == SeasonType.REGULAR &&
                            it.season == season.season
                }
            } else {
                ShlIndexApiClient.getStats(SeasonType.REGULAR, season.season, isGoalie)
            }
            val allPostseason = if (season.season < 53) {
                SthsIndexRepository.getAllStats(isGoalie).filter {
                    it.league == LeagueType.SHL.apiId && it.seasonType == SeasonType.POST &&
                            it.season == season.season
                }
            } else {
                ShlIndexApiClient.getStats(SeasonType.POST, season.season, isGoalie)
            }

            val reg = allRegular.find {
                it.id == resolvedId && LeagueType.SHL.apiId == lastRegular.league &&
                        FuzzySearch.ratio(it.name, resolvedName) >= 80
                        || it.name == resolvedName
            } ?: continue
            val playoffs = allPostseason.find {
                it.id == resolvedId && LeagueType.SHL.apiId == lastRegular.league &&
                        FuzzySearch.ratio(it.name, resolvedName) >= 80
                        || it.name == resolvedName
            }
            result.add(CareerStats.Season(LeagueType.SHL, season.season, reg, playoffs))
        }

        val teamInfo = TeamInfo.find(lastRegular.team)
        val position = if (isGoalie) "G" else (lastRegular as PlayerStats).position

        return CareerStats(lastRegular.name, teamInfo, position, isGoalie, result)
    }
}