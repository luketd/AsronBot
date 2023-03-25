package shl.scraper.subscribe

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel
import shl.scraper.Discord
import shl.scraper.config.BuildProperties
import shl.scraper.config.FORUM_THREAD_LIST_REFRESH
import shl.scraper.config.HAM_SERVER_ID
import shl.scraper.forum.ShlForumRepository
import shl.scraper.util.ForumThread
import java.util.*
import java.util.concurrent.Executors

private val executor = Executors.newSingleThreadExecutor()

class ForumMonitorTask(private val config: ForumSubscription, private val discord: Discord) {

    private val timer = Timer()
    private var lastThreadId = config.lastThreadId
    private var lastDueTodayReminderDayOfMonth = config.lastDueTodayReminderDayOfMonth

    init {
        timer.scheduleAtFixedRate(
            object : TimerTask() {
                override fun run() {
                    executor.execute {
                        try {
                            check()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }, 0, FORUM_THREAD_LIST_REFRESH
        )
    }

    @Synchronized
    private fun check() {
        val channel = discord.jda.getGuildById(config.serverId)?.getTextChannelById(config.channelId)
        channel ?: return

        val threads = ShlForumRepository.getThreadsSynced(config.forumId).value
        val newThreads = threads.filter {
            it.threadId > lastThreadId && lastThreadId > 0
        }
        lastThreadId = threads.maxOf { it.threadId }

        if (config.serverId == BuildProperties.TEST_SERVER_ID || config.serverId == HAM_SERVER_ID) {
            sendPtRemindersIfNeeded(threads, channel)
        }

        ForumSubscriptionRepository.add(
            config.copy(
                lastThreadId = lastThreadId,
                lastDueTodayReminderDayOfMonth = lastDueTodayReminderDayOfMonth
            )
        )

        if (newThreads.isNotEmpty()) {
            val message = buildString {
                if (!config.mentionRoleId.isNullOrEmpty()) {
                    append("<@&${config.mentionRoleId}> ")
                }
                append("New threads in `${newThreads[0].forumName}`!")
                append("\n")
                newThreads.forEach {
                    append("\n${it.name}: <${it.link}>")
                    if (it.note.isNotBlank()) {
                        append("\n${it.note}\n")
                    }
                }
            }


            discord.sendMessage(message, channel)
        }
    }

    private fun sendPtRemindersIfNeeded(threads: List<ForumThread>, channel: TextChannel) {
        val isPtForum = config.forumId == 45 || config.forumId == 66
        if (isPtForum) {
            val today = Calendar.getInstance().apply {
                timeZone = TimeZone.getTimeZone("PST")
            }

            val dueToday = threads.map { it to parsePtDueDate(it.note) }.filter { (thread, type) ->
                !thread.locked && when (type) {
                    null -> false
                    is PtDueDateType.Day,
                    is PtDueDateType.SimStart -> {
                        type.date.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH) &&
                                type.date.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                    }

                    is PtDueDateType.Exact -> {
                        type.date.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH) &&
                                type.date.get(Calendar.MONTH) == today.get(Calendar.MONTH) &&
                                type.date.timeInMillis > today.timeInMillis
                    }
                }
            }.sortedBy { (_, type) ->
                when (type) {
                    is PtDueDateType.SimStart -> 0
                    is PtDueDateType.Day -> 1
                    is PtDueDateType.Exact -> 2
                    null -> 3
                }
            }

            if (dueToday.isNotEmpty() && today.get(Calendar.HOUR_OF_DAY) >= 8
                && today.get(Calendar.DAY_OF_MONTH) != lastDueTodayReminderDayOfMonth
            ) {
                val message = buildString {
                    if (!config.mentionRoleId.isNullOrEmpty()) {
                        append("<@&${config.mentionRoleId}> ")
                    }
                    append("Tasks due today:\n")

                    dueToday.forEach { (thread, _) ->
                        append("\n")
                        append(thread.note)
                        append("\n${thread.name}: <${thread.link}>\n")
                    }
                }
                discord.sendMessage(message, channel)
                lastDueTodayReminderDayOfMonth = today.get(Calendar.DAY_OF_MONTH)
            }
        }
    }

    fun cancel() {
        timer.cancel()
    }
}