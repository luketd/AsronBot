package shl.scraper.index.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamInfoResponse(
    val id: Int,
    val season: Int,
    val league: Int,
    val conference: Int?,
    val division: Int?,
    val name: String,
    val abbreviation: String,
    val location: String,
    val nameDetails: TeamNameDetails
)

@JsonClass(generateAdapter = true)
data class TeamNameDetails(
    val first: String,
    val second: String
)