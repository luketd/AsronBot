package shl.scraper.index.api

import com.squareup.moshi.JsonClass
import shl.scraper.index.LeagueType
import shl.scraper.index.SeasonType
import java.text.SimpleDateFormat

@JsonClass(generateAdapter = true)
class GameInfo(
    val season: Int,
    val league: Int,
    val date: String,
    val homeTeam: Int,
    val homeScore: Int,
    val awayTeam: Int,
    val awayScore: Int,
    val type: String,
    val played: Int,
    val overtime: Int,
    val shootout: Int,
    val slug: String
) {
    val timestamp = SimpleDateFormat("yyyy-MM-dd").parse(date).time
    var awayTeamInfo: TeamInfoResponse? = null
    var homeTeamInfo: TeamInfoResponse? = null
    var seasonType: SeasonType? = null
    val leagueType = LeagueType.values()[league]
    val boxScoreLink: String
        get() = "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}/$season/game/$slug"/*?type=${seasonType?.apiName}"*/
}