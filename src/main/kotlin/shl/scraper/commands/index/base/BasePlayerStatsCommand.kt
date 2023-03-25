package shl.scraper.commands.index.base

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.iihf.InternationalTeamBranding
import shl.scraper.index.*
import shl.scraper.index.api.IndexApiClient
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ErrorMessages
import shl.scraper.util.afterDecimal
import shl.scraper.util.toDisplayString
import java.awt.Color

abstract class BasePlayerStatsCommand : BaseIndexCommand() {
    fun createResponse(
        event: MessageReceivedEvent, arguments: List<String>,
        includeFantasy: Boolean,
        getStats: (Int?, String) -> BasePlayerStats?
    ): BaseEmbedBuilder {
        return withSeasonAndName(event, arguments) { season, name ->
            when (val stats = getStats(season, name)) {
                is PlayerStats -> {
                    buildSkaterStatsReply(stats, includeFantasy)
                }

                is GoalieStats -> {
                    buildGoalieStatsReply(stats)
                }

                else -> {
                    if (name.isNotBlank()) {
                        if (arguments.isNotEmpty()) {
                            ErrorMessages.playerNotFound(name)
                        } else {
                            ErrorMessages.storedPlayerNotFound(name)
                        }
                    } else {
                        ErrorMessages.playerNameNotStored()
                    }
                }
            }
        }
    }

    private fun buildSkaterStatsReply(stats: PlayerStats, includeFantasy: Boolean): BaseEmbedBuilder {
        val fantasyStats = LeagueIndexRepository.getPlayerStats(
            LeagueType.SHL, SeasonType.REGULAR, stats.season
        ).sortedByDescending {
            it.fantasyPoints
        }
        val fantasyRank = fantasyStats.indexOfFirst {
            it.name.equals(stats.name, ignoreCase = true)
        }
        val teamInfo = TeamInfo.find(stats.team)
        val isInternational = stats.league == LeagueType.IIHF.apiId || stats.league == LeagueType.WJC.apiId
        val internationBranding = if (isInternational) {
            InternationalTeamBranding.findBranding(stats.team)
        } else {
            null
        }

        return BaseEmbedBuilder(
            teamColor = teamInfo,
            logoUrl = teamInfo?.logoUrl,
            forceColor = (internationBranding?.color?.let { Color.decode(it) }
                ?: Color.WHITE).takeIf { isInternational }
        ).apply {
            setTitle(buildString {
                append(stats.name)
                if (stats.position.isNotEmpty()) {
                    append(" - ${stats.position}")
                }
            })

            if (stats.league == LeagueType.IIHF.apiId || stats.league == LeagueType.WJC.apiId) {
                if (internationBranding != null) {
                    appendDescription(internationBranding.emoji)
                    appendDescription("\u1CBC")
                }
                val internationalTeamInfo =
                    IndexApiClient.get(LeagueType.values()[stats.league]).getTeamInfos().find { it.id == stats.teamId }
                if (internationalTeamInfo != null) {
                    appendDescription("${internationalTeamInfo.name}\n")
                } else {
                    appendDescription("${stats.team}\n")
                }
            }

            appendDescription("Games played: ${stats.gamesPlayed}")
            setInfo(stats.season, stats.seasonType, "!pr")

            addField("Stats", inline = true) { builder ->
                builder.append("\nGoals: ${stats.goals}")
                builder.append("\nAssists: ${stats.assists}")
                builder.append("\nPoints: ${stats.points}")
                builder.append("\nPlus/Minus: ${stats.plusMinusDisplay}")
                builder.append("\nShots: ${stats.shotsOnGoal}")
                builder.append("\nShooting %: ${stats.shootingPercentage.afterDecimal(2)}")
                builder.append("\nGWG: ${stats.gwg ?: "-"}")
            }

            addField(inline = true) { builder ->
                builder.append("\nHits: ${stats.hits}")
                builder.append("\nBlocks: ${stats.shotsBlocked}")
                builder.append("\nPIM: ${stats.pim}")
                builder.append("\nFights: ${stats.fights}")
                if (stats.fightWins > 0) {
                    builder.append(" (${stats.fightWins} won)")
                }
                builder.append("\nTA: ${stats.takeaways}")
                builder.append("\nGA: ${stats.giveaways}")
                builder.append("\nTA/GA: ${stats.taGaRatio}")
            }

            addField(inline = true) { builder ->
                builder.append("\nPP goals: ${stats.ppGoals}")
                builder.append("\nPP points: ${stats.ppPoints ?: "-"}")
                builder.append("\nSH points: ${stats.shAssists + stats.shGoals}")
                builder.append("\nTOI: ${stats.toi}")
                builder.append("\nPP: ${stats.pptoi}")
                builder.append("\nPK: ${stats.shtoi}")

                builder.append("\nFOW: ${stats.faceoffWins ?: "-"}")
                if (stats.faceoffsPercentage != null) {
                    builder.append(" (${stats.faceoffsPercentage.afterDecimal(0)}%)")
                }
            }

            if (stats.season >= 53) {
                addField("Advanced", inline = true) { builder ->
                    builder.append("\nPDO: ${stats.advancedStats.PDO.afterDecimal(2)}")
                    builder.append("\nCF%: ${stats.advancedStats.CFPct.afterDecimal(2)}")
                    if (stats.advancedStats.CFPctRel > 0) {
                        builder.append("\nCF% rel: +${stats.advancedStats.CFPctRel.afterDecimal(2)}")
                    } else {
                        builder.append("\nCF% rel: ${stats.advancedStats.CFPctRel.afterDecimal(2)}")
                    }
                }

                addField(inline = true) { builder ->
                    builder.append("\nGR: ${stats.gameRating}")
                    builder.append("\nOGR: ${stats.offensiveGameRating}")
                    builder.append("\nDGR: ${stats.defensiveGameRating}")
                }
            }

            if (fantasyRank >= 0 && stats.seasonType == SeasonType.REGULAR && includeFantasy) {
                addField("Fantasy", inline = true) { builder ->
                    builder.append("\n${stats.fantasyPoints.afterDecimal(1)} points (${(fantasyRank + 1).toDisplayString()})")
                }
            } else {
                addField(inline = true) {}
            }
        }
    }

