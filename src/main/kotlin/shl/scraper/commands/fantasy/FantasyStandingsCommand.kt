package shl.scraper.commands.fantasy

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.commands.DiscordCommand
import shl.scraper.fantasy.FantasyGroup
import shl.scraper.fantasy.FantasyInteractor
import shl.scraper.fantasy.FantasyRoster
import shl.scraper.util.ErrorMessages
import shl.scraper.util.afterDecimal

class FantasyStandingsCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent, arguments: List<String>,
        userRole: UserRole, discord: Discord
    ): EmbedBuilder {
        val userName = getUserName(event, arguments)

        if (arguments.isNotEmpty() && arguments[0].toIntOrNull() != null) {
            val response = FantasyInteractor.getGroup(arguments[0].toInt()) ?: return ErrorMessages.EMBED_NOT_FOUND
            return FantasyEmbedBuilder(event).apply {
                addGroupStandingsField(response.value, userName)
            }
        } else {
            return when {
                !userName.isNullOrBlank() -> {
                    val group = FantasyInteractor.getGroup(userName) ?: return ErrorMessages.EMBED_NOT_FOUND
                    val roster = FantasyInteractor.getRoster(group.value.number, userName)
                    return FantasyEmbedBuilder(event).apply {
                        addGroupStandingsField(group.value, userName)
                        if (roster != null) {
                            addRosterField(roster.value)
                        }
                    }
                }

                arguments.isEmpty() -> {
                    ErrorMessages.EMBED_USER_NOT_FOUND
                }

                else -> {
                    ErrorMessages.EMBED_NOT_FOUND
                }
            }
        }
    }

    private fun BaseEmbedBuilder.addRosterField(roster: FantasyRoster) {
        addField("Roster") { builder ->
            roster.players.forEach { player ->
                val playerName = player.name
                builder.append(
                    "\n${player.position.firstOrNull() ?: "P"}: $playerName" +
                            " | ${player.fantasyPoints.afterDecimal(1)}"
                )

                val swap = when {
                    roster.skaterSwap?.dropCurrent?.name.equals(
                        playerName,
                        ignoreCase = true
                    ) && playerName.isNotEmpty() -> {
                        roster.skaterSwap
                    }

                    roster.goalieSwap?.dropCurrent?.name.equals(
                        playerName,
                        ignoreCase = true
                    ) && playerName.isNotEmpty() -> {
                        roster.goalieSwap
                    }

                    else -> {
                        null
                    }
                }

                if (swap != null) {
                    builder.append(" --> ${swap.addCurrent.name} | ${swap.addCurrent.fantasyPoints.afterDecimal(1)}")

                    val gained = swap.gained
                    val gainSign = when {
                        gained > 0 -> "+"
                        gained == 0.0 -> ""
                        else -> ""
                    }
                    builder.append(" ($gainSign${gained.afterDecimal(1)})")
                }
            }
        }
    }

    private fun BaseEmbedBuilder.addGroupStandingsField(group: FantasyGroup, name: String?) {
        addField("Group ${group.number}") { builder ->
            group.teams.forEachIndexed { index, team ->
                val isUserTeam = team.name.equals(name, ignoreCase = true)
                if (isUserTeam) {
                    builder.append("**")
                }
                builder.append("${index + 1}. ${team.name} | ${team.score}")
                if (index > 0) {
                    builder.append(" (${team.pace})")
                }
                if (isUserTeam) {
                    builder.append("**")
                }
                builder.append("\n")
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)(!f|!fantasy|!ft)(\\s+.*)?".toRegex()
    }

}