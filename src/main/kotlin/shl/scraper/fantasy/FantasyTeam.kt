package shl.scraper.fantasy

import shl.scraper.util.afterDecimal

data class FantasyTeam(
    val name: String,
    val scoreDouble: Double,
    val paceDouble: Double
) {
    val score = scoreDouble.afterDecimal(1)
    val pace = paceDouble.afterDecimal(1)
}