package shl.scraper.index

import shl.scraper.roster.TeamInfo

class CareerStats(
    val name: String,
    val teamInfo: TeamInfo?,
    val position: String,
    val isGoalie: Boolean,
    val seasons: List<Season>
) {
    class Season(
        val leagueType: LeagueType,
        val season: Int,
        val regular: BasePlayerStats,
        val playoffs: BasePlayerStats?
    )
}