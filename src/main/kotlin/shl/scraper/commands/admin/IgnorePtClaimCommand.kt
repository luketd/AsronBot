package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.log.Logger

class IgnorePtClaimCommand : DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        return requireRole(userRole, UserRole.BOT_CO_OWNER) {
            val id = arguments.getOrNull(0)?.toLongOrNull() ?: return@requireRole "Couldn't parse post id"
            val current = DynamicConfigRepository.config
            val newConfig = current.copy(ignoreClaimPostIds = current.ignoreClaimPostIds + listOf(id))
            DynamicConfigRepository.save(newConfig)
            Logger.log("${event.author.id} added an ignored PT claim post $id")
            "Config updated: ${DynamicConfigRepository.config}"
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!ignoreclaim\\s+\\d+".toRegex()
    }

}