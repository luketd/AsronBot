package shl.scraper.commands.fantasy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002J\u0014\u0010\u0016\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u00a8\u0006\u0019"}, d2 = {"Lshl/scraper/commands/fantasy/FantasyStandingsCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "commandNameRegex", "Lkotlin/text/Regex;", "addGroupStandingsField", "", "Lshl/scraper/BaseEmbedBuilder;", "group", "Lshl/scraper/fantasy/FantasyGroup;", "name", "addRosterField", "roster", "Lshl/scraper/fantasy/FantasyRoster;", "SHLScraper"})
public final class FantasyStandingsCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    private final void addRosterField(shl.scraper.BaseEmbedBuilder $this$addRosterField, shl.scraper.fantasy.FantasyRoster roster) {
    }
    
    private final void addGroupStandingsField(shl.scraper.BaseEmbedBuilder $this$addGroupStandingsField, shl.scraper.fantasy.FantasyGroup group, java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public FantasyStandingsCommand() {
        super();
    }
}