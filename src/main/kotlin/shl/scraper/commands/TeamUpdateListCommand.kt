package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.update.PlayerUpdateInfo
import shl.scraper.update.TeamUpdateRepository

class TeamUpdateListCommand: DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        return withTeamInfoEmbed(event, arguments) { team ->
            val updates = TeamUpdateRepository.getUpdates(team)
            BaseEmbedBuilder(teamColor = team, logoUrl = team.logoUrl).apply {
                addField("Updated this week") { builder ->
                    builder.appendPlayers(updates.filter { it.updated })
                }

                addField("Didn't update this week") { builder ->
                    builder.appendPlayers(updates.filter { !it.updated })
                }
            }
        }
    }

    private fun StringBuilder.appendPlayers(players: List<PlayerUpdateInfo>) {
        players.forEach { player ->
            append("\n${player.updateThread.startedBy} (${player.getTimeSince()})")
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(u|upd)(\\s+.*)?".toRegex()
    }

}