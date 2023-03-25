package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.db.UserInfo
import shl.scraper.db.UserRepository
import shl.scraper.roster.RosterRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ErrorMessages

open class StoreUserCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder? {
        if (arguments.size < 2) {
            return ErrorMessages.minArgumentsError(2, "!store username team")
        }

        var teamInfo = TeamInfo.values().find {
            event.message.contentDisplay.endsWith(it.fullName, ignoreCase = true)
        }
        val isFullTeamName = teamInfo != null

        if (teamInfo == null) {
            teamInfo = TeamInfo.find(arguments.last())
            teamInfo ?: return ErrorMessages.teamNotFound(arguments.last())
        }

        var userName = buildString {
            for (i in 0 until if (isFullTeamName) arguments.size else arguments.lastIndex) {
                append(" ${arguments[i]}")
            }
        }.trim()
        if (isFullTeamName) {
            userName = userName.replace(teamInfo.fullName, "", ignoreCase = true).trim()
        }

        val playerName = try {
            RosterRepository.getRoster(teamInfo, includeProspects = false, forceRefresh = true)
                .find(userName)?.text?.replace(".* - ".toRegex(), "")?.trim() ?: ""
        } catch (e: Exception) {
            ""
        }

        val info = UserInfo(event.author.id, userName, teamInfo.name, playerName)
        UserRepository.save(info)
        return buildResponse(event, info, teamInfo)
    }

    protected fun buildResponse(
        event: MessageReceivedEvent, info: UserInfo,
        teamInfo: TeamInfo? = null
    ): EmbedBuilder {
        return BaseEmbedBuilder(teamColor = teamInfo).apply {
            setDescription("Saved ${event.author.asMention}")

            addField("User") {
                if (info.forumName.isNotBlank()) {
                    it.append(info.forumName)
                } else {
                    it.append("-")
                }
            }

            addField("Team") {
                it.append(teamInfo?.fullName ?: "-")
            }

            addField("Player") {
                if (info.playerName.isNotBlank()) {
                    it.append(info.playerName)
                } else {
                    it.append("-")
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!store\\s+.*".toRegex()
    }

}