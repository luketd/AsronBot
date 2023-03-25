package shl.scraper.index.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class AvailableSeason(
    @Json(name = "id")
    val leagueId: Int,
    val season: Int
)