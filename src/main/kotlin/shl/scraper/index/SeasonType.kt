package shl.scraper.index

enum class SeasonType(val shortName: String, val apiName: String) {
    PRE("ps", "preseason"),
    REGULAR("rs", "regular"),
    POST("po", "playoffs")
}