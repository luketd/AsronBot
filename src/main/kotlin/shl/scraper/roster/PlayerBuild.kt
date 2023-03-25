package shl.scraper.roster

data class PlayerBuild(
    val pointsAvailable: Int?,
    val offensiveRatings: String,
    val defensiveRatings: String,
    val physicalRatings: String,
    val mentalRatings: String
)

data class GoalieBuild(
    val pointsAvailable: Int?,
    val attributes: List<String>
)