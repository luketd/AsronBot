package shl.scraper.util

object UrlProvider {
    private val baseUrl = "http://simulationhockey.com"

    fun forum(forumId: Int, page: Int): String {
        return withBaseUrl("forumdisplay.php?fid=$forumId&page=$page")
    }

    fun thread(threadId: Int, page: Int = 1): String {
        return withBaseUrl("showthread.php?tid=$threadId&page=$page")
    }

    fun withBaseUrl(path: String): String {
        return "$baseUrl/$path"
    }
}