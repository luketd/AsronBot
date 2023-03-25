package shl.scraper.index

interface BasePlayerStats {
    val name: String
    val team: String
    val teamId: Int
    val gamesPlayed: Int
    val season: Int
    val id: Int
    val sthsId: Int?
    val league: Int
    var seasonType: SeasonType?
}