package shl.scraper.commands.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J6\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0017H\u0002\u00a8\u0006\u0019"}, d2 = {"Lshl/scraper/commands/index/TeamOverviewCommand;", "Lshl/scraper/commands/index/base/BaseIndexCommand;", "()V", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "commandNameRegex", "Lkotlin/text/Regex;", "appendCategoryLeaders", "", "Lshl/scraper/BaseEmbedBuilder;", "name", "players", "Lshl/scraper/index/PlayerStats;", "selector", "Lkotlin/Function1;", "", "SHLScraper"})
public final class TeamOverviewCommand extends shl.scraper.commands.index.base.BaseIndexCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    private final void appendCategoryLeaders(shl.scraper.BaseEmbedBuilder $this$appendCategoryLeaders, java.lang.String name, java.util.List<shl.scraper.index.PlayerStats> players, kotlin.jvm.functions.Function1<? super shl.scraper.index.PlayerStats, java.lang.Integer> selector) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public TeamOverviewCommand() {
        super();
    }
}