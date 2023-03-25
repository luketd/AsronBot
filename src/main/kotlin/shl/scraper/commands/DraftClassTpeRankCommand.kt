package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole
import shl.scraper.db.UserRepository
import shl.scraper.roster.RosterRepository
import shl.scraper.roster.generalDisplayName
import shl.scraper.util.ErrorMessages.EMBED_NOT_FOUND

class DraftClassTpeRankCommand : DiscordCommand() {

    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        val user = UserRepository.find(event.author.id)
        val season = (arguments.getSeason()
            ?: RosterRepository.findRosterPlayer(user?.forumName)?.season)
            ?.takeIf { it > 0 }
            ?: return EMBED_NOT_FOUND
        val chunks = RosterRepository.getDraftClass(season).chunked(20).take(2)

        return BaseEmbedBuilder(event = event).apply {
            chunks.forEachIndexed { chunkIndex, chunk ->
                addField(if (chunkIndex == 0) "S$season draft class" else "") {
                    chunk.forEachIndexed { index, player ->
                        val line = "${20 * chunkIndex + index + 1}. ${player.userName} | ${player.position?.generalDisplayName} - " +
                                "${player.playerName} | ${player.tpe} tpe"
                        if (user?.forumName == player.userName) {
                            it.append("**$line**")
                        } else {
                            it.append(line)
                        }
                        it.append("\n")
                    }
                }
            }

            if (chunks.isEmpty()) {
                addField("S$season draft class") {}
            }
        }
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!dcrank.*".toRegex()
    }
}