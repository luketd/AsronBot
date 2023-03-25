package shl.scraper.index.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class PlayoffSeries(
    val league: Int,
    val season: Int,
    val team1: Team,
    val team2: Team
) {
    @JsonClass(generateAdapter = true)
    class Team(
        val id: Int,
        val wins: Int,
        val name: String,
        val nickname: String,
        val abbr: String
    ) {
        var teamInfo: TeamInfoResponse? = null

        val fullName: String
            get() = teamInfo?.name ?: name
    }
}