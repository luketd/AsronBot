package shl.scraper.subscribe.claims

import shl.scraper.Discord
import shl.scraper.config.DynamicConfigRepository
import shl.scraper.config.FORUM_THREAD_LIST_REFRESH
import shl.scraper.forum.ShlForumRepository
import shl.scraper.roster.RosterRepository
import shl.scraper.tpe.TpeClaim
import shl.scraper.tpe.TpeClaimRepository
import shl.scraper.util.ThreadPost
import java.util.*
import java.util.concurrent.Executors

private val executor = Executors.newSingleThreadExecutor()

class PtClaimsTask(private val config: PtClaimSubscription, private val discord: Discord) {

    private val timer = Timer()
    private var lastRunTimestamp = config.lastRunTimestamp ?: Long.MAX_VALUE

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

        val forumId = if (config.junior) 66 else 45
        val threads = ShlForumRepository.getThreadsSynced(forumId).value
        val threadIds = if (config.junior) {
            DynamicConfigRepository.config.juniorClaimThreads
        } else {
            DynamicConfigRepository.config.shlClaimThreadIds
        }

        val newClaimPosts = mutableListOf<ThreadPost>()
        threadIds.forEach { threadId ->
            threads.find { it.threadId == threadId }?.let { thread ->
                if (thread.parseLastPostDate().time > lastRunTimestamp) {
                    ShlForumRepository.getPostsSynced(threadId).value.filter { post ->
                        post.timestamp > lastRunTimestamp
                    }.forEach {
                        newClaimPosts.add(it)
                    }
                }
            }
        }

        PtClaimSubscriptionRepository.add(config.copy(lastRunTimestamp = System.currentTimeMillis()))
        lastRunTimestamp = System.currentTimeMillis()

        if (newClaimPosts.isNotEmpty()) {
            val roster = if (config.team != null) {
                RosterRepository.getRoster(config.team, includeProspects = true)
            } else {
                null
            }

            newClaimPosts.sortBy { it.postId }

            newClaimPosts.forEach { post ->
                val message = buildString {
                    if (!config.mentionRoleId.isNullOrEmpty()) {
                        append("<@&${config.mentionRoleId}> ")
                    }
                    val leagueName = if (config.junior) {
                        "SMJHL"
                    } else {
                        "SHL"
                    }
                    append("New $leagueName PT claim")

                    append("\n\n")
                    if (post.body.length > 100) {
                        append(post.body.substring(0, 100))
                        append("...")
                    } else {
                        append(post.body)
                    }

                    append("\n<${post.link}>")

                    if (roster != null) {
                        append("\n")

                        append("```\n")
                        val lines = TpeClaimRepository.convertClaimPostToLines(post)
                        roster.playersPlusProspects.sortedBy { it.userName.toLowerCase() }.forEach { player ->
                            val line = lines.find {
                                TpeClaim.doesMatch(player.userName, it)
                            }
                            if (line != null) {
                                append("$line\n")
                            }
                        }
                        append("```")
                    }
                }

                discord.sendMessage(message, channel)
            }
        }
    }

    fun cancel() {
        timer.cancel()
    }
}