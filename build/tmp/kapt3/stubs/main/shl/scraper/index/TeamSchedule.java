package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/index/TeamSchedule;", "", "teamName", "", "teamId", "", "completedGames", "", "Lshl/scraper/index/api/GameInfo;", "upcomingGames", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getCompletedGames", "()Ljava/util/List;", "getTeamId", "()I", "getTeamName", "()Ljava/lang/String;", "getUpcomingGames", "getResult", "Lshl/scraper/index/GameResult;", "game", "SHLScraper"})
public final class TeamSchedule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String teamName = null;
    private final int teamId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.index.api.GameInfo> completedGames = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.index.api.GameInfo> upcomingGames = null;
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.GameResult getResult(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.api.GameInfo game) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTeamName() {
        return null;
    }
    
    public final int getTeamId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.api.GameInfo> getCompletedGames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.api.GameInfo> getUpcomingGames() {
        return null;
    }
    
    public TeamSchedule(@org.jetbrains.annotations.NotNull()
    java.lang.String teamName, int teamId, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.api.GameInfo> completedGames, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.api.GameInfo> upcomingGames) {
        super();
    }
}