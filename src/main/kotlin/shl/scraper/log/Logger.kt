package shl.scraper.log

import shl.scraper.util.StorageManager
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

object Logger {
    private val file by lazy { StorageManager.getLogFile() }

    fun log(message: String) {
        file.appendText("[${getDate()}]: $message")
    }

    private fun getDate() = SimpleDateFormat("MMM dd hh:mm:ss a").format(Date())
}