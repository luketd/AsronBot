package shl.scraper.tpe

import shl.scraper.util.ThreadPost

class TpeClaim(
    val content: String,
    val userList: List<String>,
    val timestamp: Long,
    val post: ThreadPost,
    val season: Int,
    val juniors: Boolean
) {
    fun mentions(userName: String): Boolean {
        return userList.any {
            doesMatch(userName, it)
        }
    }

    companion object {
        fun doesMatch(userName: String, line: String): Boolean {
            return line.matches("(?i)\\s*$userName\\s*".toRegex())
                    || line.matches("(?i)\\s*$userName[\\s:-]+.*".toRegex())
        }
    }
}