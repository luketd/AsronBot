package shl.scraper.util

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.config.EMOJI_SERVER_IDS

fun StringBuilder.appendEmoji(
    event: MessageReceivedEvent,
    name: String,
    prefix: String = "",
    postfix: String = "",
    count: Int = 1
): Boolean {
    return appendEmoji(event.jda, name, prefix, postfix, count)
}

fun StringBuilder.appendEmoji(
    jda: JDA,
    name: String,
    prefix: String = "",
    postfix: String = "",
    count: Int = 1
): Boolean {
    EMOJI_SERVER_IDS.forEach { serverId ->
        jda.getGuildById(serverId)?.let { guild ->
            val emotes = guild.getEmojisByName(name, true)

            if (emotes.size > 0) {
                val selected = emotes[0]

                append(prefix)
                repeat(count) {
                    if (selected.isAnimated) {
                        append("<a:${selected.name}:${selected.id}>")
                    } else {
                        append("<:${selected.name}:${selected.id}>")
                    }
                }
                append(postfix)
                return true
            }
        }
    }

    return false
}