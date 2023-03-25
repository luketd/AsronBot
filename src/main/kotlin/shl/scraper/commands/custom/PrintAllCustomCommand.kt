package shl.scraper.commands.custom

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.custom.CustomCommandRepository

class PrintAllCustomCommand: DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val commands = CustomCommandRepository.findAllForServer(event.guild.id)
        return BaseEmbedBuilder(event = event).apply {
            if (commands.isNotEmpty()) {
                commands.chunked(50).forEachIndexed { index, chunk ->
                    val title = if (index == 0) "Custom commands" else ""
                    addField(title, inline = true) { builder ->
                        chunk.forEach { command ->
                            builder.append(command.name)
                            builder.append("\n")
                        }
                    }
                }
            } else {
                setDescription("This server doesn't have custom commands")
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!pcustom".toRegex()
    }

}