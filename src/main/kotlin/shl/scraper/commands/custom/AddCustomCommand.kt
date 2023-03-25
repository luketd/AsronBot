package shl.scraper.commands.custom

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.custom.CustomCommandInfo
import shl.scraper.custom.CustomCommandRepository

class AddCustomCommand : DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        if (arguments.size < 2) {
            return "This command requires 2 arguments"
        }

        val commandName = arguments[0]

        val prev = CustomCommandRepository.find(event.guild.id, commandName)
        if (prev != null && !event.message.contentDisplay.matches("(?i)!customf(\\s|.)*".toRegex())) {
            return "This command already exists, use `!customf` to override it. Current command:\n\n```${prev.content}```"
        }

        val content = event.message.contentRaw
            .replace("(?i)!custom(f)?\\s+".toRegex(), "")
            .replaceFirst(commandName, "")
            .trim()
        val commandInfo = CustomCommandInfo(event.guild.id, commandName, content)
        CustomCommandRepository.add(commandInfo)

        return "Added a new command `$commandName`\n\n```\n$content\n```"
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!custom(f)?\\s+(\\s|.)*".toRegex()
    }

}