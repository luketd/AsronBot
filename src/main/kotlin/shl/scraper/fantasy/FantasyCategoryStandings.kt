package shl.scraper.fantasy

data class FantasyCategoryStandings(
    val categoryName: String,
    val teams: List<FantasyCategoryTeam>
)