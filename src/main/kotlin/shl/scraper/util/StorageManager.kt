package shl.scraper.util

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.io.File
import java.lang.reflect.ParameterizedType

object StorageManager {
    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    fun <T> save(value: T, type: Class<T>, path: String) {
        getFile(path).writeText(moshi.adapter(type).toJson(value))
    }

    fun <T> save(value: T, type: ParameterizedType, path: String) {
        getFile(path).writeText(moshi.adapter<T>(type).toJson(value))
    }

    fun <T> read(type: Class<T>, path: String): T? {
        val file = getFile(path)
        return if (file.exists()) {
            moshi.adapter(type).fromJson(file.readText())
        } else {
            null
        }
    }

    fun <T> read(type: ParameterizedType, path: String): T? {
        val file = getFile(path)
        return if (file.exists()) {
            moshi.adapter<T>(type).fromJson(file.readText())
        } else {
            null
        }
    }

    private fun getFile(path: String) = File("storage$path")

    fun getLogFile() = File("storage/logs/${System.currentTimeMillis()}.txt").also {
        it.parentFile.mkdirs()
        it.createNewFile()
    }
}