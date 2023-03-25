package shl.scraper.custom

import com.squareup.moshi.Types
import shl.scraper.util.StorageManager

object CustomCommandRepository {
    private const val storagePath = "/customCommands.txt"
    private val jsonType = Types.newParameterizedType(List::class.java, CustomCommandInfo::class.java)

    private val commandsByServerId = mutableMapOf<String, MutableList<CustomCommandInfo>>()

    init {
        val commands = StorageManager.read<List<CustomCommandInfo>>(jsonType, storagePath) ?: emptyList()
        commands.forEach {
            commandsByServerId.putIfAbsent(it.serverId, mutableListOf())
            commandsByServerId[it.serverId]?.add(it)
        }
    }

    @Synchronized
    fun add(commandInfo: CustomCommandInfo) {
        commandsByServerId.putIfAbsent(commandInfo.serverId, mutableListOf())
        remove(commandInfo.serverId, commandInfo.name)
        commandsByServerId[commandInfo.serverId]?.add(commandInfo)
        save()
    }

    @Synchronized
    fun remove(serverId: String, commandName: String) {
        commandsByServerId[serverId]?.removeIf {
            it.name.equals(commandName, ignoreCase = true)
        }
        save()
    }

    fun find(serverId: String, message: String): CustomCommandInfo? {
        return commandsByServerId[serverId]?.find {
            message.equals(it.name, ignoreCase = true)
        }
    }

    fun getAllCommands(serverId: String, message: String): List<CustomCommandInfo>? {
        val prefix = message.replace("_all", "")
        return commandsByServerId[serverId]?.filter {
            it.name.matches("$prefix\\d*".toRegex())
        }
    }

    fun findAllForServer(serverId: String): List<CustomCommandInfo> {
        return commandsByServerId[serverId] ?: emptyList()
    }

    private fun save() {
        val commands = mutableListOf<CustomCommandInfo>()
        commandsByServerId.values.forEach {
            commands.addAll(it)
        }
        StorageManager.save(commands, jsonType, storagePath)
    }
}