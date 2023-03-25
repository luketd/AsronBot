package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.db.UserRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ErrorMessages

abstract class DiscordCommand {
    open fun buildResponse(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): String? {
        return null
    }

    open fun buildResponseArray(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): List<String>? {
        return null
    }

    open fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder? {
        return null
    }

    abstract fun commandNameRegex(): Regex

    //should follow format: !oneWordCommand argument argument
    fun isCommand(event: MessageReceivedEvent): Boolean {
        return event.message.contentRaw.trim().matches(commandNameRegex())
    }

    protected fun requireRole(role: UserRole, minRole: UserRole, responseBuilder: () -> String): String {
        return if (role.ordinal >= minRole.ordinal) {
            responseBuilder()
        } else {
            "Permission denied smh (requires $minRole)"
        }
    }

    protected fun getUserName(event: MessageReceivedEvent, arguments: List<String>): String? {
        return if (arguments.isEmpty()) {
            UserRepository.find(event.author.id)?.forumName
        } else {
            buildString {
                arguments.forEach { append(" $it") }
            }.trim()
        }
    }

    protected fun List<String>.getSeason(index: Int = 0): Int? {
        val arg = getOrNull(index)?.trim() ?: ""
        return arg.toIntOrNull() ?: arg.replace("s", "").replace("S", "").toIntOrNull()
    }

    protected fun getTeamName(
        event: MessageReceivedEvent,
        arguments: List<String>,
        skipArguments: Int,
        fallbackToStoredTeam: Boolean = true
    ): String? {
        return when {
            arguments.size > skipArguments -> {
                buildString {
                    arguments.forEachIndexed { index, arg ->
                        if (index >= skipArguments) {
                            append(" $arg")
                        }
                    }
                }.trim()
            }
            fallbackToStoredTeam -> {
                UserRepository.find(event.author.id)?.teamName
            }
            else -> {
                null
            }
        }
    }

    protected fun withTeamInfoEmbed(
        event: MessageReceivedEvent, arguments: List<String>, skipArguments: Int = 0,
        responseBuilder: (TeamInfo) -> EmbedBuilder
    ): EmbedBuilder {
        val teamName = getTeamName(event, arguments, skipArguments)
        val team = TeamInfo.find(teamName)
            ?: return if (teamName.isNullOrEmpty()) {
                ErrorMessages.EMBED_USER_NOT_FOUND
            } else {
                ErrorMessages.teamNotFound(teamName)
            }
        return responseBuilder(team)
    }

    protected fun withTeamInfo(
        event: MessageReceivedEvent, arguments: List<String>,
        responseBuilder: (TeamInfo) -> String
    ): String {
        val teamName = if (arguments.isNotEmpty()) {
            arguments[0]
        } else {
            UserRepository.find(event.author.id)?.teamName
        }
        val team = TeamInfo.find(teamName) ?: return if (teamName.isNullOrEmpty()) {
            "User not found. Did you forget to do `!store username team`?"
        } else {
            "Could not find team `$teamName`"
        }
        return responseBuilder(team)
    }
}