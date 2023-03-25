package shl.scraper

import shl.scraper.config.*
import shl.scraper.fantasy.GoogleSheetsFantasyRepository
import shl.scraper.index.api.ShlIndexApiClient
import shl.scraper.index.api.SmjhlIndexApiClient
import shl.scraper.roster.RosterRepository
import shl.scraper.subscribe.ForumSubscriptionRepository
import shl.scraper.subscribe.claims.PtClaimSubscriptionRepository
import shl.scraper.tpe.TpeClaimRepository
import java.util.*
import java.util.concurrent.Executors

fun main(args: Array<String>) {
    val buildType = if (args.firstOrNull()?.toBoolean() == true) BuildType.RELEASE else BuildType.DEBUG
    println("buildType = $buildType")
    BuildTypeConfigProvider.init(buildType)

    val discord = Discord()

    ForumSubscriptionRepository.start(discord)
    PtClaimSubscriptionRepository.start(discord)

    if (buildType.isRelease) {
        Executors.newSingleThreadExecutor().execute {
            loadInitialData()
            scheduleLeagueIndexRefresh()
            scheduleFantasyRefresh()
            scheduleRosterMapRefresh()
        }
    }
}

private fun scheduleLeagueIndexRefresh() {
    Timer().scheduleAtFixedRate(
        object : TimerTask() {
            override fun run() {
                ShlIndexApiClient.reloadIfError()
                SmjhlIndexApiClient.reloadIfError()
            }
        }, INDEX_STATS_REFRESH, INDEX_STATS_REFRESH
    )
}

private fun scheduleFantasyRefresh() {
    Timer().scheduleAtFixedRate(
        object : TimerTask() {
            override fun run() {
                try {
                    GoogleSheetsFantasyRepository.updateCache()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }, GOOGLE_SHEETS_REFRESH, GOOGLE_SHEETS_REFRESH
    )
}

private fun scheduleRosterMapRefresh() {
    Timer().scheduleAtFixedRate(
        object : TimerTask() {
            override fun run() {
                try {
                    RosterRepository.updateMaps()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }, ROSTER_REFRESH, ROSTER_REFRESH
    )
}

private fun loadInitialData() {
    try {
        ShlIndexApiClient.reload()
        SmjhlIndexApiClient.reload()
        RosterRepository.updateMaps()
        for (i in 0..3) {
            TpeClaimRepository.getClaimsForPlayer(DynamicConfigRepository.config.currentSeason - i)
        }
        GoogleSheetsFantasyRepository.updateCache(force = true)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}