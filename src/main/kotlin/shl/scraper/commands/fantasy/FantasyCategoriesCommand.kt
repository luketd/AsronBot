package shl.scraper.commands.fantasy

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.fantasy.FantasyInteractor

class FantasyCategoriesCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val name = getUserName(event, arguments) ?: ""

        val response = FantasyInteractor.getCategoryStandings()

        return FantasyEmbedBuilder(event).apply {
            response.value.forEach { category ->
                addField(category.categoryName.toLowerCase(), inline = true) { builder ->
                    val userIndex = category.teams.indexOfFirst { it.teamName.equals(name, ignoreCase = true) }

                    category.teams.take(3).forEachIndexed { index, team ->
                        if (index == userIndex) {
                            builder.append("**${team.rank}. ${team.teamName} | ${team.score}**\n")
                        } else {
                            builder.append("${team.rank}. ${team.teamName} | ${team.score}\n")
                        }
                    }

                    if (userIndex > 2) {
                        builder.append("...\n")
                        val team = category.teams[userIndex]
                        builder.append("${team.rank}. ${team.teamName} | ${team.score}")
                    }
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(f|fantasy)(c|categories)(\\s+.*)?".toRegex()
    }

}