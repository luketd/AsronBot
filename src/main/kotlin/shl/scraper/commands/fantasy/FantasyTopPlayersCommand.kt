package shl.scraper.commands.fantasy

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.ErrorEmbedBuilder
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.config.GOOGLE_SHEET_URL_FORMAT
import shl.scraper.db.UserRepository
import shl.scraper.fantasy.LeagueIndexFantasyRepository
import shl.scraper.index.*
import shl.scraper.util.afterDecimal

class FantasyTopPlayersCommand : BaseIndexCommand() {

    private val pageSize = 25

    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val season = arguments.getSeason()
        val positionFilter = arguments.getPosition(if (season != null) 1 else 0)

        // goalies
        if (positionFilter == PositionFilter.G) {
            val goalies = LeagueIndexFantasyRepository.getGoalies(season).sortedByDescending { it.fantasyPoints }
            return BaseEmbedBuilder(logoUrl = LeagueType.SHL.logoUrl, event = event).apply {
                setInfo(season, SeasonType.REGULAR, "")
                setTitle("SHL Fantasy", GOOGLE_SHEET_URL_FORMAT.format(DynamicConfigRepository.config.fantasySheetId))

                addField("Top goalies") { builder ->
                    goalies.forEachIndexed { index, goalie ->
                        builder.append("\n${index + 1}. ${goalie.name} | ${goalie.fantasyPoints.afterDecimal(1)} pts")
                    }
                }
            }
        }

        //skaters
        val playerName = UserRepository.find(event.author.id)?.playerName

        val playerStats = LeagueIndexRepository.getPlayerStats(
            LeagueType.SHL, SeasonType.REGULAR, season, positionFilter
        ).sortedByDescending {
            it.fantasyPoints
        }
        if (playerStats.isEmpty()) {
            return ErrorEmbedBuilder().apply {
                setDescription("Couldn't get player stats")
            }
        }

        return BaseEmbedBuilder(logoUrl = LeagueType.SHL.logoUrl, event = event).apply {
            setInfo(season, SeasonType.REGULAR, "")

            setTitle("SHL Fantasy", GOOGLE_SHEET_URL_FORMAT.format(DynamicConfigRepository.config.fantasySheetId))

            val requestedPlayerIndex = if (!playerName.isNullOrBlank()) {
                playerStats.indexOfFirst { it.name.equals(playerName, ignoreCase = true) }
            } else {
                -1
            }

            addField("Top ${positionFilter.displayName}") { builder ->
                builder.addPlayers(playerStats, 0, pageSize - 1, requestedPlayerIndex)
            }

            addField { builder ->
                builder.addPlayers(playerStats, pageSize, 2 * pageSize - 1, requestedPlayerIndex)

                if (requestedPlayerIndex >= 2 * pageSize) {
                    val requested = playerStats[requestedPlayerIndex]
                    builder.append("...\n**${requested.outputText(requestedPlayerIndex)}**")
                }
            }
        }
    }

    private fun StringBuilder.addPlayers(players: List<PlayerStats>, from: Int, to: Int, requestedPlayerIndex: Int) {
        players.forEachIndexed { index, player ->
            if (index !in from..to) {
                return@forEachIndexed
            }

            val output = player.outputText(index)
            if (index == requestedPlayerIndex) {
                append("**$output**\n")
            } else {
                append("$output\n")
            }
        }
    }

    private fun PlayerStats.outputText(index: Int): String {
        val position = if (isDefenseman) "D" else "F"
        return "${index + 1}. $team $position - $name | ${fantasyPoints.afterDecimal(0)}"
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!fp(\\s+.*)?".toRegex()
    }

}