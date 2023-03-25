package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.index.LeagueType
import shl.scraper.roster.RosterPlayer
import shl.scraper.roster.RosterRepository
import shl.scraper.util.afterDecimal

class RosterCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        return withTeamInfoEmbed(event, arguments) { team ->
            val roster = RosterRepository.getRoster(team)
            val currentSeason = DynamicConfigRepository.config.currentSeason

            BaseEmbedBuilder(logoUrl = team.logoUrl, teamColor = team).apply {
                setTitle(team.fullName, "https://simulationhockey.com/forumdisplay.php?fid=${team.rosterId}")

                if (roster.gms.isNotEmpty()) {
                    addField("General Managers") { builder ->
                        roster.gms.forEach { gm ->
                            builder.append("[${gm.name}](${gm.fullProfilePath})\n")
                        }
                    }
                }

                addField("Roster") { builder ->
                    builder.appendPlayers(roster.players)
                }

                val title = if (team.leagueType == LeagueType.SMJHL) "Average capped TPE" else "Average TPE"
                addField(title) { builder ->
                    builder.append(roster.averageTpe(currentSeason).afterDecimal(2))
                }

                addField("Forwards", inline = true) { builder ->
                    builder.append(roster.averageTpeForwards(currentSeason).afterDecimal(2))
                }

                addField("Defense", inline = true) { builder ->
                    builder.append(roster.averageTpeDefense(currentSeason).afterDecimal(2))
                }

                addField("Forwards + Defense", inline = true) { builder ->
                    builder.append(roster.averageTpeSkaters(currentSeason).afterDecimal(2))
                }

                addField("Starting goalie", inline = true) { builder ->
                    if (roster.startingGoalie != null) {
                        builder.append(roster.startingGoalie.appliedTpe(currentSeason, team) ?: "N/A")
                    } else {
                        builder.append("N/A")
                    }
                }

                addField("Backup goalie", inline = true) { builder ->
                    if (roster.backupGoalie != null) {
                        builder.append(roster.backupGoalie.appliedTpe(currentSeason, team) ?: "N/A")
                    } else {
                        builder.append("N/A")
                    }
                }

                if (roster.prospects.isNotEmpty()) {
                    addField("Prospects") { builder ->
                        builder.appendPlayers(roster.prospects.reversed())
                    }
                }
            }
        }
    }

    private fun StringBuilder.appendPlayers(players: List<RosterPlayer>) {
        players.forEach { player ->
            append("\n")
            append(player.text)
            if (player.tpe != null) {
                append(" (tpe: ${player.tpe})")
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!roster(\\s+\\w+.*)?".toRegex()
    }

}