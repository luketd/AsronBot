package shl.scraper.index

import com.squareup.moshi.JsonClass
import shl.scraper.util.afterDecimal

@JsonClass(generateAdapter = true)
data class GoalieStats(
    override val id: Int = 0,
    override val sthsId: Int? = null,
    override val name: String = "",
    override val league: Int = 0,
    override val season: Int = 0,
    override val team: String = "",
    override var teamId: Int = 0,
    override val gamesPlayed: Int = 0,
    val minutes: Int = 0,
    val wins: Int = 0,
    val losses: Int = 0,
    val ot: Int = 0,
    val shotsAgainst: Int = 0,
    val saves: Int = 0,
    val goalsAgainst: Int = 0,
    val gaa: Double = 0.0,
    val shutouts: Int = 0,
    val savePct: String = "",
    val gameRating: Int = 0,
    override var seasonType: SeasonType? = null
) : BasePlayerStats {
    val shotsAgainstPerGame = shotsAgainst.toDouble() / gamesPlayed.coerceAtLeast(1)

    operator fun plus(other: GoalieStats): GoalieStats {
        return other.copy(
            gamesPlayed = gamesPlayed + other.gamesPlayed,
            minutes = minutes + other.minutes,
            wins = wins + other.wins,
            losses = losses + other.losses,
            ot = ot + other.ot,
            shotsAgainst = shotsAgainst + other.shotsAgainst,
            saves = saves + other.saves,
            goalsAgainst = goalsAgainst + other.goalsAgainst,
            shutouts = shutouts + other.shutouts,
            gameRating = gameRating * gamesPlayed + other.gameRating * other.gamesPlayed,
        ).let { tmpCopy ->
            tmpCopy.copy(
                savePct = (tmpCopy.saves.toFloat() / tmpCopy.shotsAgainst).afterDecimal(3),
                gaa = 60.0 * (tmpCopy.goalsAgainst.toDouble() / tmpCopy.minutes)
            )
        }
    }
}