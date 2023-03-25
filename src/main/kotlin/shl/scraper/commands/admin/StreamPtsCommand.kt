package shl.scraper.commands.admin

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole

class StreamPtsCommand : ForumSubscribeCommand() {
    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        if (arguments.isEmpty()) {
            return ""
        }
        val message = event.message.contentRaw
        return when {
            arguments[0].equals("pt", ignoreCase = true) -> {
                buildString {
                    append(super.buildResponse(event, listOf("45"), userRole, discord))
                    append("\n")
                    append(super.buildResponse(event, listOf("431"), userRole, discord))
                }
            }
            arguments[0].equals("ptj", ignoreCase = true) -> {
                buildString {
                    append(super.buildResponse(event, listOf("66"), userRole, discord))
                    append("\n")
                    append(super.buildResponse(event, listOf("431"), userRole, discord))
                }
            }
            else -> {
                "Could not parse command `$message`"
            }
        }
    }
    override fun commandNameRegex(): Regex {
        return "(?i)!(un)?subscribe\\s+pt(j)?.*".toRegex()
    }

}