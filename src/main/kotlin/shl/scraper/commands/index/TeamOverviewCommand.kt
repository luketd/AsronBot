package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.index.GameResult
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.PlayerStats
import shl.scraper.index.SeasonType
import shl.scraper.util.afterDecimal
import shl.scraper.util.appendEmoji
import shl.scraper.util.toDisplayString

class TeamOverviewCommand : BaseIndexCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val season = arguments.getSeason()
        val seasonType = if (event.message.contentDisplay.matches("(?i)!(t|team)r.*".toRegex())) {
            SeasonType.REGULAR
        } else {
            null
        }

        return withTeamInfoEmbed(event, arguments, if (season != null) 1 else 0) { teamInfo ->
            val teamStats = LeagueIndexRepository.getTeamStats(teamInfo, season)
            val schedule = LeagueIndexRepository.getSchedule(teamInfo, season)
            val playerStats = LeagueIndexRepository.getPlayerStatsForTeam(teamInfo, seasonType, season)

            BaseEmbedBuilder(teamColor = teamInfo, logoUrl = teamInfo.logoUrl).apply {
                setTitle(teamInfo.fullName)

                setInfo(playerStats.firstOrNull()?.season, playerStats.firstOrNull()?.seasonType, "!tr")

                if (teamStats != null) {
                    addField("Regular season", inline = true) { builder ->
                        builder.append("\nRecord: ${teamStats.wins}-${teamStats.losses}-${teamStats.otl}")
                        builder.append("\nHome: ${teamStats.home.wins}-${teamStats.home.losses}-${teamStats.home.otl}")
                        builder.append("\nAway: ${teamStats.away.wins}-${teamStats.away.losses}-${teamStats.away.otl}")
                    }

                    addField(inline = true) { builder ->
                        builder.append("\nDivision: ${(teamStats.divisionPosition + 1).toDisplayString()}")
                        builder.append("\nConference: ${(teamStats.conferencePosition + 1).toDisplayString()}")
                        builder.append("\nLeague: ${(teamStats.leaguePosition + 1).toDisplayString()}")
                    }

                    addField(inline = true) { builder ->
                        builder.append("\nGF: ${teamStats.goalsPerGame.afterDecimal(2)}")
                        builder.append(" (${(teamStats.goalsForRank + 1).toDisplayString()})")
                        builder.append("\nGA: ${teamStats.goalsAgainstPerGame.afterDecimal(2)}")
                        builder.append(" (${(teamStats.goalsAgainstRank + 1).toDisplayString()})")

                        var streakType: GameResult? = null
                        var streak = 0

                        for (i in schedule.completedGames.indices.reversed()) {
                            val game = schedule.completedGames[i]
                            when (streakType) {
                                null -> {
                                    streakType = schedule.getResult(game)
                                    if (streakType == null) {
                                        break
                                    }
                                    streak = 1
                                }

                                schedule.getResult(game) -> {
                                    streak++
                                }

                                else -> {
                                    break
                                }
                            }
                        }

                        if (streak > 0 && streakType != null) {
                            builder.append("\nStreak: ${streakType.shortName}$streak")
                        }
                    }

                    val detailedStats = teamStats.detailedStats
                    if (detailedStats != null) {
                        addField(inline = true) { builder ->
                            builder.append("\nSF: ${detailedStats.shotsForPerGame.afterDecimal(2)}")
                            builder.append(" (${(teamStats.shotsForRank + 1).toDisplayString()})")

                            builder.append("\nSA: ${detailedStats.shotsAgainstPerGame.afterDecimal(2)}")
                            builder.append(" (${(teamStats.shotsAgainstRank + 1).toDisplayString()})")

                            builder.append("\nDiff: ${detailedStats.shotDiff.afterDecimal(2)}")
                            builder.append(" (${(teamStats.shotDiffRank + 1).toDisplayString()})")
                        }

                        addField(inline = true) { builder ->
                            builder.append("\nPIM: ${detailedStats.penaltyMinutesPerGame.afterDecimal(2)}")
                            builder.append(" (${(teamStats.pimsRank + 1).toDisplayString()})")

                            builder.append("\nPP: ${detailedStats.ppPercentage.afterDecimal(1)}%")
                            builder.append(" (${(teamStats.ppRank + 1).toDisplayString()})")

                            builder.append("\nPK: ${detailedStats.pkPercentage.afterDecimal(1)}%")
                            builder.append(" (${(teamStats.pkRank + 1).toDisplayString()})")
                        }
                    }

                    if (teamStats.pdo != null && teamStats.corsi != null) {
                        addField(inline = true) { builder ->
                            builder.append("\nCF: ${teamStats.corsi?.afterDecimal(2)}")
                            builder.append(" (${(teamStats.corsiRank + 1).toDisplayString()})")

                            builder.append("\nPDO: ${teamStats.pdo?.afterDecimal(2)}")
                            builder.append(" (${(teamStats.pdoRank + 1).toDisplayString()})")
                        }
                    }
                }



                if (schedule.completedGames.isNotEmpty()) {
                    addField("Last 10 games") { builder ->
                        schedule.completedGames.takeLast(10).forEach { game ->
                            schedule.getResult(game)?.emojiName?.let {
                                builder.appendEmoji(event, it)
                            }
                        }
                        builder.append(".")
                    }
                }

                if (playerStats.isNotEmpty()) {
                    appendCategoryLeaders("Points", playerStats) { it.points }
                    appendCategoryLeaders("Goals", playerStats) { it.goals }
                    appendCategoryLeaders("Assists", playerStats) { it.assists }
                    appendCategoryLeaders("Shots on goal", playerStats) { it.shotsOnGoal }
                    appendCategoryLeaders("Hits", playerStats) { it.hits }
                    appendCategoryLeaders("Blocks", playerStats) { it.shotsBlocked }
                }
            }
        }
    }

    private fun BaseEmbedBuilder.appendCategoryLeaders(
        name: String, players: List<PlayerStats>,
        selector: (PlayerStats) -> Int
    ) {
        addField(name, inline = true) { builder ->
            players.sortedByDescending(selector).take(3).forEach { player ->
                builder.append("\n${player.name} (${selector(player)})")
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(t|team)r?(\\s+.*)?".toRegex()
    }

}