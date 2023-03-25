package shl.scraper.index.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class DetailedTeamStats(
    val id: Int,
    val season: Int,
    val league: Int,
    val conference: Int,
    val division: Int,
    val name: String,
    val abbreviation: String,
    val gamesPlayed: Int,
    val goalsFor: Int,
    val goalsAgainst: Int,
    val shotsFor: Int,
    val shotsAgainst: Int,
    val faceoffPct: Double,
    val shotsBlocked: Int,
    val hits: Int,
    val takeaways: Int,
    val giveaways: Int,
    val penaltyMinutesPerGame: Double,
    val ppOpportunities: Int,
    val ppGoalsFor: Int,
    val ppGoalsAgainst: Int,
    val shOpportunities: Int,
    val shGoalsFor: Int,
    val shGoalsAgainst: Int
) {
    val shotsForPerGame = shotsFor.toDouble() / gamesPlayed.coerceAtLeast(1)
    val shotsAgainstPerGame = shotsAgainst.toDouble() / gamesPlayed.coerceAtLeast(1)
    val shotDiff = shotsForPerGame - shotsAgainstPerGame

    val ppPercentage = 100.0 * ppGoalsFor.toDouble() / ppOpportunities.coerceAtLeast(1)
    val pkPercentage = 100.0 * (shOpportunities - ppGoalsAgainst).toDouble() / shOpportunities.coerceAtLeast(1)

    val goalsPerGame = goalsFor.toDouble() / gamesPlayed.coerceAtLeast(1)
    val goalsAgainstPerGame = goalsAgainst.toDouble() / gamesPlayed.coerceAtLeast(1)
}