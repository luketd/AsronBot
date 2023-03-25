package shl.scraper.util

import org.jsoup.nodes.Element

fun Element.toIntOrNull() = text().toIntOrNull() ?: 0

fun Element.toDoubleOrNull() = text().toDoubleOrNull() ?: 0.0