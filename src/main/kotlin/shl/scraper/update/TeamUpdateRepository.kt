package shl.scraper.update

import shl.scraper.forum.ShlForumRepository
import shl.scraper.roster.RosterRepository
import shl.scraper.roster.TeamInfo
import shl.scraper.util.ForumThread
import java.util.*
import java.util.concurrent.TimeUnit

object TeamUpdateRepository {
    fun getUpdates(teamInfo: TeamInfo): List<PlayerUpdateInfo> {
        val roster = RosterRepository.getRoster(teamInfo, includeProspects = false)
        return ShlForumRepository.getThreads(teamInfo.updateId).value.filter {
            roster.find(it.startedBy) != null
        }.map {
            toUpdateInfo(it)
        }
    }

    fun getUpdate(userName: String, teamInfo: TeamInfo): PlayerUpdateInfo? {
        val thread = ShlForumRepository.getThreads(teamInfo.updateId).value.find {
            it.startedBy.equals(userName, ignoreCase = true)
        }
        return toUpdateInfo(thread ?: return null)
    }

    private fun toUpdateInfo(thread: ForumThread): PlayerUpdateInfo {
        return PlayerUpdateInfo(isUpdated(thread), thread)
    }

    private fun isUpdated(thread: ForumThread): Boolean {
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        val isWeekend = day == Calendar.SATURDAY || day == Calendar.SUNDAY

        return thread.startedBy == thread.lastPostBy
                || isWeekend && System.currentTimeMillis() - thread.parseLastPostDate().time < TimeUnit.DAYS.toMillis(2)
    }
}