package shl.scraper.subscribe.claims

import com.squareup.moshi.Types
import shl.scraper.Discord
import shl.scraper.util.StorageManager

object PtClaimSubscriptionRepository {
    private val storagePath = "/ptClaimStreamConfigs.txt"
    private val jsonType = Types.newParameterizedType(Set::class.java, PtClaimSubscription::class.java)

    var configs = mutableSetOf<PtClaimSubscription>()
    private var tasksByConfig = mutableMapOf<PtClaimSubscription, PtClaimsTask>()

    private var discord: Discord? = null

    fun start(discord: Discord) {
        try {
            StorageManager.read<Set<PtClaimSubscription>>(jsonType, storagePath)?.let { saved ->
                configs.addAll(saved)
            }
        } catch (e: Exception) {
        }

        this.discord = discord
        configs.forEach {
            tasksByConfig[it] = PtClaimsTask(it, discord)
        }
    }

    fun add(config: PtClaimSubscription) {
        if (!tasksByConfig.containsKey(config)) {
            tasksByConfig[config] = PtClaimsTask(config, discord!!)
        }
        configs.remove(config)
        configs.add(config)
        StorageManager.save(configs, jsonType, storagePath)
    }

    fun remove(config: PtClaimSubscription) {
        tasksByConfig.remove(config)?.cancel()
        configs.remove(config)
        StorageManager.save(configs, jsonType, storagePath)
    }
}