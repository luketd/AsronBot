package shl.scraper.fantasy

import shl.scraper.config.*
import shl.scraper.util.toDoubleOrNullWithComma
import kotlin.math.abs

object GoogleSheetsFantasyRepository {
    fun getGroup(userName: String): FantasyGroup? {
        for (i in 0..40) {
            val group = getGroup(i)
            if (group?.hasUser(userName) == true) {
                return group
            }
        }

        return null
    }

    fun getGroup(number: Int, cacheOnly: Boolean = true): FantasyGroup? {
        val values = fetchRows(FANTASY_INDEX_RANGE, cacheOnly)

        var currentRow = 0
        var currentColumn = 0
        values.forEachIndexed search@{ rowIndex, any ->
            (any as? List<Any>)?.forEachIndexed { colIndex, cell ->
                if ((cell as? String)?.matches("(?i).*group\\s+$number\\s*".toRegex()) == true) {
                    currentRow = rowIndex
                    currentColumn = colIndex
                    return@search
                }
            }
        }

        if (currentColumn == 0 && currentRow == 0) {
            return null
        }

        val teams = mutableListOf<FantasyTeam>()
        for (i in 2..9) {
            val row = values[currentRow + i] as List<String>
            val name = row[currentColumn + 1]
            val score = row[currentColumn + 2].toDoubleOrNullWithComma()
            val pace = row[currentColumn + 3].toDoubleOrNullWithComma()
            teams.add(FantasyTeam(name, score, pace))
        }
        return FantasyGroup(number, teams)
    }

    fun getGlobal(cacheOnly: Boolean = true): List<FantasyTeam> {
        val values = fetchRows(FANTASY_GLOBAL_RANGE, cacheOnly)
        return values.map { row ->
            val cols = row as List<String>
            FantasyTeam(cols[0], cols[1].toDoubleOrNullWithComma(), 0.0)
        }
    }

    fun getRoster(groupNumber: Int, teamName: String?, cacheOnly: Boolean = true): FantasyRoster? {
        if (teamName.isNullOrEmpty()) {
            return null
        }

        return getRosters(groupNumber, cacheOnly).find { it.teamName.equals(teamName, ignoreCase = true) }
    }

    private fun getRosters(groupNumber: Int, cacheOnly: Boolean = true): List<FantasyRoster> {
        val rows = fetchRows(FANTASY_TEAM_RANGE_FORMAT.format(groupNumber), cacheOnly)

        val rosters = mutableListOf<FantasyRoster>()
        for (i in 0 until 8) {
            rosters.add(parseRoster(rows, i * 19))
        }

        return rosters
    }

    private fun parseRoster(rows: List<Any>, rowOffset: Int): FantasyRoster {
        fun parsePlayer(row: Any): FantasyPlayer {
            val cols = row as List<String>
            val position = cols[0]
            val playerName = cols[1]
            val fantasyPoints = cols[19].toDoubleOrNullWithComma()
            return FantasyPlayer(position, playerName, fantasyPoints)
        }

        fun parseSwap(rows: List<Any>, rowOffset: Int, position: String = ""): FantasySwap? {
            val dropCurrent = parsePlayer(rows[rowOffset]).copy(position = position)
            val dropFinal = parsePlayer(rows[rowOffset + 1]).copy(position = position, name = dropCurrent.name)
            val addCurrent = parsePlayer(rows[rowOffset + 2]).copy(position = position)
            val addMinus = parsePlayer(rows[rowOffset + 3]).copy(position = position, name = addCurrent.name)

            return if (dropCurrent.name != FANTASY_NO_SWAP_NAME && dropCurrent.fantasyPoints > 0
                && addCurrent.name != FANTASY_NO_SWAP_NAME && addCurrent.fantasyPoints > 0
            ) {
                FantasySwap(dropCurrent, dropFinal, addCurrent, addMinus)
            } else {
                null
            }
        }

        val teamName = (rows[rowOffset] as List<String>)[1]

        val players = mutableListOf<FantasyPlayer>()
        for (i in 1..6) {
            players.add(parsePlayer(rows[rowOffset + i]))
        }

        val skaterSwap = parseSwap(rows, rowOffset + 8)
        val goalieSwap = parseSwap(rows, rowOffset + 13, "Goalie")

        val totalFantasyPoints = (rows[rowOffset + 17] as List<String>)[19].toDoubleOrNullWithComma()

        return FantasyRoster(teamName, players, skaterSwap, goalieSwap, totalFantasyPoints)
    }

    fun getCategoryStandings(cacheOnly: Boolean = true): List<FantasyCategoryStandings> {
        fun parseCategory(rows: List<Any>, colOffset: Int): FantasyCategoryStandings {
            val categoryName = (rows[0] as List<String>)[colOffset + 1]
            val teams = rows.filterIndexed { index, _ -> index > 1 }.mapIndexed { index, row ->
                val cols = row as List<String>
                val rank = index + 1
                val teamName = cols[colOffset + 1]
                val score = cols[colOffset + 2]
                val groupNumber = cols[colOffset + 3].toIntOrNull() ?: 0
                FantasyCategoryTeam(rank, teamName, score, groupNumber)
            }

            return FantasyCategoryStandings(categoryName, teams)
        }

        val rows = fetchRows(FANTASY_CATEGORIES_RANGE, cacheOnly)

        val result = mutableListOf<FantasyCategoryStandings>()
        for (i in 0..4) {
            result.add(parseCategory(rows, i * 5))
        }

        return result
    }

    fun updateCache(force: Boolean = false) {
        val prevGlobal = getGlobal(cacheOnly = true).sumByDouble { it.scoreDouble }
        val updGlobal = getGlobal(cacheOnly = false).sumByDouble { it.scoreDouble }
        println("Fantasy global update check: $prevGlobal -> $updGlobal")
        if (abs(prevGlobal - updGlobal) > 1 || force) {
            println("reading fantasy sheet")
            getGroup(1, cacheOnly = false)
            getCategoryStandings(cacheOnly = false)
            for (i in 1..40) {
                getRosters(i, cacheOnly = false)
            }
        }
    }

    private fun fetchRows(sheetRange: String, cacheOnly: Boolean): List<Any> {
        return GoogleSheetsRepository.getValues(DynamicConfigRepository.config.fantasySheetId, sheetRange, cacheOnly)
    }
}