    private fun buildGoalieStatsReply(stats: GoalieStats): BaseEmbedBuilder {
        val teamInfo = TeamInfo.find(stats.team)
        val isInternational = stats.league == LeagueType.IIHF.apiId || stats.league == LeagueType.WJC.apiId
        val internationBranding = if (isInternational) {
            InternationalTeamBranding.findBranding(stats.team)
        } else {
            null
        }

        return BaseEmbedBuilder(
            teamColor = teamInfo,
            logoUrl = teamInfo?.logoUrl,
            forceColor = (internationBranding?.color?.let { Color.decode(it) }
                ?: Color.WHITE).takeIf { isInternational }
        ).apply {
            setTitle("${stats.name} - G")

            if (stats.league == LeagueType.IIHF.apiId || stats.league == LeagueType.WJC.apiId) {
                if (internationBranding != null) {
                    appendDescription(internationBranding.emoji)
                    appendDescription("\u1CBC")
                }
                val internationalTeamInfo = IndexApiClient.get(LeagueType.values()[stats.league])
                    .getTeamInfos().find { it.id == stats.teamId }
                if (internationalTeamInfo != null) {
                    appendDescription(internationalTeamInfo.name)
                } else {
                    appendDescription(stats.team)
                }
            }

            setInfo(stats.season, stats.seasonType, "!pr")

            addField("Stats", inline = true) { builder ->
                builder.append("\nGames played: ${stats.gamesPlayed}")
                builder.append("\nRecord: ${stats.wins}-${stats.losses}-${stats.ot}")
                builder.append("\nGAA: ${stats.gaa.afterDecimal(2)}")
                builder.append("\nSave percentage: ${stats.savePct}")
                builder.append("\nShutouts: ${stats.shutouts}")
                builder.append("\nShots against: ${stats.shotsAgainstPerGame.afterDecimal(2)}")
                if (stats.gameRating > 0) {
                    builder.append("\nGame rating: ${stats.gameRating}")
                }
            }
        }
    }

}