package shl.scraper.roster

import shl.scraper.index.LeagueType
import shl.scraper.util.ForumThread

class RosterPlayer(
    val teamInfo: TeamInfo,
    val text: String,
    val tpe: Int?,
    val userName: String,
    val season: Int?,
    val forumThread: ForumThread
) {
    val position by lazy {
        val tmp = text.split("\\s*-\\s*".toRegex())
        matchRosterPosition(tmp[0].replaceFirst("([\\[(])S\\d+([])])".toRegex(), "").trim())
    }
    val playerName by lazy {
        text.split("\\s*-\\s*".toRegex()).getOrNull(1)?.trim().orEmpty()
    }

    fun appliedTpe(currentSeason: Int, teamInfo: TeamInfo): Int? {
        return when {
            tpe != null && season != null -> {
                when {
                    teamInfo.leagueType != LeagueType.SMJHL -> {
                        tpe
                    }
                    currentSeason <= season -> {
                        tpe.coerceAtMost(350)
                    }
                    else -> {
                        tpe.coerceAtMost(425)
                    }
                }
            }
            tpe != null -> {
                tpe
            }
            else -> {
                null
            }
        }
    }

    private fun matchRosterPosition(input: String): RosterPosition? {
        return RosterPosition.values().firstOrNull { it.regex.matches(input.toLowerCase()) }
    }
}