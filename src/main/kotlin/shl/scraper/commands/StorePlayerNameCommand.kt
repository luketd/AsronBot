package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.db.UserInfo
import shl.scraper.db.UserRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ErrorMessages

class StorePlayerNameCommand : StoreUserCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder? {
        if (arguments.isEmpty()) {
            return ErrorMessages.minArgumentsError(1, "!pstore name")
        }
        val playerName = event.message.contentRaw.replaceFirst("(?i)!pstore\\s+".toRegex(), "")

        val userInfo = UserRepository.find(event.author.id)?.copy(playerName = playerName)
            ?: UserInfo(event.author.id, "", "", playerName)
        UserRepository.save(userInfo)

        return buildResponse(event, userInfo, TeamInfo.find(userInfo.teamName))
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!pstore.+".toRegex()
    }

}