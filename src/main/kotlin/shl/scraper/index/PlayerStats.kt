package shl.scraper.index

import com.squareup.moshi.JsonClass
import shl.scraper.util.afterDecimal
import kotlin.math.roundToInt

@JsonClass(generateAdapter = true)
data class PlayerStats(
    override val id: Int = 0,
    override val sthsId: Int? = null,
    override val name: String = "",
    val position: String = "",
    override val team: String = "",
    override var teamId: Int = 0,
    override val gamesPlayed: Int = 0,
    override val league: Int = 0,
    override val season: Int = 0,
    val timeOnIce: Int = 0,
    val goals: Int = 0,
    val assists: Int = 0,
    val points: Int = 0,
    val plusMinus: Int = 0,
    val pim: Int = 0,
    val ppGoals: Int = 0,
    val ppAssists: Int = 0,
    val ppPoints: Int? = 0,
    val ppTimeOnIce: Int = 0,
    val shGoals: Int = 0,
    val shAssists: Int = 0,
    val shPoints: Int = 0,
    val shTimeOnIce: Int = 0,
    val fights: Int = 0,
    val fightWins: Int = 0,
    val fightLosses: Int = 0,
    val hits: Int = 0,
    val giveaways: Int = 0,
    val takeaways: Int = 0,
    val shotsOnGoal: Int = 0,
    val shotsBlocked: Int = 0,
    val gameRating: Int = 0,
    val offensiveGameRating: Int = 0,
    val defensiveGameRating: Int = 0,
    val faceoffs: Int? = null,
    val faceoffWins: Int? = null,
    val gwg: Int? = null,
    val advancedStats: AdvancedStats = AdvancedStats(),
    override var seasonType: SeasonType? = null
) : BasePlayerStats {
    val pointsPerGame = points.toDouble() / gamesPlayed.coerceAtLeast(1)
    val onPace = (66 * pointsPerGame).roundToInt()

    val plusMinusDisplay = if (plusMinus > 0) {
        "+$plusMinus"
    } else {
        plusMinus.toString()
    }

    val shootingPercentage = 100.0 * goals / shotsOnGoal.coerceAtLeast(1)
    val faceoffsPercentage = if (faceoffs != null && faceoffWins != null) {
        100.0 * faceoffWins / faceoffs.coerceAtLeast(1)
    } else {
        null
    }

    val isDefenseman = position == "RD" || position == "LD"

    val fantasyPoints =
        goals * 4 + assists * 3 + 0.3 * shotsOnGoal + 0.4 * hits + shotsBlocked * if (isDefenseman) 0.9 else 0.6

    val toi: String = toToi(timeOnIce)
    val pptoi: String = toToi(ppTimeOnIce)
    val shtoi: String = toToi(shTimeOnIce)

    val taGaRatio = (takeaways.toFloat() / giveaways.coerceAtLeast(1)).afterDecimal(2)

    private fun toToi(minutes: Int): String {
        val games = gamesPlayed.coerceAtLeast(1)
        val avg = minutes.toFloat() / games / 60
        val avgMinutes = avg.toInt()
        val avgSeconds = (60 * (avg - avgMinutes)).roundToInt()
        return "$avgMinutes:%02d".format(avgSeconds)
    }

    operator fun plus(other: PlayerStats): PlayerStats {
        return other.copy(
            gamesPlayed = gamesPlayed + other.gamesPlayed,
            goals = goals + other.goals,
            assists = assists + other.assists,
            points = points + other.points,
            plusMinus = plusMinus + other.plusMinus,
            pim = pim + other.pim,
            shotsBlocked = shotsBlocked + other.shotsBlocked,
            hits = hits + other.hits,
            shotsOnGoal = shotsOnGoal + other.shotsOnGoal,
            ppPoints = (ppPoints ?: 0) + (other.ppPoints ?: 0)
        )
    }

    @JsonClass(generateAdapter = true)
    class AdvancedStats(
        val PDO: Float = 0f,
        val GF60: Float = 0f,
        val GA60: Float = 0f,
        val SF60: Float = 0f,
        val SA60: Float = 0f,
        val CF: Int = 0,
        val CA: Int = 0,
        val CFPct: Float = 0f,
        val CFPctRel: Float = 0f,
        val FF: Float = 0f,
        val FA: Float = 0f,
        val FFPct: Float = 0f,
        val FFPctRel: Float = 0f
    )
}