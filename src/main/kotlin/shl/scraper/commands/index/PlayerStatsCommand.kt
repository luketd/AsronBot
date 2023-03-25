package shl.scraper.commands.index

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.commands.index.base.BasePlayerStatsCommand
import shl.scraper.index.*
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ErrorMessages
import shl.scraper.util.afterDecimal
import shl.scraper.util.toDisplayString

class PlayerStatsCommand : BasePlayerStatsCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): BaseEmbedBuilder {
        val seasonType = if (event.message.contentDisplay.matches("(?i)!(p|players)r.*".toRegex())) {
            SeasonType.REGULAR
        } else {
            null
        }
        return createResponse(event, arguments, includeFantasy = true) { season, name ->
            LeagueIndexRepository.getPlayerStats(name, seasonType, season)
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(p|player)r?(\\s+.*)?".toRegex()
    }

}