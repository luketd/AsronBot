package shl.scraper.config

import shl.scraper.util.StorageManager

object DynamicConfigRepository {
    private const val filePath = "/dynamicConfig.txt"

    var config: DynamicConfig

    init {
        config = StorageManager.read(DynamicConfig::class.java, filePath) ?: DynamicConfig()
    }

    fun save(config: DynamicConfig) {
        this.config = config
        StorageManager.save(config, DynamicConfig::class.java, filePath)
    }
}