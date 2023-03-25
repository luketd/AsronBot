package shl.scraper.util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import shl.scraper.forum.ForumUserProfile

object ShlForumParser {
    fun getThreadList(forumId: Int, maxPages: Int = 1, startPage: Int = 1): List<ForumThread> {
        val result = mutableListOf<ForumThread>()

        var totalPages = 0
        for (page in startPage until (startPage + maxPages)) {
            if (totalPages in 1 until page) {
                break
            }

            val doc = connect(UrlProvider.forum(forumId, page))
            if (page == startPage) {
                totalPages = if (doc.select(".pagination_last").size > 0) {
                    doc.select(".pagination_last")[0].text().toInt()
                } else {
                    1 + doc.select(".pagination_page").size / 2
                }
            }

            val forumName = doc.select(".thead .largetext")[0].text()

            val rows = doc.select("table tr")

            var parsingPinned = false

            rows.forEach { row ->
                if (row.text() == "Important Threads") {
                    parsingPinned = true
                }
                if (row.text() == "Normal Threads") {
                    parsingPinned = false
                }

                if (row.hasClass("inline_row")) {
                    val status = row.select(".thread_status").attr("title")
                    val subject = row.select(".subject_old, .subject_new")[0]
                    val name = subject.text()
                    val threadId = subject.attr("id").trim().replace("tid_", "").toInt()
                    val startedBy = row.select(".author a")[0].text().trim()
                    val startedByProfileLink = row.select(".author a")[0].attr("href")
                    val lastPostBy = row.select(".lastpost")[0].select("a")[1].text().trim()
                    val lastPostDate = row.select(".lastpost span").attr("title")
                    val prettyLastPostDate = row.select(".lastpost")[0].html()
                        .replace(".*<br>".toRegex(), "")
                        .replace("<span.*\">".toRegex(), "")
                        .replace("</span>".toRegex(), "")
                        .trim()
                    val note = row.select("small").text()

                    val threadInfo = row.select("td")[4].select(".float_right")
                    val posts = threadInfo[0].text().replace(",", "").toIntOrNull() ?: 0
                    val views = threadInfo[1].text().replace(",", "").toIntOrNull() ?: 0

                    result.add(
                        ForumThread(
                            threadId, name, status, startedBy, startedByProfileLink, lastPostBy, lastPostDate,
                            prettyLastPostDate, parsingPinned, note, forumName = forumName, postCount = posts,
                            viewCount = views
                        )
                    )
                }
            }
        }

        return result
    }

    fun getThreadPosts(threadId: Int): List<ThreadPost> {
        val result = mutableListOf<ThreadPost>()

        val doc = connect(UrlProvider.thread(threadId))
        val totalPages = if (doc.select(".pagination_last").size > 0) {
            doc.select(".pagination_last")[0].text().toInt()
        } else {
            1 + doc.select(".pagination_page").size / 2
        }
        result.addAll(parseThreadPosts(doc))

        for (i in 2..totalPages) {
            result.addAll(parseThreadPosts(connect(UrlProvider.thread(threadId, i))))
        }

        return result
    }

    private fun parseThreadPosts(doc: Document): List<ThreadPost> {
        val result = mutableListOf<ThreadPost>()
        doc.select(".post").forEachIndexed { index, post ->
            val urlPath = post.select(".float_right strong a").attr("href")

            var time = post.select(".post_date").text()
            val timeSpan = post.select(".post_date span")
            if (timeSpan.isNotEmpty()) {
                time = time.replace(timeSpan.first().text(), timeSpan.first().attr("title"))
            }
            val body = post.select(".post_body").text()

            result.add(ThreadPost(time, post, urlPath, index, body))
        }
        return result
    }

    fun getUserProfile(url: String): ForumUserProfile {
        val doc = connect(url)
        val username = doc.select("#one .largetext").first().text()
        val infoColumns = doc.select("#two td .float_right")
        val joined = infoColumns[0].text()
        val lastVisit = infoColumns[1].text()
        val onlineFor = infoColumns[2].text()
        val bankBalance = infoColumns[3].text()
        val shlTeam = infoColumns[4].text()
        return ForumUserProfile(url, username, joined, lastVisit, onlineFor, bankBalance, shlTeam)
    }

    fun connect(url: String): Document {
        println("Fetching `$url`")
        return Jsoup.connect(url).get()
    }
}