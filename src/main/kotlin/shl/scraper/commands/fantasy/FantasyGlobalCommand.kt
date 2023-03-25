package shl.scraper.commands.fantasy

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.fantasy.FantasyInteractor

class FantasyGlobalCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val name = getUserName(event, arguments) ?: ""

        val response = FantasyInteractor.getGlobal()
        val teams = response.value
        return FantasyEmbedBuilder(event).apply {
            val userIndex = if (name.isNotEmpty()) {
                teams.indexOfFirst { it.name.equals(name, ignoreCase = true) }
            } else {
                -1
            }

            addField("Global standings") { builder ->
                teams.take(10).forEachIndexed { index, team ->
                    if (index == userIndex) {
                        builder.append("**${index + 1}. ${team.name} | ${team.score}**\n")
                    } else {
                        builder.append("${index + 1}. ${team.name} | ${team.score}\n")
                    }
                }
                if (userIndex >= 10) {
                    builder.append("...\n**${userIndex + 1}. ${teams[userIndex].name} | ${teams[userIndex].score}**")
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(f|fantasy)(g|global)(\\s+.*)?".toRegex()
    }

}