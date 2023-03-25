package shl.scraper.util

import java.text.SimpleDateFormat
import java.util.*

data class ForumThread(
    val threadId: Int = 0,
    val name: String = "",
    val status: String = "",
    val startedBy: String = "",
    val startedByProfileLink: String = "",
    val lastPostBy: String = "",
    val lastPostDate: String = "",
    val prettyLastPostDate: String = "",
    val pinned: Boolean = false,
    val note: String = "",
    var posts: List<ThreadPost>? = null,
    val forumName: String = "",
    val postCount: Int = 0,
    val viewCount: Int = 0
) {
    val locked = status.contains("Closed", ignoreCase = true)
    val open = !locked
    val link = UrlProvider.thread(threadId)
    val lastPostLink = "$link&action=lastpost"

    fun parseLastPostDate(): Date {
        val date = when {
            prettyLastPostDate.contains("ago", ignoreCase = true) || prettyLastPostDate.contains(
                "less than",
                ignoreCase = true
            ) -> {
                if (lastPostDate.isBlank()) {
                    throw IllegalStateException("lastPostDate is blank for thread $threadId")
                }
                lastPostDate
            }
            prettyLastPostDate.contains("yesterday", ignoreCase = true) -> {
                if (lastPostDate.isBlank()) {
                    throw IllegalStateException("lastPostDate is blank for thread $threadId")
                }
                prettyLastPostDate.replace("Yesterday", lastPostDate)
            }
            prettyLastPostDate.contains("today", ignoreCase = true) -> {
                if (lastPostDate.isBlank()) {
                    throw IllegalStateException("lastPostDate is blank for thread $threadId")
                }
                prettyLastPostDate.replace("Today", lastPostDate)
            }
            else -> prettyLastPostDate
        }
        return SimpleDateFormat("MM-dd-yyyy, hh:mm aa", Locale.US).apply {
            timeZone = TimeZone.getTimeZone("America/New_York")
        }.parse(date)
    }
}