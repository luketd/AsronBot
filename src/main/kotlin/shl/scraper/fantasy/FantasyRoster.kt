package shl.scraper.fantasy

data class FantasyRoster(
    val teamName: String,
    val players: List<FantasyPlayer>,
    val skaterSwap: FantasySwap?,
    val goalieSwap: FantasySwap?,
    val totalScore: Double
)