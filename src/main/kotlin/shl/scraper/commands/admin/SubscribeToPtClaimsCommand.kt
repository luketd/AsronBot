package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.roster.TeamInfo
import shl.scraper.subscribe.claims.PtClaimSubscriptionRepository
import shl.scraper.subscribe.claims.PtClaimSubscription

class SubscribeToPtClaimsCommand : ForumSubscribeCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        if (arguments.isEmpty()) {
            return ""
        }

        return requireRole(userRole, UserRole.REGULAR) {
            val team = TeamInfo.find(arguments.getOrNull(1))

            val serverId = event.guild.id
            val channelId = event.channel.id
            val isJunior = arguments[0].equals("claimsj", ignoreCase = true)
            val leagueName = if (isJunior) {
                "SMJHL"
            } else {
                "SHL"
            }
            val config = PtClaimSubscription(
                team, isJunior, serverId, channelId,
                event.message.mentions.roles.firstOrNull()?.id
            )

            if (event.message.contentRaw.contains("unsubscribe", ignoreCase = false)) {
                PtClaimSubscriptionRepository.remove(config)
                "Unsubscribed from $leagueName PT claims"
            } else {
                PtClaimSubscriptionRepository.add(config)
                "Subscribed to $leagueName PT claims" + if (team != null) {
                    " for team `${team.fullName}`"
                } else {
                    ""
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(un)?subscribe\\s+claims(j)?.*".toRegex()
    }

}