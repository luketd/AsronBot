package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0012R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001c\u00a8\u00068"}, d2 = {"Lshl/scraper/index/api/GameInfo;", "", "season", "", "league", "date", "", "homeTeam", "homeScore", "awayTeam", "awayScore", "type", "played", "overtime", "shootout", "slug", "(IILjava/lang/String;IIIILjava/lang/String;IIILjava/lang/String;)V", "getAwayScore", "()I", "getAwayTeam", "awayTeamInfo", "Lshl/scraper/index/api/TeamInfoResponse;", "getAwayTeamInfo", "()Lshl/scraper/index/api/TeamInfoResponse;", "setAwayTeamInfo", "(Lshl/scraper/index/api/TeamInfoResponse;)V", "boxScoreLink", "getBoxScoreLink", "()Ljava/lang/String;", "getDate", "getHomeScore", "getHomeTeam", "homeTeamInfo", "getHomeTeamInfo", "setHomeTeamInfo", "getLeague", "leagueType", "Lshl/scraper/index/LeagueType;", "getLeagueType", "()Lshl/scraper/index/LeagueType;", "getOvertime", "getPlayed", "getSeason", "seasonType", "Lshl/scraper/index/SeasonType;", "getSeasonType", "()Lshl/scraper/index/SeasonType;", "setSeasonType", "(Lshl/scraper/index/SeasonType;)V", "getShootout", "getSlug", "timestamp", "", "getTimestamp", "()J", "getType", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class GameInfo {
    private final long timestamp = 0L;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.api.TeamInfoResponse awayTeamInfo;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.api.TeamInfoResponse homeTeamInfo;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.SeasonType seasonType;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.LeagueType leagueType = null;
    private final int season = 0;
    private final int league = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    private final int homeTeam = 0;
    private final int homeScore = 0;
    private final int awayTeam = 0;
    private final int awayScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int played = 0;
    private final int overtime = 0;
    private final int shootout = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.api.TeamInfoResponse getAwayTeamInfo() {
        return null;
    }
    
    public final void setAwayTeamInfo(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.api.TeamInfoResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.api.TeamInfoResponse getHomeTeamInfo() {
        return null;
    }
    
    public final void setHomeTeamInfo(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.api.TeamInfoResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.SeasonType getSeasonType() {
        return null;
    }
    
    public final void setSeasonType(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.LeagueType getLeagueType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBoxScoreLink() {
        return null;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final int getLeague() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final int getHomeTeam() {
        return 0;
    }
    
    public final int getHomeScore() {
        return 0;
    }
    
    public final int getAwayTeam() {
        return 0;
    }
    
    public final int getAwayScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int getPlayed() {
        return 0;
    }
    
    public final int getOvertime() {
        return 0;
    }
    
    public final int getShootout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public GameInfo(int season, int league, @org.jetbrains.annotations.NotNull()
    java.lang.String date, int homeTeam, int homeScore, int awayTeam, int awayScore, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int played, int overtime, int shootout, @org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        super();
    }
}