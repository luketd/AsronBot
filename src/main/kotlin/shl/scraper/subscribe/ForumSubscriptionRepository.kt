package shl.scraper.subscribe

import com.squareup.moshi.Types
import shl.scraper.Discord
import shl.scraper.util.StorageManager


object ForumSubscriptionRepository {
    private val storagePath = "/forumStreamConfigs.txt"
    private val jsonType = Types.newParameterizedType(Set::class.java, ForumSubscription::class.java)

    var configs = mutableSetOf<ForumSubscription>()
    private var tasksByConfig = mutableMapOf<ForumSubscription, ForumMonitorTask>()

    private var discord: Discord? = null

    @Synchronized
    fun start(discord: Discord) {
        try {
            StorageManager.read<Set<ForumSubscription>>(jsonType, storagePath)?.let { saved ->
                configs.addAll(saved)
            }
        } catch (e: Exception) {
        }

        this.discord = discord
        configs.forEach {
            tasksByConfig[it] = ForumMonitorTask(it, discord)
        }
    }

    @Synchronized
    fun add(config: ForumSubscription) {
        if (!tasksByConfig.containsKey(config)) {
            tasksByConfig[config] = ForumMonitorTask(config, discord!!)
        }
        configs.remove(config)
        configs.add(config)
        StorageManager.save(configs, jsonType, storagePath)
    }

    @Synchronized
    fun remove(config: ForumSubscription) {
        tasksByConfig.remove(config)?.cancel()
        configs.remove(config)
        StorageManager.save(configs, jsonType, storagePath)
    }
}