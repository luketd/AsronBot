package shl.scraper.commands.index.base

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.SeasonType
import shl.scraper.index.TeamStats
import shl.scraper.index.api.LeagueDivision
import java.awt.Color

abstract class BaseLeagueStandingsCommand : BaseIndexCommand() {
    protected fun createResponse(
        event: MessageReceivedEvent,
        leagueType: LeagueType,
        divisions: List<LeagueDivision>,
        embedColor: Color? = null
    ): EmbedBuilder {
        return BaseEmbedBuilder(logoUrl = leagueType.logoUrl, event = event, forceColor = embedColor).apply {
            val season = divisions.firstOrNull()?.season
            setTitle(leagueType.name, "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}/standings?season=$season")

            setInfo(season, SeasonType.REGULAR, "")

            divisions.forEach { division ->
                addField(division.name) { builder ->
                    division.teams.forEachIndexed { index, team ->
                        builder.append("\n${index + 1}. ${team.getDisplayedName(leagueType)}")
                        builder.append(" | ${team.games} gp")
                        builder.append(" | ${team.getDisplayedRecord()}")
                        builder.append(" | ${team.points} pts")
                    }
                }
            }
        }
    }

    protected open fun TeamStats.getDisplayedName(leagueType: LeagueType): String {
        return name
    }

    protected open fun TeamStats.getDisplayedRecord(): String {
        return "${wins}-${losses}-${otl}"
    }

}