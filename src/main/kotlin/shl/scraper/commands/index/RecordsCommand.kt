package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseLeadersCommand
import shl.scraper.index.*

class RecordsCommand: BaseLeadersCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentDisplay.matches("(?i)!recordsj.*".toRegex())) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }
        val arg = event.parseArguments(arguments, leagueType)

        return if (arg.positionFilter != PositionFilter.G) {
            val skaters = LeagueIndexRepository.getPlayerStatsForRecords(leagueType, arg.seasonType, arg.teamInfo).filter {
                when (arg.positionFilter) {
                    PositionFilter.F -> !it.isDefenseman
                    PositionFilter.D -> it.isDefenseman
                    else -> true
                }
            }
            val displayedCategories = CategoryFilter.values().filter {
                it != CategoryFilter.GamesPlayed && it != CategoryFilter.PowerPlayPoints
            }
            replyForSkaters(event, leagueType, arg.teamInfo, arg.playerName, skaters, arg.category, displayedCategories, outputCount = 4)
        } else {
            val goalies = LeagueIndexRepository.getGoalieStatsForRecords(leagueType, arg.seasonType, arg.teamInfo)
            replyForGoalies(event, arg, goalies, outputCount = 4, minGamesPlayedPercentage = 0.5f)
        }.apply {
            if (arg.teamInfo != null) {
                setDescription(arg.teamInfo.fullName)
            }

            setTitle(buildString {
                val titleName = arg.teamInfo?.let { "Franchise" } ?: leagueType.name
                if (arg.seasonType != SeasonType.POST) {
                    append("$titleName single-season records")
                } else {
                    append("$titleName postseason records")
                }
                if (arg.positionFilter != null && arg.positionFilter != PositionFilter.G) {
                    append(" (since s53)")
                }

                arg.positionFilter?.let { append(" (${it.name})") }
            }, "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}")
        }
    }

    override fun toOutputName(stats: BasePlayerStats): String {
        return "s${stats.season} ${stats.name}"
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!recordsj?(\\s+.+)?".toRegex()
    }

}