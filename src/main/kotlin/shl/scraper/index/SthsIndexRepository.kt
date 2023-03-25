package shl.scraper.index

import shl.scraper.roster.TeamInfo
import shl.scraper.util.afterDecimal
import java.io.File
import kotlin.math.roundToInt

object SthsIndexRepository {

    private val franchises = mapOf(
        42 to "ATL",
        6 to "BAP",
        13 to "BUF",
        9 to "CGY",
        37 to "CHI",
        3 to "EDM",
        7 to "HAM",
        11 to "LAP",
        4 to "MAN",
        2 to "MIN",
        12 to "NEW",
        19 to "DET",
        38 to "NOL",
        16 to "COL",
        15 to "ANC",
        21 to "KEL",
        24 to "ANH",
        8 to "SFP",
        5 to "TBB",
        1 to "TEX",
        10 to "TOR",
        17 to "VAN",
        20 to "STL",
        41 to "SEA",
        14 to "WPG",
        2 to "MIN",
        18 to "MET",
        23 to "NL",
        43 to "NBB",
        44 to "QCC"
    )
    private val franchiseIdByTeamIdMap = mapOf(
        1 to 1, 2 to 2, 64 to 2, 3 to 3, 38 to 3, 4 to 4, 5 to 5, 37 to 5, 39 to 5, 40 to 5, 44 to 5, 6 to 6, 61 to 6,
        7 to 7, 8 to 8, 42 to 8, 9 to 9, 10 to 10, 11 to 11, 12 to 12, 41 to 12, 13 to 13, 14 to 14, 19 to 15, 46 to 15,
        49 to 15, 18 to 16, 51 to 16, 17 to 17, 52 to 18, 65 to 18, 15 to 19, 50 to 20, 21 to 21, 22 to 22, 48 to 22,
        23 to 23, 66 to 23, 24 to 24, 25 to 25, 26 to 26, 56 to 27, 28 to 28, 29 to 29, 30 to 30, 31 to 31, 32 to 32,
        33 to 33, 34 to 34, 35 to 35, 36 to 36, 43 to 37, 45 to 38, 53 to 39, 54 to 40, 62 to 41, 63 to 42, 67 to 43,
        68 to 44
    )

    private val allPlayerStats: List<PlayerStats>
    val allPlayerStatsFixed: List<PlayerStats>
    private val allGoalieStats: List<GoalieStats>
    val allGoalieStatsFixed: List<GoalieStats>

