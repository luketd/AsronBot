package shl.scraper.index.api

import com.squareup.moshi.Moshi
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import shl.scraper.config.*
import shl.scraper.index.*
import shl.scraper.roster.TeamInfo
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

abstract class IndexApiClient(private val leagueType: LeagueType) {
    private val leagueId = leagueType.apiId
    private val executor = Executors.newSingleThreadExecutor()

    private val api = Retrofit.Builder()
        .baseUrl(API_URL)
        .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
        .build()
        .create(IndexApi::class.java)

    private var availableSeasons = emptyList<AvailableSeason>()
    private val standings = mutableMapOf<Int, List<TeamStats>>()
    private val conferences = mutableMapOf<Int, List<LeagueConference>>()
    private val teamInfos = mutableMapOf<Int, List<TeamInfoResponse>>()
    private val detailedTeamStats = mutableMapOf<Int, List<DetailedTeamStats>>()
    private val divisions = mutableMapOf<Int, List<LeagueDivision>>()
    private val playerStats = mutableMapOf<SeasonType, MutableMap<Int, List<PlayerStats>>>()
    private val goalieStats = mutableMapOf<SeasonType, MutableMap<Int, List<GoalieStats>>>()
    private val schedule = mutableMapOf<SeasonType, MutableMap<Int, List<GameInfo>>>()
    private val playoffs = mutableMapOf<Int, List<List<PlayoffSeries>>>()

    private var loaded = false
    private var lastLoadTimestamp = 0L

    fun reload(season: Int? = null) {
        executor.execute {
            loaded = false
            val currentSeason = DynamicConfigRepository.config.currentSeason
            if (currentSeason != availableSeasons.map { it.season }.maxByOrNull { it }) {
                availableSeasons = api.getSeasons(leagueType.apiId).execute().body()!!
            }

            load(season ?: currentSeason)
            lastLoadTimestamp = System.currentTimeMillis()
            loaded = true
        }
    }

    fun reloadIfError() {
        if (!loaded || System.currentTimeMillis() - lastLoadTimestamp >= TimeUnit.HOURS.toMillis(12)) {
            reload()
        }
    }

    private fun load(season: Int) {
        getTeamInfos(season, reload = true)
        getStandings(season, reload = true)
        getConferences(season, reload = true)
        getDivisions(season, reload = true)
        getPlayerStats(SeasonType.REGULAR, season, reload = true)
        getPlayerStats(SeasonType.POST, season, reload = true)
        getGoalieStats(SeasonType.REGULAR, season, reload = true)
        getGoalieStats(SeasonType.POST, season, reload = true)
        getSchedule(season, reload = true)
        getPlayoffs(season, reload = true)
        getDetailedTeamStats(season, reload = true)
    }

    fun getAvailableSeasonsInfo(): List<AvailableSeason> {
        if (availableSeasons.isEmpty()) {
            availableSeasons = api.getSeasons(leagueType.apiId).execute().body()!!
        }
        return availableSeasons.filter { it.season > 0 }
    }

    fun getStandings(season: Int? = null, reload: Boolean = false): List<TeamStats> {
        val teamInfosById = getTeamInfos(season).associateBy { it.id }
        return getData(standings, season, reload) {
            api.getStandings(leagueId, it)
        }.onEach {
            it.teamInfoResponse = teamInfosById[it.id]!!
        }
    }

    fun getConferences(season: Int? = null, reload: Boolean = false): List<LeagueConference> {
        return getData(conferences, season, reload) {
            api.getConferences(leagueId, it)
        }
    }

    fun getDetailedTeamStats(season: Int? = null, reload: Boolean = false): List<DetailedTeamStats> {
        return getData(detailedTeamStats, season, reload) {
            api.getDetailedTeamStats(leagueId, it)
        }
    }

    fun getTeamInfos(season: Int? = null, reload: Boolean = false): List<TeamInfoResponse> {
        return getData(teamInfos, season, reload) {
            api.getTeams(leagueId, it)
        }
    }

    fun getDivisions(season: Int? = null, reload: Boolean = false): List<LeagueDivision> {
        return getData(divisions, season, reload) {
            api.getDivisions(leagueId, it)
        }
    }

    fun getPlayoffs(season: Int? = null, reload: Boolean = false): List<List<PlayoffSeries>> {
        return getData(playoffs, season, reload) {
            api.getPlayoffs(leagueId, it)
        }.onEach { series ->
            val teamInfosById = getTeamInfos(season).associateBy { it.id }
            series.forEach {
                it.team1.teamInfo = teamInfosById[it.team1.id]
                it.team2.teamInfo = teamInfosById[it.team2.id]
            }
        }
    }

    fun getStats(seasonType: SeasonType, season: Int? = null, isGoalie: Boolean = false): List<BasePlayerStats> {
        return if (isGoalie) {
            getGoalieStats(seasonType, season)
        } else {
            getPlayerStats(seasonType, season)
        }
    }

