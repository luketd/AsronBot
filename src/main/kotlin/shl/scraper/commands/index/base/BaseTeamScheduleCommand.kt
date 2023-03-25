package shl.scraper.commands.index.base

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.commands.DiscordCommand
import shl.scraper.iihf.InternationalTeamBranding
import shl.scraper.index.TeamSchedule
import shl.scraper.index.api.GameInfo
import shl.scraper.roster.TeamInfo
import shl.scraper.util.appendEmoji
import java.awt.Color

abstract class BaseTeamScheduleCommand : DiscordCommand() {
    fun createResponse(
        event: MessageReceivedEvent,
        team: TeamInfo?,
        schedule: TeamSchedule,
        internationalTeamBranding: InternationalTeamBranding? = null
    ): EmbedBuilder {
        return BaseEmbedBuilder(
            teamColor = team,
            logoUrl = team?.logoUrl,
            forceColor = internationalTeamBranding?.color?.let { Color.decode(it) }
        ).apply {
            setTitle(buildString {
                internationalTeamBranding?.let {
                    append(it.emoji)
                    append("\u1CBC")
                }
                append("${schedule.teamName} | Schedule")
            })

            val completedGames = schedule.completedGames.takeLast(10)

            addCompletedGames(event, schedule, completedGames.take(5))
            if (completedGames.size > 5) {
                addCompletedGames(event, schedule, completedGames.takeLast(5 - (10 - completedGames.size)))
            }

            addField("Upcoming") { builder ->
                schedule.upcomingGames.take(5).forEach { game ->
                    builder.append("\n${game.awayTeamInfo?.name} @ ${game.homeTeamInfo?.name}")
                }
            }
        }
    }

    private fun BaseEmbedBuilder.addCompletedGames(
        event: MessageReceivedEvent,
        schedule: TeamSchedule,
        games: List<GameInfo>
    ) {
        if (games.isEmpty()) {
            return
        }
        addField { builder ->
            games.forEach { game ->
                builder.append("\n")
                schedule.getResult(game)?.let {
                    builder.appendEmoji(event, it.emojiName, postfix = " ")
                }
                builder.append(" [X](${game.boxScoreLink}) ")
                if (game.awayScore > game.homeScore) {
                    builder.append("**${game.awayTeamInfo?.name} (${game.awayScore})** @ ${game.homeTeamInfo?.name} (${game.homeScore})")
                } else {
                    builder.append("${game.awayTeamInfo?.name} (${game.awayScore}) @ **${game.homeTeamInfo?.name} (${game.homeScore})**")
                }
            }
        }
    }

}