package shl.scraper.commands.index.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0004J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0014J\f\u0010\u0011\u001a\u00020\u000f*\u00020\u0010H\u0014\u00a8\u0006\u0012"}, d2 = {"Lshl/scraper/commands/index/base/BaseLeagueStandingsCommand;", "Lshl/scraper/commands/index/base/BaseIndexCommand;", "()V", "createResponse", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "leagueType", "Lshl/scraper/index/LeagueType;", "divisions", "", "Lshl/scraper/index/api/LeagueDivision;", "embedColor", "Ljava/awt/Color;", "getDisplayedName", "", "Lshl/scraper/index/TeamStats;", "getDisplayedRecord", "SHLScraper"})
public abstract class BaseLeagueStandingsCommand extends shl.scraper.commands.index.base.BaseIndexCommand {
    
    @org.jetbrains.annotations.NotNull()
    protected final net.dv8tion.jda.api.EmbedBuilder createResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.api.LeagueDivision> divisions, @org.jetbrains.annotations.Nullable()
    java.awt.Color embedColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getDisplayedName(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats $this$getDisplayedName, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getDisplayedRecord(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats $this$getDisplayedRecord) {
        return null;
    }
    
    public BaseLeagueStandingsCommand() {
        super();
    }
}