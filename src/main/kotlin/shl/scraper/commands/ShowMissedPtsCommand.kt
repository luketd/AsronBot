package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.db.UserRepository
import shl.scraper.roster.RosterRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.tpe.TpeClaimRepository
import shl.scraper.util.ErrorMessages
import shl.scraper.util.appendEmoji

class ShowMissedPtsCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val teamInfo: TeamInfo
        val userName: String

        if (arguments.isEmpty()) {
            val user = UserRepository.find(event.author.id) ?: return ErrorMessages.EMBED_USER_NOT_FOUND
            teamInfo = TeamInfo.find(user.teamName) ?: return ErrorMessages.teamNotFound(user.teamName)
            userName = user.forumName
        } else {
            if (arguments.size < 2) {
                return ErrorMessages.minArgumentsError(2, "!missed username team")
            }
            teamInfo = TeamInfo.find(arguments.lastOrNull()) ?: return ErrorMessages.teamNotFound(arguments.lastOrNull())
            userName = buildString {
                arguments.subList(0, arguments.lastIndex).forEach {
                    append(" $it")
                }
            }.trim()
        }

        if (userName.isBlank()) {
            return ErrorMessages.EMBED_USER_NOT_FOUND
        }

        val player = RosterRepository.getRoster(teamInfo, includeProspects = false).find(userName)
            ?: return ErrorMessages.userInTeamNotFound(userName, teamInfo)
        val missed = TpeClaimRepository.getClaimsForPlayer(player.season ?: 0).filter {
            !it.mentions(userName) && !DynamicConfigRepository.config.ignoreClaimPostIds.contains(it.post.postId)
        }.reversed()

        return BaseEmbedBuilder(event = event).apply {
            if (missed.isEmpty()) {
                setDescription(buildString {
                    append("You didn't miss any PTs")
                    appendEmoji(event, "catJAM", prefix = " ")
                })
            } else {
                setDescription("Missed PTs over the last 3 seasons")

                addField { builder ->
                    missed.take(10).forEach {
                        builder.append("\n[${it.post.time}](${it.post.link})")
                    }
                    if (missed.size > 10) {
                        builder.append("\n[...] ${missed.size - 10} more")
                    }
                }
            }
        }
    }

    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        val teamInfo: TeamInfo?
        val userName: String?

        if (arguments.isEmpty()) {
            val user = UserRepository.find(event.author.id) ?: return "User not found"
            teamInfo = TeamInfo.find(user.teamName)
            userName = user.forumName
        } else {
            teamInfo = TeamInfo.find(arguments.lastOrNull())
            userName = buildString {
                arguments.subList(0, arguments.lastIndex).forEach {
                    append(" $it")
                }
            }.trim()
        }

        teamInfo ?: return "Team not specified (`!missed user team`)"
        if (userName.isBlank()) {
            return "User name not specified (`!missed user team`)"
        }

        val player = RosterRepository.getRoster(teamInfo, includeProspects = false).find(userName)
            ?: return "Could not find `$userName` in `${teamInfo.fullName}`"
        val missed = TpeClaimRepository.getClaimsForPlayer(player.season ?: 0).filter {
            !it.mentions(userName) && !DynamicConfigRepository.config.ignoreClaimPostIds.contains(it.post.postId)
        }.reversed()

        return buildString {
            if (missed.isEmpty()) {
                append("You didn't miss any PTs")
                appendEmoji(event, "catJAM", prefix = " ")
            } else {
                append("Missed PTs over the last 3 seasons: \n")

                missed.take(10).forEach {
                    append("\n<${it.post.link}>")
                }
                if (missed.size > 10) {
                    append("\n[...] ${missed.size - 10} more")
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!missed.*".toRegex()
    }

}