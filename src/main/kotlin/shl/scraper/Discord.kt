package shl.scraper

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Message
import net.dv8tion.jda.api.entities.channel.ChannelType
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.requests.GatewayIntent
import shl.scraper.commands.*
import shl.scraper.commands.admin.*
import shl.scraper.commands.custom.AddCustomCommand
import shl.scraper.commands.custom.PrintAllCustomCommand
import shl.scraper.commands.custom.RemoveCustomCommand
import shl.scraper.commands.fantasy.*
import shl.scraper.commands.index.*
import shl.scraper.commands.index.iihf.IihfPlayerStatsCommand
import shl.scraper.commands.index.iihf.IihfStandingsCommand
import shl.scraper.commands.index.iihf.IihfTeamScheduleCommand
import shl.scraper.config.*
import shl.scraper.custom.CustomCommandRepository
import shl.scraper.index.api.IndexApiClient
import shl.scraper.log.Logger
import shl.scraper.util.appendEmoji
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Discord {
    val jda: JDA

    private val commands = listOf(
        ListThreadsCommand(), ListTpeCommand(), ListJuniorTpeCommand(), UpdateDynamicConfigCommand(),
        PrintDynamicConfigCommand(), ShowClaimsCommand(), ShowUserPtStatsCommand(), RosterCommand(), TeamUpdateListCommand(),
        TeamPtStatsCommand(), StoreUserCommand(), ShowStoredUserPtStatsCommand(), ForumSubscribeCommand(),
        StreamPtsCommand(), SubscribeToPtClaimsCommand(), PrintSubscriptionsCommand(), IgnorePtClaimCommand(),
        AddCustomCommand(), RemoveCustomCommand(), PrintAllCustomCommand(), FantasyStandingsCommand(),
        FantasyGlobalCommand(), FantasyCategoriesCommand(), LeagueStandingsCommand(),
        TeamScheduleCommand(), PlayerStatsCommand(), TeamOverviewCommand(), ShowMissedPtsCommand(),
        FantasyTopPlayersCommand(), HelpCommand(), StorePlayerNameCommand(), LeagueLeadersCommand(),
        PlayoffBracketCommand(), CareerStatsCommand(), RecordsCommand(),
        RosterRankCommand(), LeadersSinceCommand(), DraftClassTpeRankCommand(),
        IihfStandingsCommand(), IihfPlayerStatsCommand(), IihfTeamScheduleCommand(),
        TeamStatsRankingCommand()
    )

    private val executor = Executors.newFixedThreadPool(5)

    init {
        val isDebug = BuildTypeConfigProvider.buildType.isDebug
        val config = BuildTypeConfigProvider.config

        jda = with(JDABuilder.createDefault(config.discordBotToken)) {
            enableIntents(GatewayIntent.MESSAGE_CONTENT)

            addEventListeners(object : ListenerAdapter() {
                override fun onMessageReceived(event: MessageReceivedEvent) {
                    super.onMessageReceived(event)
                    if (IndexApiClient.isUpdateTrigger(event, config)) {
                        return
                    }
                    if (isDebug && event.guild.id != System.getenv("testServerId") || event.author.isBot) {
                        return
                    }

                    val isBotPing = event.message.mentions.users.firstOrNull { it.id == BOT_ID } != null
                    if (isBotPing) {
                        val response = StringBuilder().apply { appendEmoji(event, "pepeping") }
                        event.channel.sendMessage(response).queue()
                    }

                    val command = commands.find { it.isCommand(event) }
                    if (command != null) {
                        executor.execute {
                            sendReply(event, command)
                        }
                    } else {
                        CustomCommandRepository.find(event.guild.id, event.message.contentDisplay)?.let { custom ->
                            sendMessage(custom.content, event.channel)
                        } ?: run {
                            if (event.message.contentDisplay.endsWith("_all")) {
                                CustomCommandRepository.getAllCommands(
                                    event.guild.id, event.message.contentDisplay
                                )?.forEach {
                                    sendMessage(it.content, event.channel)
                                }
                            }
                        }
                    }
                }
            })
            build()
        }

        jda.awaitReady()

        println("Server count = ${jda.guilds.size}")
    }

    private fun sendReply(event: MessageReceivedEvent, command: DiscordCommand) {
        try {
            val arguments = event.message.contentRaw.split("\\s+".toRegex()).toMutableList()
            arguments.removeAt(0)

            val userRole = when {
                BOT_OWNER_IDS.contains(event.author.id) -> {
                    UserRole.BOT_OWNER
                }

                BOT_CO_OWNER_IDS.contains(event.author.id) -> {
                    UserRole.BOT_CO_OWNER
                }

                event.guild.ownerId == event.author.id -> {
                    UserRole.SERVER_ADMIN
                }

                else -> UserRole.REGULAR
            }

            var loadingMessage: Message? = null
            val future = event.channel.sendMessage("Loading...").queueAfter(500L, TimeUnit.MILLISECONDS) { message ->
                loadingMessage = message
            }

            val embed = command.buildResponseEmbed(event, arguments, userRole, this)
            if (embed != null) {
                event.channel.sendMessageEmbeds(embed.build()).queue()
            } else {
                val responseList = command.buildResponseArray(event, arguments, userRole, this)
                if (responseList != null) {
                    responseList.forEach {
                        sendMessage(it, event.channel)
                    }
                } else {
                    val response = command.buildResponse(event, arguments, userRole, this)
                    sendMessage(response, event.channel)
                }
            }

            future.cancel(true)
            loadingMessage?.delete()?.queue()
        } catch (e: Exception) {
            Logger.log("Error: ${e.javaClass.simpleName}(${e.message})")
            e.printStackTrace()
            sendError(event, e)
        }
    }

    fun sendMessage(message: String?, channel: MessageChannelUnion) {
        if (channel.type == ChannelType.TEXT) {
            sendMessage(message, channel.asTextChannel())
        }
    }

    fun sendMessage(message: String?, channel: TextChannel) {
        if (!message.isNullOrBlank()) {
            splitMessage(message).filter { it.isNotBlank() }.forEach { responsePart ->
                channel.sendMessage(responsePart).queue()
            }
        }
    }

    private fun splitMessage(message: String): List<String> {
        val size = 1800

        val parts = message.split("\n")
        val result = mutableListOf<String>()

        var current = ""
        parts.forEach { part ->
            if (current.length + part.length > size) {
                result.add(current)
                current = ""
            }

            current += "$part\n"
        }
        if (current.isNotBlank()) {
            result.add(current)
        }

        return result;
    }

    private fun sendError(event: MessageReceivedEvent, e: Exception) {
        event.channel.sendMessage("Something went terribly wrong (${e.javaClass.simpleName})").queue()
    }

}