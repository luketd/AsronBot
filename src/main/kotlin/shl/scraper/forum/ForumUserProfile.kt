package shl.scraper.forum

data class ForumUserProfile(
    val link: String,
    val username: String,
    val joined: String,
    val lastVisit: String,
    val onlineFor: String,
    val bankBalance: String,
    val shlTeam: String
)