package shl.scraper.commands.index.iihf

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.ErrorEmbedBuilder
import shl.scraper.commands.index.base.BaseTeamScheduleCommand
import shl.scraper.db.UserRepository
import shl.scraper.iihf.InternationalTeamBranding
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.SeasonType
import shl.scraper.index.api.IndexApiClient
import shl.scraper.util.ErrorMessages

class IihfTeamScheduleCommand : BaseTeamScheduleCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentRaw.matches("iihf!.*".toRegex())) {
            LeagueType.IIHF
        } else {
            LeagueType.WJC
        }

        val teamName = (getTeamName(event, arguments, skipArguments = 0, fallbackToStoredTeam = false)
            ?: run {
                val indexApi = IndexApiClient.get(leagueType)
                UserRepository.find(event.author.id)?.playerName?.let { playerName ->
                    (indexApi.getPlayerStats(SeasonType.REGULAR) + indexApi.getGoalieStats(SeasonType.REGULAR)).find {
                        it.name.equals(playerName, ignoreCase = true)
                    }?.team
                }
            })?.toLowerCase()
            ?: return ErrorEmbedBuilder().apply {
                setDescription("Specify a team name (e.g. iihf!s CAN)")
            }

        val branding = InternationalTeamBranding.findBranding(teamName)

        val team = LeagueIndexRepository.getTeamInfos(leagueType).find {
            it.name.toLowerCase() == teamName || it.abbreviation.toLowerCase() == teamName
                    || branding?.nameRegex?.matches(it.name) == true
                    || branding?.nameRegex?.matches(it.abbreviation) == true
                    || it.name.replace("Team ", "").toLowerCase() == teamName
        } ?: return ErrorMessages.teamNotFound(teamName)

        val schedule = LeagueIndexRepository.getSchedule(team.id, leagueType, season = null, team.name)
        return createResponse(event, team = null, schedule, branding)
    }

    override fun commandNameRegex(): Regex {
        return "(?i)(iihf|wjc)!(s|schedule)(\\s+.*)?".toRegex()
    }

}