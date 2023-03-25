package shl.scraper.config

data class DynamicConfig(
    val shlClaimThreadIds: List<Int> = emptyList(),
    val juniorClaimThreads: List<Int> = emptyList(),
    val currentSeason: Int = 0,
    val fantasySheetId: String = "",
    val ignoreClaimPostIds: List<Long> = emptyList()
)