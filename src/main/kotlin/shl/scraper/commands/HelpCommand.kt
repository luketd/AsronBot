package shl.scraper.commands

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import shl.scraper.BaseEmbedBuilder
import shl.scraper.Discord
import shl.scraper.UserRole

class HelpCommand : DiscordCommand() {
    override fun buildResponseEmbed(
        event: MessageReceivedEvent,
        arguments: List<String>,
        userRole: UserRole,
        discord: Discord
    ): EmbedBuilder {
        return BaseEmbedBuilder(event = event).apply {
            setTitle("Help")

            setDescription("Arguments in brackets [] are optional")

            addField { builder ->
                builder.appendCommandDescription("!store username team", "Store your info")
                builder.appendCommandDescription("!pstore player", "Overwrite your player name if necessary")
            }

            addField("League index") { builder ->
                builder.appendCommandDescription("!p [season] [player]", "Player stats")
                builder.appendCommandDescription("!st[j] [season]", "SHL/SMJHL standings")
                builder.appendCommandDescription("!s [team]", "Team schedule")
                builder.appendCommandDescription("!t [season] [team]", "Team overview")
                builder.appendCommandDescription("!tstats[j] [season]", "Team stats")
                builder.appendCommandDescription("!playoffs[j] [season]", "Playoff matchups")
                builder.appendCommandDescription("!career [player]", "Career stats")
                builder.appendCommandDescription("!leaders[j] [season] [type: -rs|po] [category: -points|goals|etc] [position: -f|d|g|r] [team] [player]", "League leaders")
                builder.appendCommandDescription("!records[j] [type: -rs|po] [category: -points|goals|etc] [position: -f|d|g] [team] [player]", "League records")
                builder.appendCommandDescription("!since[j] [season] [type: -rs|po] [category: -points|goals|etc] [position: -f|d|g] [team] [draft class: e.g. -dc62] [player]", "League leaders since [season] or all time")
            }

            addField("SHL fantasy") { builder ->
                builder.appendCommandDescription("!f [username] [group_number]", "Group standings")
                builder.appendCommandDescription("!fg [username]", "Global standings")
                builder.appendCommandDescription("!fc [username]", "Category standings")
                builder.appendCommandDescription("!fp [season] [position: -f|d|g]", "Top fantasy players")
            }

            addField("IIHF & WJC") { builder ->
                builder.appendCommandDescription("iihf!p [season] [player]", "Player stats")
                builder.appendCommandDescription("iihf!st [season]", "Standings")
                builder.appendCommandDescription("iihf!s team", "Team schedule")
                builder.append("replace iihf with wjc for wjc (e.g. wjc!st)")
            }

            addField("TPE and PTs") { builder ->
                builder.appendCommandDescription("!show [username] [player]", "Info card for username/player")
                builder.appendCommandDescription("!roster [team]", "Team roster")
                builder.appendCommandDescription("!teampt", "Team PT stats")
                builder.appendCommandDescription("!rosterank[j]", "Teams sorted by tpe")
                builder.appendCommandDescription("!dcrank [season]", "Draft class by tpe")
            }

            addField("Custom commands") { builder ->
                builder.append("You can add custom commands which will only work in your server\n")
                builder.appendCommandDescription("!custom command content", "New command")
                builder.appendCommandDescription("!pcustom", "Prints all saved commands")
                builder.appendCommandDescription("!customr command", "Removes a saved command")
            }

            addField("Subscriptions") { builder ->
                builder.appendCommandDescription("!subscriptions", "Print active subscriptions")
                builder.appendCommandDescription("![un]subscribe pt[j] [@Role]", "Subscribe to PTs subforum")
                builder.appendCommandDescription("![un]subscribe claims[j] [team] [@Role]", "Subscribe to PT claims")
                builder.appendCommandDescription("![un]subscribe forumId [@Role]", "Subscribe to any subforum by id")
            }

            if (userRole.ordinal >= UserRole.BOT_CO_OWNER.ordinal) {
                addField("Bot config") { builder ->
                    builder.appendCommandDescription("!pconfig", "")
                    builder.appendCommandDescription("!ignoreclaim postId", "")
                    builder.appendCommandDescription("!uconfig season shlClaimThreads jClaimThreads fantasySheetId", "")
                }
            }

            addField {
                it.append(
                    "If you want to add this bot to your server," +
                            " [use this link](https://discord.com/api/oauth2/authorize?client_id=1181766251366858772&permissions=125968&scope=bot)"
                )
            }
        }
    }

    private fun StringBuilder.appendCommandDescription(command: String, description: String) {
        append("• `$command` $description\n")
    }

    override fun commandNameRegex(): Regex {
        return "(?i)!help\\s*".toRegex()
    }

}