package shl.scraper.fantasy

data class FantasySwap(
    val dropCurrent: FantasyPlayer,
    val dropFinal: FantasyPlayer,

    val addCurrent: FantasyPlayer,
    val addMinus: FantasyPlayer
) {
    val gained = addCurrent.fantasyPoints - dropCurrent.fantasyPoints - addMinus.fantasyPoints + dropFinal.fantasyPoints
}