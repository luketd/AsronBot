package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.util.ForumThread

class ListTpeCommand : ListThreadsCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder? {
        val pt = super.buildResponseEmbed(event, listOf("45"), UserRole.REGULAR, discord)
        val ac = super.buildResponseEmbed(event, listOf("431"), UserRole.REGULAR, discord)
        ac?.fields?.forEach { field ->
            pt?.addField(field)
        }
        return pt
    }

    override fun shouldShow(thread: ForumThread): Boolean {
        return thread.open && !thread.pinned && !thread.name.matches("(?i)\\s*S\\d+ milestones\\s*".toRegex())
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!tpe".toRegex()
    }

}