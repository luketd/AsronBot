package shl.scraper.roster

class Roster(
    val teamInfo: TeamInfo,
    val players: List<RosterPlayer>,
    val prospects: List<RosterPlayer> = emptyList(),
    val gms: List<TeamGm>
) {
    val playersPlusProspects = (players + prospects).map { it.userName }.toSet().mapNotNull { name ->
        players.find { it.userName == name } ?: prospects.find { it.userName == name }
    }

    val forwards = players.filter { it.position?.isForward == true }
    val defense = players.filter { it.position == RosterPosition.D }
    val goalies = players.filter { it.position == RosterPosition.G }

    fun averageTpe(season: Int) = players.mapNotNull { it.appliedTpe(season, teamInfo) }.average()

    fun averageTpeForwards(season: Int) = forwards.mapNotNull { it.appliedTpe(season, teamInfo) }.average()
    fun averageTpeDefense(season: Int) = defense.mapNotNull { it.appliedTpe(season, teamInfo) }.average()
    fun averageTpeSkaters(season: Int) = players.filter { it.position != RosterPosition.G }.mapNotNull { it.appliedTpe(season, teamInfo) }.average()

    val startingGoalie = goalies.sortedByDescending { it.tpe }.getOrNull(0)
    val backupGoalie = goalies.sortedByDescending { it.tpe }.getOrNull(1)

    fun find(query: String): RosterPlayer? {
        return players.find {
            it.userName.equals(query, ignoreCase = true)
        } ?: prospects.find { it.userName.equals(query, ignoreCase = true) }
    }
}