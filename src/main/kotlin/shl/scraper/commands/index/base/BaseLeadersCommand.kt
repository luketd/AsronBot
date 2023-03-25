package shl.scraper.commands.index.base

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.index.*
import shl.scraper.roster.TeamInfo
import shl.scraper.util.afterDecimal
import kotlin.math.roundToInt

abstract class BaseLeadersCommand : BaseIndexCommand() {

    protected fun MessageReceivedEvent.parseArguments(
        arguments: List<String>,
        leagueType: LeagueType,
        allowRookieFilter: Boolean = false
    ): LeadersArgs {
        val season = arguments.tryFindSeason()
        val seasonType = arguments.tryFindSeasonType()
        val positionFilter = arguments.tryFindPositionFilter()
        val rookieArg = arguments.find { it == "-r" || it == "-R" }
        val categoryFilter = kotlin.run {
            if (positionFilter == PositionFilter.G) {
                return@run null
            }
            arguments.forEach { arg ->
                CategoryFilter.values().find { it.regex.matches(arg.removePrefix("-")) }?.let {
                    return@run it
                }
            }

            null
        }
        val goalieCategoryFilter = kotlin.run {
            if (positionFilter != PositionFilter.G) {
                return@run null
            }
            arguments.forEach { arg ->
                GoalieCategoryFilter.values().find { it.regex.matches(arg.removePrefix("-")) }?.let {
                    return@run it
                }
            }

            null
        }
        val draftClass = arguments.find { it.matches("-?dc\\d+".toRegex()) }
            ?.replace("-?dc".toRegex(), "")
            ?.toIntOrNull()
        val teamInfo = kotlin.run {
            arguments.forEach { arg ->
                TeamInfo.values()
                    .filter { it.leagueType == leagueType }
                    .find { it.nameRegex.matches(arg.removePrefix("-")) }
                    ?.let {
                        return@run it
                    }
            }

            null
        }
        val skip = listOfNotNull(
            season,
            seasonType,
            categoryFilter,
            positionFilter,
            draftClass,
            teamInfo,
            goalieCategoryFilter,
            rookieArg
        ).size
        val playerName = arguments.getName(this, skip)

        return LeadersArgs(
            leagueType = leagueType,
            season = season,
            seasonType = seasonType ?: SeasonType.REGULAR,
            category = categoryFilter,
            positionFilter = positionFilter,
            goalieCategory = goalieCategoryFilter,
            playerName = playerName,
            draftClass = draftClass,
            teamInfo = teamInfo,
            isRookies = allowRookieFilter && rookieArg != null
        )
    }

    protected fun replyForGoalies(
        event: MessageReceivedEvent,
        arg: LeadersArgs,
        goalies: List<GoalieStats>,
        outputCount: Int = 3,
        minGamesPlayedPercentage: Float = 0.3f,
        maxMinGamesPlayed: Int? = null,
        outputIneligible: Boolean = false,
        categories: List<GoalieCategoryFilter> = GoalieCategoryFilter.values().toList()
    ): BaseEmbedBuilder {
        val leagueType: LeagueType = arg.leagueType
        val playerName: String? = arg.playerName
        val teamInfo: TeamInfo? = arg.teamInfo
        val goalieCategory = arg.goalieCategory

        val totalGames = goalies.maxByOrNull { it.gamesPlayed }?.gamesPlayed ?: 0
        val minGamesPlayed =
            (minGamesPlayedPercentage * totalGames).roundToInt().coerceAtMost(maxMinGamesPlayed ?: 10000)

        return BaseEmbedBuilder(logoUrl = teamInfo?.logoUrl ?: leagueType.logoUrl, event = event).apply {
            if (goalieCategory == null) {
                categories.forEachIndexed { index, category ->
                    addCategory(
                        category.displayName,
                        goalies,
                        playerName,
                        outputCount,
                        outputIneligible,
                        minGamesPlayed.takeIf { category.minGamesRestricted } ?: 0,
                        category.output,
                        category.selector
                    )
                    if (index > 0 && index % 2 == 1) {
                        addField(inline = true) { }
                    }
                }
            } else {
                addCategory(
                    goalieCategory.displayName,
                    goalies,
                    playerName,
                    30,
                    outputIneligible,
                    minGamesPlayed.takeIf { goalieCategory.minGamesRestricted } ?: 0,
                    goalieCategory.output,
                    goalieCategory.selector
                )
            }

            if (minGamesPlayed > 0) {
                appendToFooter("\nMin $minGamesPlayed games played")
            }
        }
    }

    protected fun replyForSkaters(
        event: MessageReceivedEvent,
        leagueType: LeagueType,
        teamInfo: TeamInfo?,
        playerName: String?,
        skaters: List<PlayerStats>,
        categoryFilter: CategoryFilter? = null,
        displayedCategories: List<CategoryFilter> = CategoryFilter.values().toList(),
        outputCount: Int = 3
    ): BaseEmbedBuilder {
        return BaseEmbedBuilder(logoUrl = teamInfo?.logoUrl ?: leagueType.logoUrl, event = event).apply {
            if (categoryFilter == null) {
                displayedCategories.forEachIndexed { index, category ->
                    addCategory(category.displayName, skaters, playerName, outputCount, selector = category.selector)
                    if (index > 0 && index % 2 == 1) {
                        addField(inline = true) { }
                    }
                }
            } else {
                addCategory(categoryFilter.displayName, skaters, playerName, 30, selector = categoryFilter.selector)
            }
        }
    }

