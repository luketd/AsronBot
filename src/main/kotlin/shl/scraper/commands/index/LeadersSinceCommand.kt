package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseLeadersCommand
import shl.scraper.index.*

class LeadersSinceCommand : BaseLeadersCommand() {

    private var activePlayerIds = emptySet<Int>()

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val commandContent = event.message.contentDisplay

        val leagueType = if (commandContent.matches("(?i)!(since|alltime)j.*".toRegex())) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }
        val arg = event.parseArguments(arguments, leagueType)
        activePlayerIds = LeagueIndexRepository.getActivePlayerIds(leagueType)

        return if (arg.positionFilter != PositionFilter.G) {
            val skaters =
                LeagueIndexRepository.getPlayerStatsSince(
                    leagueType, arg.seasonType, arg.season, arg.positionFilter, arg.draftClass, arg.teamInfo
                ).filter {
                    when (arg.positionFilter) {
                        PositionFilter.F -> !it.isDefenseman
                        PositionFilter.D -> it.isDefenseman
                        else -> true
                    }
                }
            replyForSkaters(event, leagueType, arg.teamInfo, arg.playerName, skaters, arg.category, outputCount = 4)
        } else {
            val goalies = LeagueIndexRepository.getGoalieStatsSince(
                leagueType,
                arg.seasonType,
                arg.season,
                arg.draftClass,
                arg.teamInfo
            )
            val displayedCategories = GoalieCategoryFilter.values().filter {
                it != GoalieCategoryFilter.GameRating
            }
            replyForGoalies(
                event, arg, goalies, outputCount = 4, outputIneligible = true,
                minGamesPlayedPercentage = 0.3f, maxMinGamesPlayed = 200, categories = displayedCategories
            )
        }.apply {
            arg.teamInfo?.let { setDescription(it.fullName) }

            setTitle(buildString {
                val titleName = arg.teamInfo?.let { "Franchise" } ?: leagueType.name
                if (arg.seasonType != SeasonType.POST) {
                    append("$titleName leaders")
                } else {
                    append("$titleName postseason leaders")
                }

                val displayedSeason = arg.season?.coerceAtLeast(1) ?: 1
                when {
                    displayedSeason > 1 -> {
                        append(" (since S$displayedSeason)")
                    }

                    arg.draftClass == null -> {
                        append(" (all time)")
                    }
                }

                arg.positionFilter?.let { append(" (${it.name})") }
            }, "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}")
            arg.draftClass?.let { appendDescription("\nDraft class S$it") }
            appendToFooter("\n^active players")
        }
    }

    override fun toOutputName(stats: BasePlayerStats): String {
        return if (activePlayerIds.contains(stats.id)) {
            "^${stats.name}"
        } else {
            stats.name
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(since|alltime)j?(\\s+.+)?".toRegex()
    }

}