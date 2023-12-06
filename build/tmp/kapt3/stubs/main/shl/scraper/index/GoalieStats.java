package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0014H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0006H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\u00da\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001\u00a2\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001J\u0011\u0010V\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0000H\u0086\u0002J\t\u0010W\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u00100\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u00109R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001e\u00a8\u0006X"}, d2 = {"Lshl/scraper/index/GoalieStats;", "Lshl/scraper/index/BasePlayerStats;", "id", "", "sthsId", "name", "", "league", "season", "team", "teamId", "gamesPlayed", "minutes", "wins", "losses", "ot", "shotsAgainst", "saves", "goalsAgainst", "gaa", "", "shutouts", "savePct", "gameRating", "seasonType", "Lshl/scraper/index/SeasonType;", "(ILjava/lang/Integer;Ljava/lang/String;IILjava/lang/String;IIIIIIIIIDILjava/lang/String;ILshl/scraper/index/SeasonType;)V", "getGaa", "()D", "getGameRating", "()I", "getGamesPlayed", "getGoalsAgainst", "getId", "getLeague", "getLosses", "getMinutes", "getName", "()Ljava/lang/String;", "getOt", "getSavePct", "getSaves", "getSeason", "getSeasonType", "()Lshl/scraper/index/SeasonType;", "setSeasonType", "(Lshl/scraper/index/SeasonType;)V", "getShotsAgainst", "shotsAgainstPerGame", "getShotsAgainstPerGame", "getShutouts", "getSthsId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTeam", "getTeamId", "setTeamId", "(I)V", "getWins", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;IILjava/lang/String;IIIIIIIIIDILjava/lang/String;ILshl/scraper/index/SeasonType;)Lshl/scraper/index/GoalieStats;", "equals", "", "other", "", "hashCode", "plus", "toString", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class GoalieStats implements shl.scraper.index.BasePlayerStats {
    private final double shotsAgainstPerGame = 0.0;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer sthsId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int league = 0;
    private final int season = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String team = null;
    private int teamId;
    private final int gamesPlayed = 0;
    private final int minutes = 0;
    private final int wins = 0;
    private final int losses = 0;
    private final int ot = 0;
    private final int shotsAgainst = 0;
    private final int saves = 0;
    private final int goalsAgainst = 0;
    private final double gaa = 0.0;
    private final int shutouts = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String savePct = null;
    private final int gameRating = 0;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.SeasonType seasonType;
    
    public final double getShotsAgainstPerGame() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.GoalieStats plus(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.GoalieStats other) {
        return null;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getSthsId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public int getLeague() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSeason() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTeam() {
        return null;
    }
    
    @java.lang.Override()
    public int getTeamId() {
        return 0;
    }
    
    public void setTeamId(int p0) {
    }
    
    @java.lang.Override()
    public int getGamesPlayed() {
        return 0;
    }
    
    public final int getMinutes() {
        return 0;
    }
    
    public final int getWins() {
        return 0;
    }
    
    public final int getLosses() {
        return 0;
    }
    
    public final int getOt() {
        return 0;
    }
    
    public final int getShotsAgainst() {
        return 0;
    }
    
    public final int getSaves() {
        return 0;
    }
    
    public final int getGoalsAgainst() {
        return 0;
    }
    
    public final double getGaa() {
        return 0.0;
    }
    
    public final int getShutouts() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSavePct() {
        return null;
    }
    
    public final int getGameRating() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public shl.scraper.index.SeasonType getSeasonType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSeasonType(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType p0) {
    }
    
    public GoalieStats(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sthsId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int league, int season, @org.jetbrains.annotations.NotNull()
    java.lang.String team, int teamId, int gamesPlayed, int minutes, int wins, int losses, int ot, int shotsAgainst, int saves, int goalsAgainst, double gaa, int shutouts, @org.jetbrains.annotations.NotNull()
    java.lang.String savePct, int gameRating, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        super();
    }
    
    public GoalieStats() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.SeasonType component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.GoalieStats copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sthsId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int league, int season, @org.jetbrains.annotations.NotNull()
    java.lang.String team, int teamId, int gamesPlayed, int minutes, int wins, int losses, int ot, int shotsAgainst, int saves, int goalsAgainst, double gaa, int shutouts, @org.jetbrains.annotations.NotNull()
    java.lang.String savePct, int gameRating, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}