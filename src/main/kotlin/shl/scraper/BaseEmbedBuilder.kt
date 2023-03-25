package shl.scraper

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.db.UserRepository
import shl.scraper.roster.TeamInfo
import java.awt.Color

open class BaseEmbedBuilder(
    logoUrl: String? = null, teamColor: TeamInfo? = null,
    event: MessageReceivedEvent? = null, forceColor: Color? = null
) : EmbedBuilder() {

    private var footerText = ""

    init {
        val resolvedTeamColor = when {
            teamColor != null -> {
                teamColor
            }
            event != null -> {
                TeamInfo.find(UserRepository.find(event.author.id)?.teamName) ?: TeamInfo.HAMILTON
            }
            else -> {
                TeamInfo.HAMILTON
            }
        }

        setColor(forceColor ?: Color.decode(resolvedTeamColor.teamColor))

        if (!logoUrl.isNullOrEmpty()) {
            setThumbnail(logoUrl)
        }
    }

    fun addField(name: String = "", inline: Boolean = false, buildContent: (StringBuilder) -> Unit) {
        val builder = StringBuilder()
        buildContent(builder)

        val result = if (builder.length > 1024) {
            builder.substring(0, 1010) + "  [...]"
        } else {
            builder.toString()
        }

        addField(name, result, inline)
    }

    fun appendToFooter(text: String) {
        footerText = (footerText + text).trim()
        setFooter(footerText.ifEmpty { null })
    }
}