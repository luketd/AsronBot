package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.subscribe.ForumSubscription
import shl.scraper.subscribe.ForumSubscriptionRepository

open class ForumSubscribeCommand : DiscordCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        return requireRole(userRole, UserRole.REGULAR) {
            val forumId =
                arguments.getOrNull(0)?.toInt() ?: return@requireRole "Could not parse id `${arguments.getOrNull(0)}`"
            val serverId = event.guild.id
            val channelId = event.channel.id
            val config = ForumSubscription(
                forumId, serverId, channelId,
                mentionRoleId = event.message.mentions.roles.firstOrNull()?.id
            )
            if (event.message.contentRaw.contains("unsubscribe", ignoreCase = true)) {
                ForumSubscriptionRepository.remove(config)
                "Unsubscribed from forum `$forumId`"
            } else {
                ForumSubscriptionRepository.add(config)
                "Subscribed to forum `$forumId`"
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(un)?subscribe\\s+\\d+.*".toRegex()
    }

}