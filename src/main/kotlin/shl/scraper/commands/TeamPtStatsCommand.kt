package shl.scraper.commands

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.roster.RosterPlayer
import shl.scraper.roster.RosterRepository
import shl.scraper.tpe.TpeClaim
import shl.scraper.tpe.TpeClaimRepository
import kotlin.math.roundToInt

class TeamPtStatsCommand : DiscordCommand() {

    override fun buildResponse(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): String {
        return withTeamInfo(event, arguments) { team ->
            val roster = RosterRepository.getRoster(team)

            val players = roster.playersPlusProspects.map {
                PlayerPtInfo(it, TpeClaimRepository.getClaimsForPlayer(it.season ?: 0))
            }.sortedWith(compareBy({ -it.lastClaimsCompleted }, { -it.streak }))
            val maxUserNameLength = players.maxByOrNull { it.player.userName.length }?.player?.userName?.length ?: 0

            buildString {
                append("```")
                append("Last 10 PTs:\n")

                players.filter { it.lastClaimsCompleted >= 8 }.forEach {
                    appendPts(it, maxUserNameLength)
                }
                append("\n")

                players.filter { it.lastClaimsCompleted in 5..7 }.forEach {
                    appendPts(it, maxUserNameLength)
                }
                append("\n")

                players.filter { it.lastClaimsCompleted < 5 }.forEach {
                    appendPts(it, maxUserNameLength)
                }
                append("\n")

                append("\n\n-----\n\nLast ${DynamicConfigRepository.config.shlClaimThreadIds.size} seasons:\n")
                players.sortedByDescending { it.percentageOverall }.take(20).forEachIndexed { index, playerPtInfo ->
                    append("\n${index + 1}. ${playerPtInfo.player.userName} (${playerPtInfo.percentageOverall}%)")
                }

                append("```")
            }
        }
    }

    private fun StringBuilder.appendPts(playerPts: PlayerPtInfo, maxUserNameLength: Int) {
        val name = playerPts.player.userName
        append("\n$name")
        for (i in name.length..maxUserNameLength) {
            append("_")
        }
        append(" ")

        playerPts.lastClaims.forEach { claim ->
            if (claim.mentions(name)) {
                append("✅")
            } else {
                append("❌")
            }
        }

        if (playerPts.streak > 10) {
            append(" (${playerPts.streak})")
        }
    }

    private class PlayerPtInfo(val player: RosterPlayer, claims: List<TpeClaim>) {
        val lastClaims = claims.takeLast(10)
        val lastClaimsCompleted = lastClaims.count { it.mentions(player.userName) }
        val streak = claims.takeLastWhile { it.mentions(player.userName) }.size
        val percentageOverall =
            (100f * claims.count { it.mentions(player.userName) }.toFloat() / claims.size.coerceAtLeast(1)).roundToInt()
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!teampt.*".toRegex()
    }

}