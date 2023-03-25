package shl.scraper.commands.custom

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.custom.CustomCommandRepository

class RemoveCustomCommand: DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        if (arguments.isEmpty()) {
            return ""
        }

        val commandName = arguments[0]
        val prev = CustomCommandRepository.find(event.guild.id, commandName)
        return if (prev != null) {
            CustomCommandRepository.remove(event.guild.id, commandName)
            "Removed command `$commandName`\n\n```${prev.content}```"
        } else {
            "Command `$commandName` not found"
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!customr\\s+.*".toRegex()
    }

}