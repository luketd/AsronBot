package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.forum.ShlForumRepository
import shl.scraper.util.ForumThread

open class ListThreadsCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder? {
        val forumId = arguments.getOrNull(0)?.toIntOrNull() ?: return null
        val startPage = arguments.getOrNull(1)?.toIntOrNull() ?: 1
        val maxPages = arguments.getOrNull(2)?.toIntOrNull() ?: 1
        val threads = ShlForumRepository.getThreads(forumId, maxPages, startPage).value
        if (threads.isEmpty()) {
            return null
        }
        return BaseEmbedBuilder(event = event).apply {
            addField(threads[0].forumName) { builder ->
                threads.filter { shouldShow(it) }.forEach { thread ->
                    builder.append("\n[${thread.name}](${thread.link})")
                }
            }
        }
    }

    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String? {
        val threadId = arguments.getOrNull(0)?.toIntOrNull() ?: return null
        val startPage = arguments.getOrNull(1)?.toIntOrNull() ?: 1
        val maxPages = arguments.getOrNull(2)?.toIntOrNull() ?: 1
        val threads = ShlForumRepository.getThreads(threadId, maxPages, startPage).value
        if (threads.isEmpty()) {
            return null
        }

        return buildString {
            append("Open threads in `${threads[0].forumName}`:\n")
            threads.filter { shouldShow(it) }.forEach { thread ->
                append("\n- ${thread.name} (<${thread.link}>)")
            }
        }
    }

    protected open fun shouldShow(thread: ForumThread): Boolean {
        return thread.open
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!list\\s*\\d+.*".toRegex()
    }

}