package shl.scraper.forum

class CacheValue<T>(
    val value: T,
    val timestamp: Long = System.currentTimeMillis()
) {
    fun isExpired(refreshMls: Long): Boolean {
        return System.currentTimeMillis() - timestamp > refreshMls
    }
}