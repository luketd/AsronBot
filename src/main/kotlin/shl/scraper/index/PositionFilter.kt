package shl.scraper.index

enum class PositionFilter {
    F,
    D,
    G
}

val PositionFilter?.displayName: String
    get() = when (this) {
        PositionFilter.F -> "forwards"
        PositionFilter.D -> "defensemen"
        PositionFilter.G -> "goalies"
        null -> "players"
    }