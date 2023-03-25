package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseLeadersCommand
import shl.scraper.index.*

class LeagueLeadersCommand : BaseLeadersCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {

        val leagueType = if (event.message.contentDisplay.matches("(?i)!leadersj.*".toRegex())) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }
        val arg = event.parseArguments(arguments, leagueType, allowRookieFilter = true)

        return if (arg.positionFilter != PositionFilter.G) {
            val skaters = LeagueIndexRepository.getPlayerStatsForLeaders(
                leagueType, arg.seasonType, arg.season, arg.positionFilter, arg.teamInfo, arg.isRookies
            )
            val displayedCategories = CategoryFilter.values().filter {
                it != CategoryFilter.GamesPlayed && it != CategoryFilter.PowerPlayPoints
            }
            replyForSkaters(event, leagueType, arg.teamInfo, arg.playerName, skaters, arg.category, displayedCategories).apply {
                setInfo(skaters.firstOrNull()?.season, skaters.firstOrNull()?.seasonType, null)
            }
        } else {
            val goalies = LeagueIndexRepository.getGoalieStatsForLeaders(
                leagueType, arg.seasonType, arg.season, arg.teamInfo, arg.isRookies
            )
            val displayedCategories = GoalieCategoryFilter.values().filter {
                it != GoalieCategoryFilter.GameRating || arg.season == null || arg.season >= 53
            }
            replyForGoalies(event, arg, goalies, outputIneligible = true, categories = displayedCategories).apply {
                setInfo(goalies.firstOrNull()?.season, goalies.firstOrNull()?.seasonType, null)
            }
        }.apply {
            val title = buildString {
                append(if (arg.teamInfo != null) "Team" else leagueType.name)
                if (arg.isRookies) {
                    append(" rookie")
                }
                append(" leaders")
                arg.positionFilter?.let {
                    append(" (${it.name})")
                }
            }
            arg.teamInfo?.let { appendDescription("\n${it.fullName}") }
            setTitle(title, "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}/leaders")
        }
    }

    override fun toOutputName(stats: BasePlayerStats): String {
        return "${stats.team} ${stats.name}"
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!leaders.*".toRegex()
    }

}