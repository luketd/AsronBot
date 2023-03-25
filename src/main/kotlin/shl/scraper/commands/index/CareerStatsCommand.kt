package shl.scraper.commands.index

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.index.*
import shl.scraper.util.afterDecimal

class CareerStatsCommand : BaseIndexCommand() {

    override fun buildResponseArray(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): List<String> {
        val name = arguments.getName(event)
            ?: return listOf("Couldn't find your player name, try to !store your player or use !career [name]")

        val career = LeagueIndexRepository.getCareerStats(name)
        return when {
            career?.isGoalie == true -> {
                listOf(
                    buildGoalie(career, "Regular season", SeasonType.REGULAR) { it.regular as? GoalieStats },
                    buildGoalie(career, "Playoffs", SeasonType.POST) { it.playoffs as? GoalieStats },
                ).flatten()
            }
            career != null -> {
                listOf(
                    buildSkater(career, "Regular season", SeasonType.REGULAR) { it.regular as? PlayerStats },
                    buildSkater(career, "Playoffs", SeasonType.POST) { it.playoffs as? PlayerStats },
                ).flatten()
            }
            else -> {
                return listOf("Player `$name` not found")
            }
        }
    }

    private fun buildSkater(
        career: CareerStats,
        type: String,
        seasonType: SeasonType,
        picker: (CareerStats.Season) -> PlayerStats?
    ): List<String> {
        val chunks = career.seasons.chunked(15)
        return chunks.mapIndexed { chunkIndex, chunk ->
            buildString {
                append("```")
                if (chunkIndex == 0) {
                    append("\n${career.name}")
                    if (career.position.isNotEmpty()) {
                        append(" - ${career.position}")
                    }
                    append("\n\n$type\n")
                }

                chunk.forEachIndexed { index, season ->
                    val prevSeason = career.seasons.getOrNull(chunkIndex * 15 + index - 1)
                    if (index > 0 && season.leagueType != prevSeason?.leagueType) {
                        appendTotals(createPlayerTotals(career, career.seasons[index - 1].leagueType, seasonType))
                        append("\n\n-----\n")
                    }

                    val stats = picker(season)
                    val prevStats = prevSeason?.let(picker)
                    if (seasonType == SeasonType.REGULAR && index > 0 && stats != null &&
                        prevStats != null && stats.isDefenseman != prevStats.isDefenseman &&
                                prevStats.position.isNotEmpty() && stats.position.isNotEmpty()
                    ) {
                        append("\n*Position change")
                        if (stats.isDefenseman) {
                            append(" (F --> D)")
                        } else {
                            append(" (D --> F)")
                        }
                    }

                    appendSeason(season.season, picker(season))
                }
                if (career.seasons.isNotEmpty() && chunks.lastIndex == chunkIndex) {
                    appendTotals(createPlayerTotals(career, career.seasons.last().leagueType, seasonType))
                }

                append("```")
            }
        }
    }

    private fun createPlayerTotals(career: CareerStats, leagueType: LeagueType, seasonType: SeasonType): PlayerStats {
        var result = PlayerStats()
        career.seasons.filter { it.leagueType == leagueType }.mapNotNull {
            if (seasonType == SeasonType.POST) it.playoffs else it.regular
        }.forEach {
            result += it as PlayerStats
        }
        return result
    }

    private fun StringBuilder.appendTotals(stats: PlayerStats) {
        if (stats.gamesPlayed <= 0) {
            return
        }
        append("\n")
        append("Totals".pad(7))

        with(stats) {
            append(" | ${gamesPlayed.pad(4)} | ${goals.pad(3)} | ${assists.pad(3)}")
            append(" | ${points.pad(3)}${if (points >= 1000) "" else " "}| ${plusMinusDisplay.pad(4)} | ${shotsOnGoal.pad(6)}")
            append(" | ${shootingPercentage.afterDecimal(2).pad(8)}")
            append(" | ${ppPoints?.pad(5) ?: "-"} | ${hits.pad(6)} | ${shotsBlocked.pad(6)}")
            append(" | ${pim.pad(3)}")
        }
    }

