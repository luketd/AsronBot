package shl.scraper.util

import me.xdrop.fuzzywuzzy.FuzzySearch

fun Double.afterDecimal(n: Int): String {
    return String.format("%.${n}f", this)
}

fun Float.afterDecimal(n: Int): String {
    return String.format("%.${n}f", this)
}

fun Int.toDisplayString(): String {
    return when {
        this in 11..13 -> {
            "${this}th"
        }
        this % 10 == 1 -> {
            "${this}st"
        }
        this % 10 == 2 -> {
            "${this}nd"
        }
        this % 10 == 3 -> {
            "${this}rd"
        }
        else -> "${this}th"
    }
}

fun String.toDoubleOrNullWithComma(): Double {
    return replace(",", "").toDoubleOrNull() ?: 0.0
}

fun <T> List<T>.fuzzySearch(query: String?, searchBy: (T) -> String): Pair<T, Int>? {
    val indexed = fuzzySearchIndex(query, searchBy) ?: return null
    return getOrNull(indexed.first)?.let {
        Pair(it, indexed.second)
    }
}

fun <T> List<T>.fuzzySearchIndex(query: String?, searchBy: (T) -> String): Pair<Int, Int>? {
    if (query.isNullOrEmpty()) {
        return null
    }
    val lowerCaseQuery = query.toLowerCase()

    var maxRatio = -1
    var maxRatioIndex = -1
    var maxContainsRatio = -1
    var maxContainsIndex = -1
    forEachIndexed { index, item ->
        val itemValue = searchBy(item).toLowerCase()
        val ratio = FuzzySearch.ratio(itemValue, lowerCaseQuery)
        if (ratio > maxRatio) {
            maxRatio = ratio
            maxRatioIndex = index
        }

        if (itemValue.contains(lowerCaseQuery) && ratio > maxContainsRatio) {
            maxContainsRatio = ratio
            maxContainsIndex = index
        }
    }

    return when {
        maxRatio >= 70 -> {
            Pair(maxRatioIndex, maxRatio)
        }
        maxRatio in 50..70 && maxContainsRatio >= 50 -> {
            Pair(maxContainsIndex, maxContainsRatio)
        }
        maxRatio in 60..70 -> {
            Pair(maxRatioIndex, maxRatio)
        }
        maxContainsRatio > 0 -> {
            Pair(maxContainsIndex, maxContainsRatio)
        }
        else -> {
            null
        }
    }
}