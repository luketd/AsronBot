package shl.scraper.subscribe.claims

import shl.scraper.roster.TeamInfo

data class PtClaimSubscription(
    val team: TeamInfo?,
    val junior: Boolean,
    val serverId: String,
    val channelId: String,
    val mentionRoleId: String?,
    val lastRunTimestamp: Long? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PtClaimSubscription

        if (junior != other.junior) return false
        if (serverId != other.serverId) return false
        if (channelId != other.channelId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = junior.hashCode()
        result = 31 * result + serverId.hashCode()
        result = 31 * result + channelId.hashCode()
        return result
    }
}