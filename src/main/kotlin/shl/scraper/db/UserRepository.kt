package shl.scraper.db

import shl.scraper.util.StorageManager

object UserRepository {
    private val filePath = "/users.txt"
    private val userDb: UserDb
    private val usersByDiscordId: MutableMap<String, UserInfo> = mutableMapOf()

    init {
        userDb = StorageManager.read(UserDb::class.java, filePath) ?: UserDb()
        userDb.users.forEach { user ->
            usersByDiscordId[user.discordId] = user
        }
    }

    @Synchronized
    fun save(userInfo: UserInfo) {
        userDb.users.removeIf { it.discordId == userInfo.discordId }
        userDb.users.add(userInfo)
        usersByDiscordId[userInfo.discordId] = userInfo
        StorageManager.save(userDb, userDb.javaClass, filePath)
    }

    fun find(discordId: String): UserInfo? {
        return usersByDiscordId[discordId]
    }
}