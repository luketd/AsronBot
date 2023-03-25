package shl.scraper.commands.index.iihf

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseLeagueStandingsCommand
import shl.scraper.iihf.InternationalTeamBranding
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.TeamStats
import shl.scraper.index.api.LeagueDivision
import java.awt.Color

class IihfStandingsCommand : BaseLeagueStandingsCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentRaw.matches("iihf!.*".toRegex())) {
            LeagueType.IIHF
        } else {
            LeagueType.WJC
        }

        val teams = LeagueIndexRepository.getStandings(leagueType, arguments.getSeason())
        val divisions = listOf(
            LeagueDivision(
                id = 0,
                league = leagueType.apiId,
                conference = 0,
                name = "Standings",
                season = teams.firstOrNull()?.teamInfoResponse?.season ?: arguments.getSeason() ?: 0
            ).also { it.teams = teams }
        )

        return createResponse(event, leagueType, divisions, Color.WHITE)
    }

    override fun TeamStats.getDisplayedName(leagueType: LeagueType): String {
        if (leagueType == LeagueType.WJC) {
            return name
        }
        val branding = InternationalTeamBranding.findBranding(teamInfoResponse?.abbreviation ?: name)

        return "${branding?.emoji ?: ""} $name"
    }

    override fun TeamStats.getDisplayedRecord(): String {
        return "${wins}-$otw-${losses}-${otl}"
    }

    override fun commandNameRegex(): Regex {
        return "(?i)(iihf|wjc)!(st|standings)?(\\s+.*)?".toRegex()
    }

}