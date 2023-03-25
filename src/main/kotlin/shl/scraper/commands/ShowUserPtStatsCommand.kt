package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.forum.ShlForumRepository
import shl.scraper.index.LeagueType
import shl.scraper.roster.RosterPosition
import shl.scraper.roster.RosterRepository
import shl.scraper.tpe.TpeClaimRepository
import shl.scraper.update.TeamUpdateRepository
import shl.scraper.util.ErrorMessages
import shl.scraper.util.appendEmoji
import shl.scraper.util.toDisplayString
import kotlin.math.roundToInt

open class ShowUserPtStatsCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder? {
        val query = getUserName(event, arguments)

        if (query.isNullOrBlank()) {
            return ErrorMessages.nameRequired("!show username/player_name")
        }

        val player = RosterRepository.findRosterPlayer(query) ?: return ErrorMessages.EMBED_NOT_FOUND
        val teamInfo = player.teamInfo
        val userName = player.userName

        val update = TeamUpdateRepository.getUpdate(userName, player.teamInfo)
        val userProfile = ShlForumRepository.getUserProfile(player.forumThread.startedByProfileLink)
        val claims = TpeClaimRepository.getClaimsForPlayer(player.season ?: 0)
        val playerBuild = if (player.position != RosterPosition.G) {
            RosterRepository.getPlayerBuild(player.forumThread.link)
        } else {
            null
        }
        val goalieBuild = if (player.position == RosterPosition.G) {
            RosterRepository.getGoalieBuild(player.forumThread.link)
        } else {
            null
        }
        val dcTpeRank = player.season?.let { season ->
            RosterRepository.getDraftClassTpeRanking(season).indexOfFirst { it.userName == userName }
        }

        return BaseEmbedBuilder(teamColor = teamInfo, logoUrl = teamInfo.logoUrl).apply {
            setTitle(userName, userProfile.link)

            setDescription(buildString {
                append("Joined: ${userProfile.joined}")
                append("\nLast visit: ${userProfile.lastVisit}")
                append("\nOnline for: ${userProfile.onlineFor}")
                if (teamInfo.leagueType == LeagueType.SMJHL && userProfile.shlTeam.isNotBlank()) {
                    append("\nSHL Team: ${userProfile.shlTeam}")
                }
            })

            addField("Player") {
                it.append("[${player.forumThread.name}](${player.forumThread.link})")
                if (update != null) {
                    it.append("\n[Update thread](${update.updateThread.lastPostLink})")
                }
            }

            addField("TPE", inline = true) {
                it.append("${player.tpe ?: "N/A"}")
            }
            addField("Draft class", inline = true) {
                if (dcTpeRank != null && dcTpeRank >= 0) {
                    it.append((dcTpeRank + 1).toDisplayString())
                } else {
                    it.append("N/A")
                }
            }
            addField("Last update", inline = true) {
                it.append(update?.getTimeSince() ?: "N/A")
            }

            addField("Balance", inline = true) {
                it.append(userProfile.bankBalance)
            }
            val streak = claims.takeLastWhile { it.mentions(userName) }.size
            val completed = claims.count { it.mentions(userName) }

            addField("PT streak", inline = true) {
                it.append(streak)
            }

            addField("Last ${DynamicConfigRepository.config.shlClaimThreadIds.size} seasons", inline = true) {
                if (completed == claims.size && completed > 0) {
                    it.appendEmoji(event, "win", postfix = " ")
                }
                it.append("$completed/${claims.size} (${(100f * completed / claims.size.coerceAtLeast(1)).roundToInt()}%)")
            }

            addField("Last 10 PTs") { builder ->
                claims.takeLast(10).forEach { claim ->
                    if (claim.mentions(userName)) {
                        builder.append("✅ ")
                    } else {
                        builder.append("❌ ")
                    }
                }
                builder.append(".")
            }

            val missedLastTen = claims.takeLast(10).filter { !it.mentions(userName) }
            if (missedLastTen.isNotEmpty()) {
                addField("Missed PTs") { builder ->
                    missedLastTen.takeLast(5).forEach {
                        builder.append("[${it.post.time}](${it.post.link})\n")
                    }
                }
            }

            if (playerBuild != null) {
                addField("Offensive", inline = true) {
                    it.append(playerBuild.offensiveRatings)
                }
                addField("Defensive", inline = true) {
                    it.append(playerBuild.defensiveRatings)
                }
                addField("Physical", inline = true) {
                    it.append(playerBuild.physicalRatings)
                }
                addField("Mental", inline = true) {
                    it.append(playerBuild.mentalRatings)
                }
            }
            if (goalieBuild != null) {
                addField("Ratings", inline = true) { builder ->
                    goalieBuild.attributes.subList(0, 7).forEach {
                        builder.append("$it\n")
                    }
                }
                addField(inline = true) { builder ->
                    goalieBuild.attributes.subList(7, 13).forEach {
                        builder.append("$it\n")
                    }
                }
            }

            if (playerBuild?.pointsAvailable != null || goalieBuild?.pointsAvailable != null) {
                addField("Banked TPE", inline = true) {
                    it.append(playerBuild?.pointsAvailable ?: goalieBuild?.pointsAvailable)
                }
                addField(inline = true) {  }
            }

        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!show(\\s+.+)?".toRegex()
    }

}