package shl.scraper.fantasy

import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.store.FileDataStoreFactory
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import shl.scraper.config.GOOGLE_SHEETS_REFRESH
import shl.scraper.forum.CacheValue
import java.io.File
import java.io.InputStreamReader

object GoogleSheetsRepository {
    private const val APPLICATION_NAME = "Google Sheets API Java Quickstart"
    private val JSON_FACTORY: JsonFactory = JacksonFactory.getDefaultInstance()
    private const val TOKENS_DIRECTORY_PATH = "tokens"

    private val SCOPES = listOf(SheetsScopes.SPREADSHEETS_READONLY)
    private const val CREDENTIALS_FILE_PATH = "storage/credentials.json"

    private val cache = mutableMapOf<String, CacheValue<List<Any>>>()

    private fun getCredentials(HTTP_TRANSPORT: NetHttpTransport): Credential {
        // Load client secrets.
        val file = File(CREDENTIALS_FILE_PATH).inputStream()
        val clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, InputStreamReader(file))

        // Build flow and trigger user authorization request.
        val flow = GoogleAuthorizationCodeFlow.Builder(
            HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES
        )
            .setDataStoreFactory(FileDataStoreFactory(File(TOKENS_DIRECTORY_PATH)))
            .setAccessType("offline")
            .build()
        val receiver = LocalServerReceiver.Builder().setPort(8888).build()
        return AuthorizationCodeInstalledApp(flow, receiver).authorize("user")
    }

    fun getValues(sheetId: String, range: String, cacheOnly: Boolean = false): List<Any> {
        return checkCache(sheetId, range, cacheOnly) {
            if (sheetId.isEmpty()) {
                throw IllegalStateException("Fantasy sheet id is empty")
            }
            val httpTransport = GoogleNetHttpTransport.newTrustedTransport()
            val service = Sheets.Builder(httpTransport, JSON_FACTORY, getCredentials(httpTransport))
                .setApplicationName(APPLICATION_NAME)
                .build()
            val response = service.spreadsheets().values()[sheetId, range].execute()
            val result = response.getValues() ?: emptyList()
            result
        }.value
    }

    private fun checkCache(sheetId: String, range: String, cacheOnly: Boolean,
                           getValue: () -> List<Any>?): CacheValue<List<Any>> {
        val key = sheetId+range
        val cached = cache[key]
        return if (cached == null || !cacheOnly && cached.isExpired(GOOGLE_SHEETS_REFRESH)) {
            val updatedValue = getValue()
            if (updatedValue != null) {
                val result = CacheValue(updatedValue)
                cache[key] = result
                result
            } else {
                cached ?: CacheValue(emptyList())
            }
        } else {
            cached
        }
    }
}