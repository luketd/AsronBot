package shl.scraper.fantasy

import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.PlayerStats
import shl.scraper.index.SeasonType
import shl.scraper.roster.TeamInfo

object LeagueIndexFantasyRepository {

    fun getGroup(number: Int, cacheOnly: Boolean = true): FantasyGroup? {
        val fromSheets = GoogleSheetsFantasyRepository.getGroup(number, cacheOnly) ?: return null

        var teams = fromSheets.teams.map { team ->
            team.copy(scoreDouble = getRoster(number, team.name, cacheOnly)?.totalScore ?: team.scoreDouble)
        }.sortedByDescending { it.scoreDouble }
        teams = teams.map { it.copy(paceDouble = it.scoreDouble - teams[0].scoreDouble) }

        return fromSheets.copy(teams = teams)
    }

    fun getGlobal(cacheOnly: Boolean = true): List<FantasyTeam> {
        val result = mutableListOf<FantasyTeam>()
        for (i in 1..40) {
            result.addAll(getGroup(i, cacheOnly)?.teams ?: emptyList())
        }

        return result.sortedByDescending { it.scoreDouble }
    }

    fun getRoster(groupNumber: Int, teamName: String?, cacheOnly: Boolean = true): FantasyRoster? {
        val fromSheet = GoogleSheetsFantasyRepository.getRoster(groupNumber, teamName, cacheOnly) ?: return null

        val indexPlayers = fromSheet.players.map { player ->
            matchFantasyPlayer(player, cacheOnly)
        }

        val skaterSwap = matchSwap(fromSheet.skaterSwap, cacheOnly)
        val goalieSwap = matchSwap(fromSheet.goalieSwap, cacheOnly)

        val totalScore =
            indexPlayers.sumByDouble { it.fantasyPoints } + (skaterSwap?.gained ?: 0.0) + (goalieSwap?.gained ?: 0.0)

        return fromSheet.copy(
            players = indexPlayers,
            skaterSwap = skaterSwap,
            goalieSwap = goalieSwap,
            totalScore = totalScore
        )
    }

    private fun matchSwap(swap: FantasySwap?, cacheOnly: Boolean): FantasySwap? {
        return swap?.copy(
            dropCurrent = matchFantasyPlayer(swap.dropCurrent, cacheOnly),
            addCurrent = matchFantasyPlayer(swap.addCurrent, cacheOnly)
        )
    }

    fun getGoalies(season: Int?): List<FantasyPlayer> {
        return LeagueIndexRepository.getGoalieStats(LeagueType.SHL, SeasonType.REGULAR, season).groupBy {
            it.team
        }.map { (name, goalies) ->
            val score = 5 * goalies.sumBy { it.wins } + 5 * goalies.sumBy { it.shutouts } + 0.1 * goalies.sumBy { it.saves }
            FantasyPlayer("G", TeamInfo.find(name)?.fullName ?: name, score)
        }
    }

    private fun matchFantasyPlayer(player: FantasyPlayer, cacheOnly: Boolean): FantasyPlayer {
        val fantasyPoints = if (player.position.equals("Goalie", ignoreCase = true)) {
            val team = TeamInfo.find(player.name)
            if (team != null) {
                val goalies = LeagueIndexRepository.getGoalieStats(LeagueType.SHL, SeasonType.REGULAR, season = null)
                    .filter { stats ->
                        TeamInfo.find(stats.team) == team
                    }

                5 * goalies.sumBy { it.wins } + 5 * goalies.sumBy { it.shutouts } + 0.1 * goalies.sumBy { it.saves }
            } else {
                player.fantasyPoints
            }
        } else {
            val indexPlayer = LeagueIndexRepository.getPlayerStats(
                LeagueType.SHL, SeasonType.REGULAR, season = null
            ).find {
                    it.name.equals(player.name, ignoreCase = true) ||
                            it.name.replace("  ", " ").equals(player.name, ignoreCase = true)
                }
            if (indexPlayer is PlayerStats) {
                indexPlayer.fantasyPoints
            } else {
                player.fantasyPoints
            }
        }

        return player.copy(fantasyPoints = fantasyPoints)
    }
}