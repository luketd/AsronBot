package shl.scraper.roster

enum class RosterPosition(val regex: Regex, val displayName: String, val isForward: Boolean = false) {
    C("c|center".toRegex(), "C", isForward = true),
    LW("lw|left wing(er)?".toRegex(), "LW", isForward = true),
    RW("rw|right wing(er)?".toRegex(), "RW", isForward = true),
    D("d|defense|left defense|right defense|ld|rd".toRegex(), "D"),
    G("g|goalie".toRegex(), "G");
}

val RosterPosition.generalDisplayName
    get() = when (this) {
        RosterPosition.C,
        RosterPosition.LW,
        RosterPosition.RW -> "F"
        RosterPosition.D -> "D"
        RosterPosition.G -> "G"
    }