    fun getPlayerStats(seasonType: SeasonType, season: Int? = null, reload: Boolean = false): List<PlayerStats> {
        playerStats.putIfAbsent(seasonType, mutableMapOf())
        val map = playerStats[seasonType]!!
        val teamsByName = getTeamInfos(season, reload).associateBy { it.abbreviation }
        return getData(map, season, reload) {
            api.getPlayerStats(leagueId, it, seasonType.apiName)
        }.onEach {
            it.seasonType = seasonType
            it.teamId = teamsByName[it.team]!!.id
        }
    }

    fun getGoalieStats(seasonType: SeasonType, season: Int? = null, reload: Boolean = false): List<GoalieStats> {
        goalieStats.putIfAbsent(seasonType, mutableMapOf())
        val map = goalieStats[seasonType]!!
        val teamsByName = getTeamInfos(season, reload).associateBy { it.abbreviation }
        return getData(map, season, reload) {
            api.getGoalieStats(leagueId, it, seasonType.apiName)
        }.onEach {
            it.seasonType = seasonType
            it.teamId = teamsByName[it.team]!!.id
        }
    }

    fun getSchedule(season: Int? = null, reload: Boolean = false): List<GameInfo> {
        val regGames = getSchedule(SeasonType.REGULAR, season, reload)
        val allGames = linkedMapOf<String, GameInfo>()
        regGames.forEach { allGames[it.slug] = it }
        val postGames = getSchedule(SeasonType.POST, regGames.firstOrNull()?.season ?: season, reload)
        postGames.forEach {
            allGames[it.slug] = it
        }
        return allGames.values.sortedBy { it.timestamp }
    }

    private fun getSchedule(seasonType: SeasonType, season: Int? = null, reload: Boolean = false): List<GameInfo> {
        schedule.putIfAbsent(seasonType, mutableMapOf())
        val map = schedule[seasonType]!!
        val teamInfos = getTeamInfos(season).associateBy { it.id }
        return getData(map, season, reload) {
            api.getSchedule(leagueId, it, seasonType.apiName)
        }.onEach {
            it.awayTeamInfo = teamInfos[it.awayTeam]
            it.homeTeamInfo = teamInfos[it.homeTeam]
            it.seasonType = seasonType
        }.filter { it.type != "Pre-Season" }
    }

    private fun <T> getData(
        map: MutableMap<Int, List<T>>,
        _season: Int? = null,
        reload: Boolean = false,
        apiCall: (season: Int) -> Call<List<T>>,
    ): List<T> {
        val season = resolveSeason(_season)
        if (season < 53) {
            return emptyList()
        }
        var result = map[season]
        if (result == null || reload) {
            val call = apiCall(season)
            println("Fetching `${call.request().url}`")
            result = call.execute().body()?.also {
                map[season] = it
            }
        }

        if (result.isNullOrEmpty() && _season == null && season > 1) {
            return getData(map, season - 1, reload, apiCall)
        }

        return result ?: throw SeasonNotAvailableException()
    }

    private fun resolveSeason(season: Int?) = season ?: DynamicConfigRepository.config.currentSeason

    companion object {
        fun get(teamInfo: TeamInfo) = get(teamInfo.leagueType)

        fun get(leagueType: LeagueType): IndexApiClient {
            return when (leagueType) {
                LeagueType.SHL -> ShlIndexApiClient
                LeagueType.SMJHL -> SmjhlIndexApiClient
                LeagueType.IIHF -> IihfIndexApiClient
                LeagueType.WJC -> WjcIndexApiClient
            }
        }

        fun isUpdateTrigger(event: MessageReceivedEvent, config: BuildTypeConfig): Boolean {
            if (event.guild.id != config.indexUpdateServerId || event.channel.id != config.indexUpdateChannelId) {
                return false
            }

            if (!event.message.contentDisplay.matches("Index Updated - Season: \\d+.*".toRegex())) {
                return false
            }

            //Index Updated - Season: 59 League: shl - https://index.simulationhockey.com/shl
            val groups = "Index Updated - Season: (?<season>\\d+) League: (?<league>\\w+).*".toRegex()
                .matchEntire(event.message.contentDisplay)
                ?.groups
            val season = groups?.get(1)?.value?.toIntOrNull()
            val league = try {
                LeagueType.valueOf(groups?.get(2)?.value?.toUpperCase() ?: "")
            } catch (e: Exception) {
                null
            }

            println("Received index update message: league = $league, season = $season")

            if (league != null) {
                get(league).reload(season)
            } else {
                ShlIndexApiClient.reload(season)
                SmjhlIndexApiClient.reload(season)
            }

            return true
        }
    }
}

object ShlIndexApiClient : IndexApiClient(LeagueType.SHL)
object SmjhlIndexApiClient : IndexApiClient(LeagueType.SMJHL)
object IihfIndexApiClient : IndexApiClient(LeagueType.IIHF)
object WjcIndexApiClient : IndexApiClient(LeagueType.WJC)

class SeasonNotAvailableException: Exception()