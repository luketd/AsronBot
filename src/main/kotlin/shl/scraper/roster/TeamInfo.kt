package shl.scraper.roster

import shl.scraper.index.LeagueType

enum class TeamInfo(
    val rosterId: Int, val updateId: Int, val fullName: String, val nameRegex: Regex, val teamColor: String,
    val logoUrl: String, val prospectsId: Int? = null, val leagueType: LeagueType = LeagueType.SHL
) {
    // SHL //
    ATLANTA(
        698, 699, "Atlanta Inferno", "(?i)atlanta|atl|inferno".toRegex(), "#be2e1d",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280894495195136/atl.png", 706
    ),
    BALTIMORE(
        102, 103, "Baltimore Platoon", "(?i)baltimore|bap|Platoon".toRegex(), "#08102c",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280902799261736/bap.png", 601
    ),
    BUFFALO(
        526, 528, "Buffalo Stampede", "(?i)buffalo|buf|Stampede".toRegex(), "#164833",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280906683973632/buf.png", 595
    ),
    CHICAGO(
        633, 634, "Chicago Syndicate", "(?i)chicago|chi|Syndicate".toRegex(), "#d9ad00",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280910928085002/chi.png", 636
    ),
    HAMILTON(
        91, 100, "Hamilton Steelhawks", "(?i)hamilton|ham|Steelhawks".toRegex(), "#3e7098",
        "https://cdn.discordapp.com/attachments/623122991504687104/786290158977810552/ham.png", 596
    ),
    MANHATTAN(
        108, 109, "Manhattan Rage", "(?i)manhattan|man|Rage".toRegex(), "#97181b",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281401782763550/man.png", 597
    ),
    NEW_ENGLAND(
        339, 340, "New England Wolfpack", "(?i)new|(new england)|Wolfpack".toRegex(), "#006a36",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281422565408788/new.png", 599
    ),
    TAMPA(
        117, 118, "Tampa Bay Barracuda", "(?i)tampa|tbb|Barracuda".toRegex(), "#f499c2",
        "https://cdn.discordapp.com/attachments/623122991504687104/830574109934747669/tbb.png", 607
    ),
    TORONTO(
        105, 106, "Toronto North Stars", "(?i)tor|toronto|Stars".toRegex(), "#195aa5",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281382753075200/tor.png", 600
    ),
    CALGARY(
        120, 121, "Calgary Dragons", "(?i)calgary|cgy|Dragons".toRegex(), "#a40000",
        "https://cdn.discordapp.com/attachments/623122991504687104/804599067278704670/cgy.png", 603
    ),
    EDMONTON(
        123, 124, "Edmonton Blizzard", "(?i)edmonton|edm|Blizzard".toRegex(), "#33c2ef",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280915415334912/edm.png", 604
    ),
    LOS_ANGELES(
        126, 127, "Los Angeles Panthers", "(?i)lap|(los angeles)|Panthers".toRegex(), "#006b7a",
        "https://cdn.discordapp.com/attachments/623122991504687104/830574039567302727/lap.png", 605
    ),
    MINNESOTA(
        111, 112, "Minnesota Monarchs", "(?i)minnesota|minny|min|Monarchs".toRegex(), "#11582c",
        "https://cdn.discordapp.com/attachments/623122991504687104/786290181635833886/min.png", 598
    ),
    NEW_ORLEANS(
        638, 639, "New Orleans Specters", "(?i)nola|nol|(new orleans)|Specters".toRegex(), "#8623ea",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281429851308073/nola.png", 641
    ),
    SAN_FRANCISCO(
        530, 532, "San Francisco Pride", "(?i)sfp|(san francisco)|Pride".toRegex(), "#360854",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281366853255208/sfp.png", 606
    ),
    SEATTLE(
        701, 702, "Seattle Argonauts", "(?i)seattle|sea|Argonauts".toRegex(), "#1d3565",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281436604137482/sea.png", 705
    ),
    TEXAS(
        345, 346, "Texas Renegades", "(?i)tex|texas|Renegades".toRegex(), "#000000",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281377850589184/tex.png", 608
    ),
    WINNIPEG(
        114, 115, "Winnipeg Aurora", "(?i)wpg|winnipeg|Aurora".toRegex(), "#2ef9b4",
        "https://cdn.discordapp.com/attachments/623122991504687104/992992181411401738/wpg.png", 602
    ),
    MONTREAL(
        735, 736, "Montreal Patriotes", "(?i)mon|mtl|montreal|patriotes|patriots".toRegex(), "#773141",
        "https://cdn.discordapp.com/attachments/623122991504687104/992992505459126272/mtl.png", 744
    ),
    PHILADELPHIA(
        738, 739, "Philadelphia Forge", "(?i)phi|philadelphia|forge".toRegex(), "#e88900",
        "https://cdn.discordapp.com/attachments/623122991504687104/855081245797253170/phi.png", 743
    ),

    // SMJHL //
    YUKON(
        615, 616, "Yukon Malamutes", "(?i)yukon|yum|yukon|yuk|malamutes".toRegex(), "#b1162c",
        "https://cdn.discordapp.com/attachments/623122991504687104/978053209199366194/Malamutes.png", leagueType = LeagueType.SMJHL
    ),
    ANCHORAGE(
        147, 148, "Anchorage Armada", "(?i)anchorage|anc|Armada".toRegex(), "#848482",
        "https://cdn.discordapp.com/attachments/623122991504687104/786290342495256627/anc.png", leagueType = LeagueType.SMJHL
    ),
    CAROLINA(
        135, 136, "Carolina Kraken", "(?i)carolina|car|Kraken".toRegex(), "#cf5b00",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280907833212928/car.png", leagueType = LeagueType.SMJHL
    ),
    COLORADO(
        541, 542, "Colorado Raptors", "(?i)colorado|col|Raptors".toRegex(), "#182d49",
        "https://cdn.discordapp.com/attachments/623122991504687104/830573975423811614/col.png", leagueType = LeagueType.SMJHL
    ),
    DETROIT(
        137, 138, "Detroit Falcons", "(?i)detroit|det|Falcons".toRegex(), "#ec2227",
        "https://cdn.discordapp.com/attachments/623122991504687104/786280913746264094/det.png", leagueType = LeagueType.SMJHL
    ),
    KELOWNA(
        149, 150, "Kelowna Knights", "(?i)kelowna|kel|Knights".toRegex(), "#003300",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281054293590046/kel.png", leagueType = LeagueType.SMJHL
    ),
    MAINE(
        540, 539, "Maine Timber", "(?i)maine|met|Timber".toRegex(), "#082a17",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281402844053574/met.png", leagueType = LeagueType.SMJHL
    ),
    NEVADA(
        690, 691, "Nevada Battleborn", "(?i)nevada|nbb|Battleborn".toRegex(), "#06152f",
        "https://cdn.discordapp.com/attachments/623122991504687104/859176692013334548/nbb.png", leagueType = LeagueType.SMJHL
    ),
    NEWFOUNDLAND(
        617, 618, "Newfoundland Berserkers", "(?i)newfoundland|nl|Berserkers".toRegex(), "#4d4d4d",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281425946017842/nl.png", leagueType = LeagueType.SMJHL
    ),
    QUEBEC(
        692, 693, "Quebec City Citadelles", "(?i)quebec|qcc|Citadelles".toRegex(), "#34476b",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281433132040202/qcc.png", leagueType = LeagueType.SMJHL
    ),
    ST_LOUIS(
        139, 140, "St. Louis Scarecrows", "(?i)stl|Scarecrows".toRegex(), "#eaaa00",
        "https://cdn.discordapp.com/attachments/623122991504687104/786281370367688714/stl.png", leagueType = LeagueType.SMJHL
    ),
    VANCOUVER(
        145, 146, "Vancouver Whalers", "(?i)vancouver|van|Whalers".toRegex(), "#018241",
        "https://cdn.discordapp.com/attachments/623122991504687104/786290849302315008/van.png", leagueType = LeagueType.SMJHL
    ),
    REGINA(
        747, 748, "Regina Elk", "(?i)regina|reg|elk".toRegex(), "#2F0038",
        "https://cdn.discordapp.com/attachments/623122991504687104/880182591020474408/reg.png", leagueType = LeagueType.SMJHL
    ),
    GREAT_FALLS(
        750, 751, "Great Falls Grizzlies", "(?i)gf|gfg|grizzlies|(great falls)".toRegex(), "#b6985a",
        "https://cdn.discordapp.com/attachments/623122991504687104/880183060199534673/gfg.png", leagueType = LeagueType.SMJHL
    ),


    IIHF_TEAM(0, 0, "Random IIHF team", "randomiihf".toRegex(), "", "", 0, LeagueType.IIHF),
    WJC_TEAM(0, 0, "Random WJC team", "randomwjc".toRegex(), "", "", 0, LeagueType.WJC);

    companion object {
        fun find(value: String?): TeamInfo? {
            if (value.isNullOrBlank()) {
                return null
            }
            return values().find {
                value.matches(it.nameRegex) ||
                        it.fullName.equals(value, ignoreCase = true) ||
                        it.name.equals(value, ignoreCase = true)
            }
        }
    }
}