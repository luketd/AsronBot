package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.config.DynamicConfigRepository

class PrintDynamicConfigCommand: DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        return requireRole(userRole, UserRole.BOT_CO_OWNER) {
            DynamicConfigRepository.config.toString()
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!pconfig".toRegex()
    }

}