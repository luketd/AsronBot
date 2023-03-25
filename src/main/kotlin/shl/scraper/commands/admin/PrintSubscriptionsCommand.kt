package shl.scraper.commands.admin

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.subscribe.ForumSubscriptionRepository
import shl.scraper.subscribe.claims.PtClaimSubscriptionRepository

class PrintSubscriptionsCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder? {
        val serverId = event.guild.id
        val forums = ForumSubscriptionRepository.configs.filter { it.serverId == serverId }.groupBy { it.channelId }
        val claims = PtClaimSubscriptionRepository.configs.filter { it.serverId == serverId }.groupBy { it.channelId }

        return BaseEmbedBuilder().apply {
            setTitle("Active subscriptions")

            (forums.keys + claims.keys).forEach { channelId ->
                addField("#" + (event.guild.getTextChannelById(channelId)?.name ?: "")) { builder ->
                    forums[channelId]?.forEach { config ->
                        builder.append("Forum id ${config.forumId}")
                        if (config.mentionRoleId != null) {
                            val roleName = event.guild.getRoleById(config.mentionRoleId)?.name
                            builder.append(" (@$roleName)")
                        }
                        builder.append("\n")
                    }

                    claims[channelId]?.forEach { config ->
                        val leagueName = if (config.junior) {
                            "SMJHL"
                        } else {
                            "SHL"
                        }
                        builder.append("$leagueName PT claims")
                        if (config.team != null) {
                            builder.append(" for team `${config.team.fullName}`")
                        }
                        if (config.mentionRoleId != null) {
                            val roleName = event.guild.getRoleById(config.mentionRoleId)?.name
                            builder.append(" (@$roleName)")
                        }
                        builder.append("\n")
                    }
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!subscriptions".toRegex()
    }

}