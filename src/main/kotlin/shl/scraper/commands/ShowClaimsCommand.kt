package shl.scraper.commands

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.tpe.TpeClaimRepository
import shl.scraper.util.ErrorMessages

class ShowClaimsCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): BaseEmbedBuilder {
        val userName = getUserName(event, arguments) ?: return ErrorMessages.EMBED_USER_NOT_FOUND

        val claims = TpeClaimRepository.getLatestClaimsForUser(userName, size = 10)

        return BaseEmbedBuilder(event = event).apply {
            val description = buildString {
                append("TPE claims mentioning `$userName`\n")
                claims.takeLast(10).reversed().forEach {
                    append("\n[${it.post.time}](${it.post.link})")
                }
                if (claims.size > 10) {
                    append("\n[...]")
                }
            }
            setDescription(description)
        }
    }

    override fun commandNameRegex(): Regex {
        return "\\s*!claims.*".toRegex()
    }

}