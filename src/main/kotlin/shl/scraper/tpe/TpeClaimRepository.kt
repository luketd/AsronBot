package shl.scraper.tpe

import org.jsoup.parser.Parser
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.config.FORUM_THREAD_POST_REFRESH
import shl.scraper.forum.ShlForumRepository
import shl.scraper.util.ThreadPost
import java.util.concurrent.TimeUnit

object TpeClaimRepository {
    fun getClaimsForPlayer(draftSeason: Int): List<TpeClaim> {
        val config = DynamicConfigRepository.config
        val currentSeason = config.currentSeason
        val result = mutableListOf<TpeClaim>()

        for (i in 0..2) {
            val season = currentSeason - i
            when {
                draftSeason - season == 1 -> {
                    result.addAll(getClaims(config.juniorClaimThreads[i], season, true))
                }
                season >= draftSeason -> {
                    result.addAll(getClaims(config.shlClaimThreadIds[i], season, false))
                }
            }
        }

        result.sortBy { it.timestamp }
        return result
    }

    fun getLatestClaimsForUser(userName: String, size: Int): List<TpeClaim> {
        val result = mutableListOf<TpeClaim>()

        val config = DynamicConfigRepository.config
        config.shlClaimThreadIds.forEachIndexed { index, threadId ->
            result.addAll(getClaims(threadId, config.currentSeason - index, false).filter { it.mentions(userName) })
            if (result.size >= size) {
                result.sortBy { it.timestamp }
                return result
            }
        }

        config.juniorClaimThreads.forEachIndexed { index, threadId ->
            result.addAll(getClaims(threadId, config.currentSeason - index, true).filter { it.mentions(userName) })
            if (result.size >= size) {
                result.sortBy { it.timestamp }
                return result
            }
        }

        result.sortBy { it.timestamp }
        return result
    }

    private fun getClaims(threadId: Int, season: Int, juniors: Boolean): List<TpeClaim> {
        val cacheTimeout = if (season != DynamicConfigRepository.config.currentSeason) {
            TimeUnit.DAYS.toMillis(7)
        } else {
            FORUM_THREAD_POST_REFRESH
        }

        return ShlForumRepository.getPosts(threadId, cacheTimeout).value.filterNot {
            DynamicConfigRepository.config.ignoreClaimPostIds.contains(it.postId)
        }.mapNotNull { post ->
            val lines = convertClaimPostToLines(post)
            if (lines.isNotEmpty() && (post.postIndex > 0 || post.doc.text().length >= 2000)) {
                TpeClaim(post.doc.text(), lines, post.timestamp, post, season, juniors)
            } else {
                null
            }
        }
    }

    fun convertClaimPostToLines(post: ThreadPost): List<String> {
        var claimContent = post.doc.select("#pid_${post.postId} .codeblock code")
        if (claimContent.isEmpty()) {
            claimContent = post.doc.select("#pid_${post.postId}")
        }

        val lines = mutableListOf<String>()
        claimContent.forEach { claimPost ->
            val parsed = Parser.unescapeEntities(claimPost.html(), true)
                .split("<br>")
                .map { it.replace("(\\s| )+".toRegex(), " ") }
                .map { it.trim() }
            lines.addAll(parsed)
        }

        return lines
    }
}