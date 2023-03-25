package shl.scraper.roster

import me.xdrop.fuzzywuzzy.FuzzySearch
import shl.scraper.config.ROSTER_REFRESH
import shl.scraper.forum.ShlForumRepository
import shl.scraper.log.Logger
import java.util.concurrent.TimeUnit

object RosterRepository {

    private val playersByUsername = mutableMapOf<String, RosterPlayer>()
    private val playersByPlayerName = mutableMapOf<String, RosterPlayer>()
    private val playersByDraftClass = mutableMapOf<Int, MutableList<RosterPlayer>>()

    @Synchronized
    fun updateMaps(retryCount: Int = 3) {
        if (retryCount <= 0) {
            return
        }

        try {
            playersByUsername.clear()
            playersByPlayerName.clear()
            playersByDraftClass.clear()

            TeamInfo.values().forEach { teamInfo ->
                val roster = getRoster(teamInfo, includeProspects = false)
                roster.players.forEach { player ->
                    playersByUsername[player.userName] = player
                    playersByPlayerName[player.playerName] = player
                    if (player.season != null) {
                        val draftClass = playersByDraftClass.getOrPut(player.season) { mutableListOf() }
                        draftClass.add(player)
                    }

                    if (player.season == null || player.position == null || player.tpe == null) {
                        Logger.log("(!) ${teamInfo.name}: '${player.text}' parsed incorrectly " +
                                "${player.season}/${player.position}/${player.tpe}")
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            updateMaps(retryCount - 1)
        }
    }

    @Synchronized
    fun findRosterPlayer(name: String?): RosterPlayer? {
        if (name.isNullOrBlank()) {
            return null
        }
        val query = name.toLowerCase()

        var bestMatch: Pair<RosterPlayer, Int>? = null

        playersByUsername.forEach { (username, player) ->
            val ratio = FuzzySearch.ratio(query, username.toLowerCase())
            if (ratio > (bestMatch?.second ?: 0)) {
                bestMatch = player to ratio
            }
        }

        playersByPlayerName.forEach { (playerName, player) ->
            val ratio = FuzzySearch.ratio(query, playerName.toLowerCase())
            if (ratio > (bestMatch?.second ?: 0)) {
                bestMatch = player to ratio
            }
        }

        return bestMatch?.first
    }

    @Synchronized
    fun getDraftClassTpeRanking(season: Int): List<RosterPlayer> {
        return playersByDraftClass[season]?.sortedByDescending { it.tpe }.orEmpty()
    }

    @Synchronized
    fun getDraftClass(season: Int) = playersByDraftClass[season].orEmpty().sortedByDescending { it.tpe }

    fun getRoster(teamInfo: TeamInfo, includeProspects: Boolean = true, forceRefresh: Boolean = false): Roster {
        val players = parseRoster(teamInfo, teamInfo.rosterId, forceRefresh)
        val prospects = if (teamInfo.prospectsId != null && includeProspects) {
            parseRoster(teamInfo, teamInfo.prospectsId, forceRefresh)
        } else {
            emptyList()
        }
        return Roster(teamInfo, players, prospects, findGms(teamInfo))
    }

    private fun parseRoster(teamInfo: TeamInfo, forumId: Int, forceRefresh: Boolean): List<RosterPlayer> {
        val result = mutableListOf<RosterPlayer>()
        ShlForumRepository.getThreads(
            forumId = forumId,
            maxPages = 2,
            timeout = if (forceRefresh) 0 else ROSTER_REFRESH
        ).value.forEach { thread ->
            val tpe = thread.note.replace("TPE\\s*:\\s*".toRegex(), "").trim().toIntOrNull()
            val season = thread.name.split("\\s+|]".toRegex())[0].trim()
                .replace("[\\[()\\]S]".toRegex(), "")
                .toIntOrNull()
            result.add(RosterPlayer(teamInfo, thread.name, tpe, thread.startedBy, season, thread))
        }
        result.sortByDescending { it.tpe ?: 0 }
        return result
    }

    private fun findGms(teamInfo: TeamInfo): List<TeamGm> {
        val doc = ShlForumRepository.getDocument("https://simulationhockey.com", TimeUnit.DAYS.toMillis(1)).value
        val rows = doc.select(".tborder2 tbody tr")

        rows.forEachIndexed { index, row ->
            val spans = row.select("td").getOrNull(1)?.select("span").orEmpty()
            val title = spans.firstOrNull()?.text().orEmpty()
            val gms = spans.find { it.text().startsWith("General Managers", ignoreCase = true) }?.select("a")
                ?.filter { it.attr("href").contains("member.php") }
            if (!gms.isNullOrEmpty() && teamInfo.fullName.equals(title, ignoreCase = true)) {
                return gms.map { TeamGm(it.text(), it.attr("href")) }
            }
        }

        return emptyList()
    }

    fun getGoalieBuild(pageUrl: String): GoalieBuild {
        val doc = ShlForumRepository.getDocument(pageUrl)
        val lines = doc.value.select(".post_body")[0].wholeText().split("\n+".toRegex())

        var pointsAvailable: Int? = null
        val attributes = mutableListOf<String>()
        var isWriting = false
        lines.forEach { line ->
            if (line.contains("Points Available", ignoreCase = true)) {
                pointsAvailable = line.replace("\\s*Points Available:\\s*".toRegex(), "").trim().toIntOrNull()
            }

            when {
                line.contains("Goalie Ratings", ignoreCase = true) -> {
                    isWriting = true
                    return@forEach
                }
                line.contains("Mental Ratings", ignoreCase = true) -> {
                    return@forEach
                }
                line.contains("Professionalism", ignoreCase = true) -> {
                    isWriting = false
                    return@forEach
                }
            }

            if (isWriting && !line.startsWith("*")) {
                attributes.add(line)
            }
        }

        return GoalieBuild(pointsAvailable, attributes)
    }

    fun getPlayerBuild(pageUrl: String): PlayerBuild {
        val doc = ShlForumRepository.getDocument(pageUrl)
        val lines = doc.value.select(".post_body")[0].wholeText().split("\n+".toRegex())

        var pointsAvailable: Int? = null
        val offensive = StringBuilder()
        val defensive = StringBuilder()
        val physical = StringBuilder()
        val mental = StringBuilder()
        var ratingsIndex = -1

        lines.forEach { line ->
            if (line.contains("Points Available", ignoreCase = true)) {
                pointsAvailable = line.replace("\\s*Points Available:\\s*".toRegex(), "").trim().toIntOrNull()
            }

            when {
                line.contains("Offensive Ratings", ignoreCase = true) -> {
                    ratingsIndex = 0
                    return@forEach
                }

                line.contains("Defensive Ratings", ignoreCase = true) -> {
                    ratingsIndex = 1
                    return@forEach
                }

                line.contains("Physical Ratings", ignoreCase = true) -> {
                    ratingsIndex = 2
                    return@forEach
                }

                line.contains("Mental Ratings", ignoreCase = true) -> {
                    ratingsIndex = 3
                    return@forEach
                }

                line.contains("Determination", ignoreCase = true) -> {
                    ratingsIndex = -1
                    return@forEach
                }
            }

            when (ratingsIndex) {
                0 -> offensive
                1 -> defensive
                2 -> physical
                3 -> mental
                else -> null
            }?.append("$line\n")
        }

        return PlayerBuild(
            pointsAvailable,
            offensive.toString().trim(),
            defensive.toString().trim(),
            physical.toString().trim(),
            mental.toString().trim()
        )
    }
}