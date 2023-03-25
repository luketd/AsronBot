package shl.scraper.index

enum class LeagueType(val apiId: Int, val logoUrl: String, val cupName: String) {
    SHL(0, "https://cdn.discordapp.com/attachments/623122991504687104/786255150863220767/logoshl.png", "Challenge Cup"),
    SMJHL(1, "https://cdn.discordapp.com/attachments/623122991504687104/786260394875682857/logosmjhl.png", "Four Star Cup"),
    IIHF(2, "https://cdn.discordapp.com/attachments/989545144883761232/990291155587584050/IIHF_logo_white.png", ""),
    WJC(3, "https://cdn.discordapp.com/attachments/623122991504687104/1060596048575340616/image.png", ""),
}