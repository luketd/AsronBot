package shl.scraper.fantasy

data class FantasyGroup(
    val number: Int,
    val teams: List<FantasyTeam>
) {
    fun hasUser(name: String): Boolean {
        return teams.any {
            it.name.equals(name, ignoreCase = true)
        }
    }
}