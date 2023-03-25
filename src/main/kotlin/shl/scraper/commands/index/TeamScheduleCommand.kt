package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseTeamScheduleCommand
import shl.scraper.index.LeagueIndexRepository

class TeamScheduleCommand: BaseTeamScheduleCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        return withTeamInfoEmbed(event, arguments) { team ->
            val schedule = LeagueIndexRepository.getSchedule(team, season = null)
            createResponse(event, team, schedule)
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(s|schedule)(\\s+.*)?".toRegex()
    }

}