package shl.scraper.util

import org.jsoup.nodes.Element
import java.text.SimpleDateFormat
import java.util.*

class ThreadPost(
    val time: String,
    val doc: Element,
    val urlPath: String,
    val postIndex: Int,
    val body: String
) {
    val timestamp = SimpleDateFormat("MM-dd-yyyy, hh:mm aa", Locale.US).apply {
        timeZone = TimeZone.getTimeZone("America/New_York")
    }.parse(time).time

    val link = UrlProvider.withBaseUrl(urlPath)

    val postId = doc.id().replace("post_", "").toLong()
}