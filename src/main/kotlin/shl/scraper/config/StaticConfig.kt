package shl.scraper.config

import java.util.concurrent.TimeUnit

sealed class BuildTypeConfig(
    val discordBotToken: String,
    val indexUpdateServerId: String,
    val indexUpdateChannelId: String
) {
    object Debug : BuildTypeConfig(
        discordBotToken = System.getenv("releaseBotToken"),
        indexUpdateServerId = System.getenv("testServerId"),
        indexUpdateChannelId = "623122991504687104"
    )

    object Release : BuildTypeConfig(
        discordBotToken = System.getenv("releaseBotToken"),
        indexUpdateServerId = "602893231621144586",
        indexUpdateChannelId = "816772168045953084"
    )
}

object BuildTypeConfigProvider {
    lateinit var buildType: BuildType
        private set

    val config: BuildTypeConfig
        get() = when (buildType) {
            BuildType.DEBUG -> BuildTypeConfig.Debug
            BuildType.RELEASE -> BuildTypeConfig.Release
        }

    fun init(buildType: BuildType) {
        this.buildType = buildType
    }
}

enum class BuildType {
    DEBUG,
    RELEASE;

    val isDebug: Boolean
        get() = this == DEBUG

    val isRelease: Boolean
        get() = this == RELEASE
}

const val BOT_ID = "623014007221256192"
const val HAM_SERVER_ID = "207189819367882752"
val EMOJI_SERVER_IDS = listOf("207189819367882752", System.getenv("testServerId"))
val BOT_OWNER_IDS = listOf("298314353323671554")
val BOT_CO_OWNER_IDS = listOf("187307011929538560")

val INDEX_STATS_REFRESH = TimeUnit.HOURS.toMillis(1)
val FORUM_THREAD_LIST_REFRESH = TimeUnit.MINUTES.toMillis(60)
val FORUM_THREAD_POST_REFRESH = TimeUnit.MINUTES.toMillis(60)
val GOOGLE_SHEETS_REFRESH = TimeUnit.HOURS.toMillis(1)
val ROSTER_REFRESH = TimeUnit.DAYS.toMillis(1)

const val GOOGLE_SHEET_URL_FORMAT = "https://docs.google.com/spreadsheets/d/%s"
const val FANTASY_INDEX_RANGE = "Index!A1:Q164"
const val FANTASY_GLOBAL_RANGE = "Global!D4:E323"
const val FANTASY_CATEGORIES_RANGE = "Categories!C3:Z324"
const val FANTASY_TEAM_RANGE_FORMAT = "%d!C17:V167"
const val FANTASY_NO_SWAP_NAME = "None"

const val API_URL = "https://index.simulationhockey.com/api/v1/"