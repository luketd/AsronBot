package shl.scraper.commands.index

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.index.base.BaseIndexCommand
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.index.LeagueIndexRepository
import shl.scraper.index.LeagueType

class PlayoffBracketCommand : BaseIndexCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val leagueType = if (event.message.contentRaw.contains("playoffsj", ignoreCase = true)) {
            LeagueType.SMJHL
        } else {
            LeagueType.SHL
        }

        val season = arguments.getSeason()

        val rounds = LeagueIndexRepository.getPlayoffs(leagueType, season)

        return BaseEmbedBuilder(logoUrl = leagueType.logoUrl, event = event).apply {
            setTitle(
                "Season ${rounds.firstOrNull()?.firstOrNull()?.season 
                    ?: season ?: DynamicConfigRepository.config.currentSeason}"
            )

            rounds.forEachIndexed { index, round ->
                val name = when (round.size) {
                    1 -> {
                        "${leagueType.cupName} final"
                    }
                    2 -> {
                        "Conference finals"
                    }
                    else -> {
                        "Round ${index + 1}"
                    }
                }

                addField { builder ->
                    builder.append("__${name}__")
                    builder.append("\n")

                    round.forEach { series ->
                        builder.append("\n")
                        builder.appendSeriesTeam(series.team1.fullName, series.team1.wins)
                        builder.append(" - ")
                        builder.appendSeriesTeam(series.team2.fullName, series.team2.wins)
                    }
                }
            }
        }
    }

    private fun StringBuilder.appendSeriesTeam(name: String, score: Int) {
        if (score == 4) {
            append("**")
        }

        append("$name ($score)")

        if (score == 4) {
            append("**")
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!playoffs(j)?.*".toRegex()
    }

}