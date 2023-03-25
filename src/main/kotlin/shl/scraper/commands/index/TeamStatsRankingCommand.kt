package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.ErrorEmbedBuilder
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.db.UserRepository
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType
import shl.scraper.index.api.DetailedTeamStats
import shl.scraper.index.api.IndexApiClient
import shl.scraper.roster.TeamInfo
import shl.scraper.util.afterDecimal

class TeamStatsRankingCommand : BaseIndexCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentRaw.contains("statsj", ignoreCase = true)) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }

        val userTeam = TeamInfo.find(UserRepository.find(event.author.id)?.teamName)

        val season = arguments.getSeason()
        val stats = LeagueIndexRepository.getDetailedStats(leagueType, season)
        val teamInfos = IndexApiClient.get(leagueType).getTeamInfos(season).associateBy { it.id }
        if (stats.isEmpty()) {
            return ErrorEmbedBuilder().apply {
                if (season != null && season < 66) {
                    setDescription("Data before season 66 is not available")
                } else {
                    setDescription("Unknown error")
                }
            }
        }



        return BaseEmbedBuilder().apply {
            setTitle(
                "${leagueType.name} team stats",
                "https://index.simulationhockey.com/${leagueType.name.toLowerCase()}" + (season?.let { "?season=$it" } ?: "")
            )
            if (season != null && season != DynamicConfigRepository.config.currentSeason) {
                setDescription("\nSeason $season")
            }

            fun addStat(statName: String, descending: Boolean = true, picker: (DetailedTeamStats) -> Double) {
                addField(statName, inline = true) { builder ->
                    stats.sortedBy { picker(it) * if (descending) -1 else 1 }.forEachIndexed { index, team ->
                        val name = teamInfos[team.id]?.nameDetails?.first ?: team.abbreviation
                        val isUserTeam = userTeam?.nameRegex?.matches(name) == true
                        if (isUserTeam) {
                            builder.append("**")
                        }
                        builder.append("${index + 1}. $name | ${picker(team).afterDecimal(2)}")
                        if (isUserTeam) {
                            builder.append("**")
                        }
                        builder.append("\n")
                    }
                }
            }

            addStat("Goals for") { it.goalsPerGame }
            addStat("Goals against", descending = false) { it.goalsAgainstPerGame }
            addStat("PP%") { it.ppPercentage }

            addField {  }

            addStat("Shots for") { it.shotsForPerGame }
            addStat("Shots against", descending = false) { it.shotsAgainstPerGame }
            addStat("PK%") { it.pkPercentage }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!(t(eam)?stats)j?.*".toRegex()
    }
}