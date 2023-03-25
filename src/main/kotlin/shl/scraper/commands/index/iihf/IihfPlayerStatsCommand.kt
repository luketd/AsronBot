package shl.scraper.commands.index.iihf

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BasePlayerStatsCommand
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.SeasonType

class IihfPlayerStatsCommand : BasePlayerStatsCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): BaseEmbedBuilder {
        val leagueType = if (event.message.contentDisplay.matches("(?i)wjc!(p|players).*".toRegex())) {
            LeagueType.WJC
        } else {
            LeagueType.IIHF
        }
        return createResponse(event, arguments, includeFantasy = false) { season, name ->
            LeagueIndexRepository.getPlayerStats(leagueType, name, season, SeasonType.REGULAR)?.first
                ?: LeagueIndexRepository.getGoalieStats(leagueType, name, season, SeasonType.REGULAR)?.first
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)(iihf|wjc)!(p|player)r?(\\s+.*)?".toRegex()
    }

}