package shl.scraper.commands.index.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002JB\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\n2\u001c\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/commands/index/base/BasePlayerStatsCommand;", "Lshl/scraper/commands/index/base/BaseIndexCommand;", "()V", "buildGoalieStatsReply", "Lshl/scraper/BaseEmbedBuilder;", "stats", "Lshl/scraper/index/GoalieStats;", "buildSkaterStatsReply", "Lshl/scraper/index/PlayerStats;", "includeFantasy", "", "createResponse", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "getStats", "Lkotlin/Function2;", "", "Lshl/scraper/index/BasePlayerStats;", "SHLScraper"})
public abstract class BasePlayerStatsCommand extends shl.scraper.commands.index.base.BaseIndexCommand {
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.BaseEmbedBuilder createResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, boolean includeFantasy, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, ? extends shl.scraper.index.BasePlayerStats> getStats) {
        return null;
    }
    
    private final shl.scraper.BaseEmbedBuilder buildSkaterStatsReply(shl.scraper.index.PlayerStats stats, boolean includeFantasy) {
        return null;
    }
    
    private final shl.scraper.BaseEmbedBuilder buildGoalieStatsReply(shl.scraper.index.GoalieStats stats) {
        return null;
    }
    
    public BasePlayerStatsCommand() {
        super();
    }
}