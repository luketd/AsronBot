package shl.scraper.commands.fantasy

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.config.GOOGLE_SHEET_URL_FORMAT
import shl.scraper.index.LeagueType

class FantasyEmbedBuilder(event: MessageReceivedEvent) :
    BaseEmbedBuilder(logoUrl = LeagueType.SHL.logoUrl, event = event) {

    init {
        setTitle("SHL Fantasy", GOOGLE_SHEET_URL_FORMAT.format(DynamicConfigRepository.config.fantasySheetId))
    }
}