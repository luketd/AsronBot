package shl.scraper.forum

import org.jsoup.nodes.Document
import shl.scraper.config.FORUM_THREAD_LIST_REFRESH
import shl.scraper.config.FORUM_THREAD_POST_REFRESH
import shl.scraper.util.ForumThread
import shl.scraper.util.ShlForumParser
import shl.scraper.util.ThreadPost
import java.util.concurrent.TimeUnit

object ShlForumRepository {
    private val cacheByForumId = mutableMapOf<Int, CacheValue<List<ForumThread>>>()
    private val cacheByThreadId = mutableMapOf<Int, CacheValue<List<ThreadPost>>>()
    private val cacheByUrl = mutableMapOf<String, CacheValue<Document>>()
    private val profileCacheByUrl = mutableMapOf<String, CacheValue<ForumUserProfile>>()

    @Synchronized
    fun getThreadsSynced(
        forumId: Int, maxPages: Int = 1, startPage: Int = 1,
        timeout: Long = FORUM_THREAD_LIST_REFRESH
    ): CacheValue<List<ForumThread>> {
        return getThreads(forumId, maxPages, startPage, timeout)
    }

    fun getThreads(
        forumId: Int, maxPages: Int = 1, startPage: Int = 1,
        timeout: Long = FORUM_THREAD_LIST_REFRESH
    ): CacheValue<List<ForumThread>> {
        return checkCache(cacheByForumId, forumId, timeout) {
            ShlForumParser.getThreadList(forumId, maxPages, startPage)
        }
    }

    @Synchronized
    fun getPostsSynced(threadId: Int, timeout: Long = FORUM_THREAD_POST_REFRESH): CacheValue<List<ThreadPost>> {
        return getPosts(threadId, timeout)
    }

    fun getPosts(threadId: Int, timeout: Long = FORUM_THREAD_POST_REFRESH): CacheValue<List<ThreadPost>> {
        return checkCache(cacheByThreadId, threadId, timeout) {
            ShlForumParser.getThreadPosts(threadId)
        }
    }

    fun getDocument(url: String, timeout: Long = FORUM_THREAD_POST_REFRESH): CacheValue<Document> {
        return checkCache(cacheByUrl, url, timeout) {
            ShlForumParser.connect(url)
        }
    }

    fun getUserProfile(url: String, timeout: Long = TimeUnit.MINUTES.toMillis(10)): ForumUserProfile {
        return checkCache(profileCacheByUrl, url, timeout) {
            ShlForumParser.getUserProfile(url)
        }.value
    }

    private fun <K, V> checkCache(
        cache: MutableMap<K, CacheValue<V>>, key: K,
        refreshMls: Long, getValue: () -> V
    ): CacheValue<V> {
        val cached = cache[key]
        return if (cached == null || cached.isExpired(refreshMls)) {
            val result = CacheValue(getValue())
            cache[key] = result
            result
        } else {
            cached
        }
    }
}