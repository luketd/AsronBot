package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.commands.index.base.BaseLeagueStandingsCommand
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.SeasonType

class LeagueStandingsCommand : BaseLeagueStandingsCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentRaw.matches("!(stj|standingsj).*".toRegex())) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }
        val divisions = LeagueIndexRepository.getDivisionStandings(leagueType, arguments.getSeason())
        return createResponse(event, leagueType, divisions)
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(st|standings)(j)?(\\s+.*)?".toRegex()
    }

}