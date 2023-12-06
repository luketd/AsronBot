package shl.scraper.commands.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lshl/scraper/commands/index/LeadersSinceCommand;", "Lshl/scraper/commands/index/base/BaseLeadersCommand;", "()V", "activePlayerIds", "", "", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "commandNameRegex", "Lkotlin/text/Regex;", "toOutputName", "stats", "Lshl/scraper/index/BasePlayerStats;", "SHLScraper"})
public final class LeadersSinceCommand extends shl.scraper.commands.index.base.BaseLeadersCommand {
    private java.util.Set<java.lang.Integer> activePlayerIds;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String toOutputName(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.BasePlayerStats stats) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public LeadersSinceCommand() {
        super();
    }
}