    private fun <T : BasePlayerStats> BaseEmbedBuilder.addCategory(
        title: String, stats: List<T>, playerName: String?, outputCount: Int, outputIneligible: Boolean = false,
        minGamesPlayed: Int = 0, output: (T) -> String = { selector(it).toString() }, selector: (T) -> Int
    ) {
        addField(title, inline = true) { builder ->
            val sorted = stats.sortedByDescending(selector).filter {
                it.gamesPlayed >= minGamesPlayed
            }
            val indexOfPlayer = if (!playerName.isNullOrEmpty()) {
                sorted.indexOfFirst { it.name.equals(playerName, ignoreCase = true) }
            } else {
                -1
            }

            sorted.take(outputCount).forEachIndexed { index, stats ->
                if (stats.name.equals(playerName, ignoreCase = true)) {
                    builder.append("\n**${index + 1}. ${toOutputName(stats)} ${output(stats)}**")
                } else {
                    builder.append("\n${index + 1}. ${toOutputName(stats)} ${output(stats)}")
                }
            }

            if (indexOfPlayer > outputCount - 1) {
                val player = sorted[indexOfPlayer]
                if (indexOfPlayer != outputCount) {
                    builder.append("\n...")
                }
                builder.append("\n**${indexOfPlayer + 1}. ${toOutputName(player)} ${output(player)}**")
            } else if (indexOfPlayer < 0 && outputIneligible && !playerName.isNullOrEmpty()) {
                stats.find { it.name.equals(playerName, ignoreCase = true) }?.let { player ->
                    builder.append("\n...")
                    builder.append("\n**NE. ${toOutputName(player)} ${output(player)}**")
                }
            }

            builder.append("\n\u200E")
        }
    }

    protected open fun toOutputName(stats: BasePlayerStats): String {
        return stats.name
    }

    data class LeadersArgs(
        val leagueType: LeagueType,
        val season: Int?,
        val seasonType: SeasonType,
        val category: CategoryFilter?,
        val positionFilter: PositionFilter?,
        val goalieCategory: GoalieCategoryFilter?,
        val playerName: String?,
        val draftClass: Int?,
        val teamInfo: TeamInfo?,
        val isRookies: Boolean
    )

    enum class CategoryFilter(val regex: Regex, val displayName: String, val selector: (PlayerStats) -> Int) {
        Points("(?i)points|pts|p".toRegex(), "Points", { it.points }),
        Goals("(?i)goals|g".toRegex(), "Goals", { it.goals }),
        Assists("(?i)assists|a".toRegex(), "Assists", { it.assists }),
        PlusMinus("(?i)plusminus".toRegex(), "Plus/Minus", { it.plusMinus }),
        PenaltyMinutes("(?i)penaltyminutes|pim|pims".toRegex(), "Penalty minutes", { it.pim }),
        Shots("(?i)shots|sog".toRegex(), "Shots", { it.shotsOnGoal }),
        Hits("(?i)hits|hit".toRegex(), "Hits", { it.hits }),
        Blocks("(?i)blocks|blk".toRegex(), "Blocks", { it.shotsBlocked }),
        GamesPlayed("(?i)gp|gamesplayed|games".toRegex(), "Games played", { it.gamesPlayed }),
        PowerPlayPoints("(?i)ppp|powerplay".toRegex(), "Power play points", { it.ppPoints ?: 0 }),
    }

    enum class GoalieCategoryFilter(
        val regex: Regex,
        val displayName: String,
        val selector: (GoalieStats) -> Int,
        val minGamesRestricted: Boolean = false,
        val output: (GoalieStats) -> String = { selector(it).toString() }
    ) {
        Wins("(?i)wins|w".toRegex(), "Wins", { it.wins }),
        Gaa("(?i)gaa".toRegex(), "GAA", { (it.gaa * -1000).roundToInt() }, true, { it.gaa.afterDecimal(2) }),
        SavePercentage(
            "(?i)save%|sv%".toRegex(),
            "SV %",
            { (1000 * it.saves.toDouble() / it.shotsAgainst.coerceAtLeast(1)).roundToInt() },
            true,
            { it.savePct }
        ),
        ShotsAgainst("(?i)shotsagainst|shots|sa".toRegex(), "Shots against", { (1000 * it.shotsAgainstPerGame).roundToInt() }, true,
            { it.shotsAgainstPerGame.afterDecimal(2) }),
        Saves("(?i)saves".toRegex(), "Saves", { it.saves }),
        Shutouts("(?i)so|shutouts".toRegex(), "Shutouts", { it.shutouts }),
        GamesPlayed("(?i)gamesplayed|gp".toRegex(), "Games played", { it.gamesPlayed }),
        GameRating("(?i)rating|gr|gamerating".toRegex(), "Game rating", { it.gameRating }, true)
    }
}