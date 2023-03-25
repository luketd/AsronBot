package shl.scraper.subscribe

data class ForumSubscription(
    val forumId: Int,
    val serverId: String,
    val channelId: String,
    val mentionRoleId: String? = null,
    val lastThreadId: Int = 0,
    val lastDueTodayReminderDayOfMonth: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ForumSubscription

        if (forumId != other.forumId) return false
        if (serverId != other.serverId) return false
        if (channelId != other.channelId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = forumId
        result = 31 * result + serverId.hashCode()
        result = 31 * result + channelId.hashCode()
        return result
    }
}