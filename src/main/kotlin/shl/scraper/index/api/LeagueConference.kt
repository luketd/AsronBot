package shl.scraper.index.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class LeagueConference (
    val id: Int,
    val league: Int,
    val name: String,
    val season: Int
)