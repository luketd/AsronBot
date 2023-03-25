package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.config.DynamicConfig
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.log.Logger

class UpdateDynamicConfigCommand : DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        return requireRole(userRole, UserRole.BOT_CO_OWNER) {
            val season = arguments[0].toInt()
            val shlThreadIds = arguments.subList(1, 4).map { it.toInt() }.sortedDescending()
            val smjhlThreadIds = arguments.subList(4, 7).map { it.toInt() }.sortedDescending()
            val fantasySheetId = arguments[7]
            val oldConfig = DynamicConfigRepository.config
            val newConfig =
                DynamicConfig(shlThreadIds, smjhlThreadIds, season, fantasySheetId, oldConfig.ignoreClaimPostIds)
            DynamicConfigRepository.save(newConfig)
            Logger.log("${event.author.id} changed config\nold=$oldConfig\nnew=$newConfig")
            "Config updated: ${DynamicConfigRepository.config}\n\n\nPrev config: $oldConfig"
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!uconfig(\\s|.)*".toRegex()
    }

}