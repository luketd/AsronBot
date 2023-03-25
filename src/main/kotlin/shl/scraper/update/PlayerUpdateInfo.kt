package shl.scraper.update

import shl.scraper.util.ForumThread
import java.text.SimpleDateFormat
import java.util.*

class PlayerUpdateInfo(val updated: Boolean, val updateThread: ForumThread) {
    fun getTimeSince(): String {
        val lastUpdate = updateThread.prettyLastPostDate
        return when {
            lastUpdate.contains("ago") -> "Today"
            lastUpdate.contains("Today") -> "Today"
            lastUpdate.contains("less than") -> "Today"
            lastUpdate.contains("Yesterday") -> "Yesterday"
            else -> {
                val date = SimpleDateFormat("MM-dd-yyyy, hh:mm aa", Locale.US).parse(lastUpdate)

                "${((Date().time - date.time).toFloat() / 1000 / 60 / 60 / 24).toInt()} days ago"
            }
        }
    }
}