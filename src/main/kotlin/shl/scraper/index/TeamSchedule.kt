package shl.scraper.index

import shl.scraper.index.api.GameInfo
import shl.scraper.roster.TeamInfo

class TeamSchedule(
    val teamName: String,
    val teamId: Int,
    val completedGames: List<GameInfo>,
    val upcomingGames: List<GameInfo>
) {
    fun getResult(game: GameInfo): GameResult? {
        return when (teamId) {
            game.homeTeam -> {
                when {
                    game.homeScore > game.awayScore -> {
                        GameResult.WIN
                    }
                    game.shootout > 0 || game.overtime > 0 -> {
                        GameResult.OTL
                    }
                    else -> {
                        GameResult.LOSS
                    }
                }
            }
            game.awayTeam -> {
                when {
                    game.awayScore > game.homeScore -> {
                        GameResult.WIN
                    }
                    game.shootout > 0 || game.overtime > 0 -> {
                        GameResult.OTL
                    }
                    else -> {
                        GameResult.LOSS
                    }
                }
            }
            else -> {
                null
            }
        }
    }
}