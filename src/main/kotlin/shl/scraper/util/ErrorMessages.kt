package shl.scraper.util

import shl.scraper.commands.ErrorEmbedBuilder
import shl.scraper.roster.TeamInfo

object ErrorMessages {
    val EMBED_NOT_FOUND = ErrorEmbedBuilder().apply {
        setDescription("Not found")
    }

    val EMBED_USER_NOT_FOUND = ErrorEmbedBuilder().apply {
        setDescription("User not found. Did you forget to do `!store username team`?")
    }

    fun teamNotFound(name: String?) = ErrorEmbedBuilder().apply {
        setDescription("Team `$name` not found")
    }

    fun userInTeamNotFound(user: String, teamInfo: TeamInfo) = ErrorEmbedBuilder().apply {
        setDescription("Couldn't find `$user` in `${teamInfo.fullName}`")
    }

    fun minArgumentsError(min: Int, explanation: String) = ErrorEmbedBuilder().apply {
        setDescription("This command requires $min arguments. (`$explanation`)")
    }

    fun playerNameNotStored() = ErrorEmbedBuilder().apply {
        setDescription("Couldn't find your player name. Save your information by using `!store username team`\n" +
                "If you are in the SMJHL, use your SMJHL team's name")
    }

    fun playerNotFound(name: String?) = ErrorEmbedBuilder().apply {
        setDescription("Player `$name` not found")
    }

    fun storedPlayerNotFound(name: String?) = ErrorEmbedBuilder().apply {
        setDescription("Player `$name` not found. Try running `!store username team`\n" +
                "If you are in the SMJHL, use your SMJHL team's name")
    }

    fun nameRequired(explanation: String) = ErrorEmbedBuilder().apply {
        setDescription("Name is required (`$explanation`)")
    }
}