package shl.scraper.commands.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0002J4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00180\fH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u001f\u001a\u00020 *\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0002J\"\u0010&\u001a\u00020 *\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010\'\u001a\u00020 *\u00060!j\u0002`\"2\u0006\u0010%\u001a\u00020\u000eH\u0002J\u0018\u0010\'\u001a\u00020 *\u00060!j\u0002`\"2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0014\u0010(\u001a\u00020\u0005*\u00020$2\u0006\u0010)\u001a\u00020$H\u0002J\u0014\u0010(\u001a\u00020\u0005*\u00020\u00052\u0006\u0010)\u001a\u00020$H\u0002\u00a8\u0006*"}, d2 = {"Lshl/scraper/commands/index/CareerStatsCommand;", "Lshl/scraper/commands/index/base/BaseIndexCommand;", "()V", "buildGoalie", "", "", "career", "Lshl/scraper/index/CareerStats;", "type", "seasonType", "Lshl/scraper/index/SeasonType;", "picker", "Lkotlin/Function1;", "Lshl/scraper/index/CareerStats$Season;", "Lshl/scraper/index/GoalieStats;", "buildResponseArray", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "buildSkater", "Lshl/scraper/index/PlayerStats;", "commandNameRegex", "Lkotlin/text/Regex;", "createGoalieTotals", "leagueType", "Lshl/scraper/index/LeagueType;", "createPlayerTotals", "appendGoalieSeason", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "season", "", "stats", "appendSeason", "appendTotals", "pad", "n", "SHLScraper"})
public final class CareerStatsCommand extends shl.scraper.commands.index.base.BaseIndexCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> buildResponseArray(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    private final java.util.List<java.lang.String> buildSkater(shl.scraper.index.CareerStats career, java.lang.String type, shl.scraper.index.SeasonType seasonType, kotlin.jvm.functions.Function1<? super shl.scraper.index.CareerStats.Season, shl.scraper.index.PlayerStats> picker) {
        return null;
    }
    
    private final shl.scraper.index.PlayerStats createPlayerTotals(shl.scraper.index.CareerStats career, shl.scraper.index.LeagueType leagueType, shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    private final void appendTotals(java.lang.StringBuilder $this$appendTotals, shl.scraper.index.PlayerStats stats) {
    }
    
    private final shl.scraper.index.GoalieStats createGoalieTotals(shl.scraper.index.CareerStats career, shl.scraper.index.LeagueType leagueType, shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    private final void appendTotals(java.lang.StringBuilder $this$appendTotals, shl.scraper.index.GoalieStats stats) {
    }
    
    private final void appendSeason(java.lang.StringBuilder $this$appendSeason, int season, shl.scraper.index.PlayerStats stats) {
    }
    
    private final java.util.List<java.lang.String> buildGoalie(shl.scraper.index.CareerStats career, java.lang.String type, shl.scraper.index.SeasonType seasonType, kotlin.jvm.functions.Function1<? super shl.scraper.index.CareerStats.Season, shl.scraper.index.GoalieStats> picker) {
        return null;
    }
    
    private final void appendGoalieSeason(java.lang.StringBuilder $this$appendGoalieSeason, int season, shl.scraper.index.GoalieStats stats) {
    }
    
    private final java.lang.String pad(java.lang.String $this$pad, int n) {
        return null;
    }
    
    private final java.lang.String pad(int $this$pad, int n) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public CareerStatsCommand() {
        super();
    }
}