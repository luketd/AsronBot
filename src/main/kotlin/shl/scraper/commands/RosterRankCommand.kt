package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.db.UserRepository
import shl.scraper.index.LeagueType
import shl.scraper.roster.RosterRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.util.afterDecimal

class RosterRankCommand: DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val currentSeason = DynamicConfigRepository.config.currentSeason
        val leagueType = if (event.message.contentDisplay.matches("(?i)!roster?rankj.*".toRegex())) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }
        val rosters = TeamInfo.values().filter { it.leagueType == leagueType }.map {
            RosterRepository.getRoster(it, includeProspects = false)
        }.sortedByDescending { it.averageTpe(currentSeason) }
        val userTeam = TeamInfo.find(UserRepository.find(event.author.id)?.teamName)

        return BaseEmbedBuilder(logoUrl = leagueType.logoUrl, event = event).apply {
            addField(if (leagueType == LeagueType.SMJHL) "Average capped TPE" else "Average TPE") { builder ->
                rosters.forEachIndexed { index, roster ->
                    val line = "${index + 1}. ${roster.teamInfo.fullName} | ${roster.averageTpe(currentSeason).afterDecimal(2)}"
                    if (roster.teamInfo == userTeam) {
                        builder.append("\n**$line**")
                    } else {
                        builder.append("\n$line")
                    }
                }
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!roster?rankj?\\s*".toRegex()
    }
}