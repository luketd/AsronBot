package shl.scraper.index

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import shl.scraper.index.api.DetailedTeamStats
import shl.scraper.index.api.TeamInfoResponse
import shl.scraper.roster.TeamInfo

@JsonClass(generateAdapter = true)
data class TeamStats(
    val id: Int = 0,
    val name: String = "",
    @Json(name = "gp") val games: Int = 0,
    val wins: Int = 0,
    val losses: Int = 0,
    @Json(name = "OTW") val otw: Int = 0,
    @Json(name = "OTL") val otl: Int = 0,
    val points: Int = 0,
    val goalsFor: Int = 0,
    val goalsAgainst: Int = 0,

    val home: Record = Record(),
    val away: Record = Record(),
    val shootout: Record = Record()
) {
    var teamInfo: TeamInfo? = null
    var detailedStats: DetailedTeamStats? = null
    var teamInfoResponse: TeamInfoResponse? = null
        set(value) {
            field = value

            teamInfo = value?.let { TeamIdRepository.requireTeamInfoForFhmId(it) }
        }
    var regularSeasonPlayerStats: List<PlayerStats>? = null

    val conference: Int
        get() = teamInfoResponse?.conference ?: -1

    val division: Int
        get() = teamInfoResponse?.division ?: -1

    var conferencePosition = 0
    var leaguePosition = 0
    var divisionPosition = 0
    var goalsForRank = 0
    var goalsAgainstRank = 0
    var pdoRank = 0
    var corsiRank = 0
    var shotsForRank = 0
    var shotsAgainstRank = 0
    var shotDiffRank = 0
    var pimsRank = 0
    var ppRank = 0
    var pkRank = 0

    val goalsPerGame = goalsFor.toDouble() / games.coerceAtLeast(1)
    val goalsAgainstPerGame = goalsAgainst.toDouble() / games.coerceAtLeast(1)

    val pdo: Double?
        get() = regularSeasonPlayerStats?.map { it.advancedStats.PDO }?.average()

    val corsi: Double?
        get() = regularSeasonPlayerStats?.map { it.advancedStats.CFPct }?.average()

    @JsonClass(generateAdapter = true)
    class Record(
        val wins: Int = 0,
        val losses: Int = 0,
        @Json(name = "OTL") val otl: Int = 0
    )
}