    init {
        allGoalieStats = File("storage/goalies.csv").readLines().mapIndexedNotNull { index, line ->
            if (index == 0) {
                return@mapIndexedNotNull null
            }
            val parts = line.split(",")

            GoalieStats(
                id = parts[2].toIntOrNull() ?: 0,
                sthsId = parts[1].toIntOrNull() ?: 0,
                name = parts[3],
                league = parts[4].toInt() - 1,
                season = parts[7].toInt(),
                team = franchises[franchiseIdByTeamIdMap[parts[5].toIntOrNull()]].orEmpty(),
                gamesPlayed = parts[9].toInt(),
                minutes = parts[13].toDouble().roundToInt(),
                wins = parts[10].toInt(),
                losses = parts[11].toInt(),
                ot = parts[12].toInt(),
                shotsAgainst = parts[17].toInt(),
                saves = parts[17].toInt() - parts[16].toInt(),
                goalsAgainst = parts[16].toInt(),
                gaa = 60.0 * (parts[16].toInt().toDouble() / parts[13].toDouble().roundToInt()),
                shutouts = parts[15].toInt(),
                savePct = ((parts[17].toInt() - parts[16].toInt()).toFloat() / parts[17].toInt()).afterDecimal(3),
                seasonType = if (parts[8].toInt() > 0) SeasonType.POST else SeasonType.REGULAR
            )
        }.filter { it.season < 53 && it.league < 2 } // shl and smjhl seasons from sths

        val goalieMapById = mutableMapOf<Int, MutableMap<String, GoalieStats>>()
        allGoalieStats.filter { it.sthsId != null }.forEach { stats ->
            goalieMapById.putIfAbsent(stats.sthsId!!, mutableMapOf())
            val mapBySeason = goalieMapById[stats.sthsId]!!
            val key = "${stats.season}${stats.seasonType}${stats.league}"

            val prevSeason = mapBySeason[key]
            val team = prevSeason?.team?.takeIf { it.isNotBlank() } ?: stats.team
            when {
                prevSeason == null -> {
                    mapBySeason[key] = stats
                }

                prevSeason.gamesPlayed >= stats.gamesPlayed -> {
                    mapBySeason[key] = prevSeason.copy(team = team)
                }

                else -> {
                    mapBySeason[key] = stats.copy(team = team)
                }
            }
        }

        allGoalieStatsFixed = goalieMapById.values.map { it.values }.flatten().map { stats ->
            val teamId = TeamInfo.find(stats.team)?.let { TeamIdRepository.requireFhmTeamId(it) }
            stats.copy(teamId = teamId ?: 0)
        }

        allPlayerStats = File("storage/seasons.csv").readLines().mapIndexedNotNull { index, line ->
            if (index == 0) {
                return@mapIndexedNotNull null
            }
            val parts = line.split(",")

            PlayerStats(
                id = parts[2].toIntOrNull() ?: 0,
                sthsId = parts[1].toIntOrNull() ?: 0,
                name = parts[3],
                league = parts[4].toInt() - 1,
                position = "", // position is unknown
                team = franchises[parts[0].toIntOrNull()].orEmpty(),
                season = parts[7].toInt(),
                seasonType = if (parts[8].toInt() > 0) SeasonType.POST else SeasonType.REGULAR,
                gamesPlayed = parts[9].toInt(),
                goals = parts[10].toInt(),
                assists = parts[11].toInt(),
                points = parts[12].toInt(),
                plusMinus = parts[13].toInt(),
                pim = parts[14].toInt(),
                hits = parts[16].toInt(),
                shotsOnGoal = parts[18].toInt(),
                shotsBlocked = parts[21].toInt(),
                ppGoals = parts[23].toIntOrNull() ?: 0,
                ppPoints = parts[25].toIntOrNull(),
                gwg = parts[33].toIntOrNull(),
                fightLosses = parts[41].toIntOrNull() ?: 0,
                fightWins = parts[40].toIntOrNull() ?: 0,
                fights = (parts[41].toIntOrNull() ?: 0) + (parts[40].toIntOrNull() ?: 0) + (parts[42].toIntOrNull()
                    ?: 0),
                shAssists = parts[29].toIntOrNull() ?: 0,
                shGoals = parts[28].toIntOrNull() ?: 0,
                shPoints = parts[30].toIntOrNull() ?: 0,
                timeOnIce = (parts[22].toDoubleOrNull()?.roundToInt() ?: 0) * 60,
                ppTimeOnIce = (parts[27].toDoubleOrNull()?.roundToInt() ?: 0) * 60,
                shTimeOnIce = (parts[32].toDoubleOrNull()?.roundToInt() ?: 0) * 60,
                faceoffs = parts[35].toIntOrNull(),
                faceoffWins = parts[43].toIntOrNull()
            )
        }.filter { it.season < 53 && it.league < 2 } // shl and smjhl seasons from sths

        val mapById = mutableMapOf<Int, MutableMap<String, PlayerStats>>()
        allPlayerStats.filter { it.sthsId != null }.forEach { stats ->
            mapById.putIfAbsent(stats.sthsId!!, mutableMapOf())
            val mapBySeason = mapById[stats.sthsId]!!
            val key = "${stats.season}${stats.seasonType}${stats.league}"

            val prevSeason = mapBySeason[key]
            val team = prevSeason?.team?.takeIf { it.isNotBlank() } ?: stats.team
            when {
                prevSeason == null -> {
                    mapBySeason[key] = stats
                }

                prevSeason.gamesPlayed >= stats.gamesPlayed -> {
                    mapBySeason[key] = prevSeason.copy(team = team)
                }

                else -> {
                    mapBySeason[key] = stats.copy(team = team)
                }
            }
        }

        allPlayerStatsFixed = mapById.values.map { it.values }.flatten().map { stats ->
            val teamId = TeamInfo.find(stats.team)?.let { TeamIdRepository.requireFhmTeamId(it) }
            stats.copy(teamId = teamId ?: 0)
        }

    }

    fun getAllStats(isGoalie: Boolean) = if (isGoalie) allGoalieStatsFixed else allPlayerStatsFixed

}