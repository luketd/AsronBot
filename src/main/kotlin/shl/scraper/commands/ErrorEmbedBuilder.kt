package shl.scraper.commands

import shl.scraper.BaseEmbedBuilder
import java.awt.Color

class ErrorEmbedBuilder: BaseEmbedBuilder() {
    init {
        setColor(Color.RED)
    }
}