    private fun createGoalieTotals(career: CareerStats, leagueType: LeagueType, seasonType: SeasonType): GoalieStats {
        var result = GoalieStats()
        career.seasons.filter { it.leagueType == leagueType }.mapNotNull {
            if (seasonType == SeasonType.POST) it.playoffs else it.regular
        }.forEach {
            result += it as GoalieStats
        }
        return result
    }

    private fun StringBuilder.appendTotals(stats: GoalieStats) {
        if (stats.gamesPlayed <= 0) {
            return
        }
        append("\n")
        append("Totals".pad(7))

        with(stats) {
            append(" | ${gamesPlayed.pad(5)} | ${wins.pad(4)} | ${losses.pad(4)} | ${ot.pad(6)}")
            append(" | ${gaa.afterDecimal(2).pad(8)} | .${(savePct.split(".").getOrNull(1) ?: "").pad(7)}")
            append(" | ${shotsAgainstPerGame.afterDecimal(2).pad(9)}")
            append(" | $shutouts")
        }
    }

    private fun StringBuilder.appendSeason(season: Int, stats: PlayerStats?) {
        append("\nS${season.pad(2)}")
        if (stats == null) {
            append(": -")
            return
        }
        with(stats) {
            append(" ${team.pad(3)} | ${gamesPlayed.pad(2)}GP | ${goals.pad(2)}G | ${assists.pad(2)}A")
            append(" | ${points.pad(2)}P${if (points >= 100) "" else " "}| ${plusMinusDisplay.pad(4)} | ${shotsOnGoal.pad(3)}sog")
            append(" | ${shootingPercentage.afterDecimal(2).pad(5)}sh%")
            append(" | ${ppPoints?.pad(2) ?: "--"}ppp | ${hits.pad(3)}hit | ${shotsBlocked.pad(3)}blk")
            append(" | ${pim.pad(3)}pim")
        }
    }

    private fun buildGoalie(
        career: CareerStats,
        type: String,
        seasonType: SeasonType,
        picker: (CareerStats.Season) -> GoalieStats?
    ): List<String> {
        val chunkSize = 18
        val chunks = career.seasons.chunked(chunkSize)
        return chunks.mapIndexed { chunkIndex, chunk ->
            buildString {
                append("```")
                if (chunkIndex == 0) {
                    append("\n${career.name} - G")
                    append("\n\n$type\n")
                }

                chunk.forEachIndexed { index, season ->
                    val prevSeason = career.seasons.getOrNull(chunkIndex * chunkSize + index - 1)

                    if (index > 0 && season.leagueType != prevSeason?.leagueType) {
                        appendTotals(createGoalieTotals(career, career.seasons[index - 1].leagueType, seasonType))
                        append("\n\n-----\n")
                    }
                    appendGoalieSeason(season.season, picker(season))
                }
                if (career.seasons.isNotEmpty() && chunks.lastIndex == chunkIndex) {
                    appendTotals(createGoalieTotals(career, career.seasons.last().leagueType, seasonType))
                }

                append("```")
            }
        }
    }

    private fun StringBuilder.appendGoalieSeason(season: Int, stats: GoalieStats?) {
        append("\nS$season")
        if (stats == null) {
            append(": -")
            return
        }

        with(stats) {
            append(" ${team.pad(3)} | ${gamesPlayed.pad(2)} GP | ${wins.pad(3)}W | ${losses.pad(3)}L | ${ot.pad(3)}OTL")
            append(" | ${gaa.afterDecimal(2)} GAA | .${savePct.split(".").getOrNull(1) ?: ""} SV%")
            append(" | ${shotsAgainstPerGame.afterDecimal(2)} SAA")
            append(" | ${shutouts.pad(2)} SO")
        }
    }

    private fun String.pad(n: Int) = padEnd(n, '\u00A0')

    private fun Int.pad(n: Int) = this.toString().padEnd(n, '\u00A0')

    override fun commandNameRegex(): Regex {
        return "(?i)!career(\\s+.*)?".toRegex()
    }

}
