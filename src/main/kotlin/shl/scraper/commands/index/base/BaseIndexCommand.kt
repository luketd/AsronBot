package shl.scraper.commands.index.base

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.commands.DiscordCommand
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.db.UserRepository
import shl.scraper.index.PositionFilter
import shl.scraper.index.SeasonType
import shl.scraper.util.ErrorMessages

abstract class BaseIndexCommand : DiscordCommand() {

    protected fun List<String>.tryFindSeason(): Int? {
        for (i in indices) {
            getSeason(i)?.let { return it }
        }

        return null
    }

    protected fun List<String>.tryFindPositionFilter(): PositionFilter? {
        for (i in indices) {
            getPosition(i)?.let { return it }
        }

        return null
    }

    protected fun List<String>.tryFindSeasonType(): SeasonType? {
        for (arg in this) {
            when (arg) {
                "-po" -> return SeasonType.POST
                "-rs" -> return SeasonType.REGULAR
            }
        }

        return null
    }

    protected fun List<String>.getPosition(index: Int = 0): PositionFilter? {
        return when (getOrNull(index)?.trim()?.toLowerCase()) {
            "-f" -> PositionFilter.F
            "-d" -> PositionFilter.D
            "-g" -> PositionFilter.G
            else -> null
        }
    }

    protected fun List<String>.getName(event: MessageReceivedEvent, skip: Int = 0): String? {
        return if (size > skip) {
            buildString {
                this@getName.filterIndexed { index, _ -> index > skip - 1 }.forEach { append(" $it") }
            }.trim()
        } else {
            UserRepository.find(event.author.id)?.playerName
        }
    }

    protected fun withSeasonAndName(
        event: MessageReceivedEvent, arguments: List<String>, nameRequired: Boolean = true,
        responseBuilder: (Int?, String) -> BaseEmbedBuilder
    ): BaseEmbedBuilder {
        val season = arguments.getSeason()

        val playerName = when {
            season == null && arguments.isNotEmpty() -> {
                buildString {
                    arguments.forEach { append(" $it") }
                }.trim()
            }
            season != null && arguments.size > 1 -> {
                buildString {
                    arguments.filterIndexed { index, _ -> index > 0 }.forEach { append(" $it") }
                }.trim()
            }
            else -> {
                UserRepository.find(event.author.id)?.playerName
                    ?: if (nameRequired) return ErrorMessages.EMBED_USER_NOT_FOUND else ""
            }
        }

        return responseBuilder(season, playerName)
    }

    protected fun BaseEmbedBuilder.setInfo(season: Int?, seasonType: SeasonType?, regularSeasonCommand: String?) {
        if (season != null && season != DynamicConfigRepository.config.currentSeason) {
            appendDescription(("\nSeason $season"))
        }
        if (seasonType == SeasonType.POST) {
            if (descriptionBuilder.isNotBlank()) {
                appendDescription(" | ")
            }
            appendDescription("Playoffs")
        }

        appendToFooter(buildString {
            append("\n")
            if (seasonType == SeasonType.POST) {
                if (!regularSeasonCommand.isNullOrEmpty()) {
                    append("'$regularSeasonCommand' for regular season")
                }
            }
        })
    }
}