package shl.scraper.index.api

import com.squareup.moshi.JsonClass
import shl.scraper.index.TeamStats

@JsonClass(generateAdapter = true)
class LeagueDivision(
    val id: Int,
    val league: Int,
    val conference: Int,
    val name: String,
    val season: Int
) {
    var teams = emptyList<TeamStats>()
}