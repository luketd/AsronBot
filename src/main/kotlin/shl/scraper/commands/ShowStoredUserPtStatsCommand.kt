package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.db.UserRepository
import shl.scraper.util.ErrorMessages

class ShowStoredUserPtStatsCommand : ShowUserPtStatsCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder? {
        val user = UserRepository.find(event.author.id) ?: return ErrorMessages.EMBED_USER_NOT_FOUND
        val aliasArguments = listOf(user.forumName)
        return super.buildResponseEmbed(event, aliasArguments, userRole, discord)
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!me".toRegex()
    }

}