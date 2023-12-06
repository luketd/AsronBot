package shl.scraper.roster;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010&\u001a\u00020\'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lshl/scraper/roster/Roster;", "", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "players", "", "Lshl/scraper/roster/RosterPlayer;", "prospects", "gms", "Lshl/scraper/roster/TeamGm;", "(Lshl/scraper/roster/TeamInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "backupGoalie", "getBackupGoalie", "()Lshl/scraper/roster/RosterPlayer;", "defense", "getDefense", "()Ljava/util/List;", "forwards", "getForwards", "getGms", "goalies", "getGoalies", "getPlayers", "playersPlusProspects", "getPlayersPlusProspects", "getProspects", "startingGoalie", "getStartingGoalie", "getTeamInfo", "()Lshl/scraper/roster/TeamInfo;", "averageTpe", "", "season", "", "averageTpeDefense", "averageTpeForwards", "averageTpeSkaters", "find", "query", "", "SHLScraper"})
public final class Roster {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> playersPlusProspects = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> forwards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> defense = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> goalies = null;
    @org.jetbrains.annotations.Nullable()
    private final shl.scraper.roster.RosterPlayer startingGoalie = null;
    @org.jetbrains.annotations.Nullable()
    private final shl.scraper.roster.RosterPlayer backupGoalie = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.roster.TeamInfo teamInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> players = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.RosterPlayer> prospects = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.roster.TeamGm> gms = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getPlayersPlusProspects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getForwards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getGoalies() {
        return null;
    }
    
    public final double averageTpe(int season) {
        return 0.0;
    }
    
    public final double averageTpeForwards(int season) {
        return 0.0;
    }
    
    public final double averageTpeDefense(int season) {
        return 0.0;
    }
    
    public final double averageTpeSkaters(int season) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.roster.RosterPlayer getStartingGoalie() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.roster.RosterPlayer getBackupGoalie() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.roster.RosterPlayer find(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.roster.TeamInfo getTeamInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.RosterPlayer> getProspects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.roster.TeamGm> getGms() {
        return null;
    }
    
    public Roster(@org.jetbrains.annotations.NotNull()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.roster.RosterPlayer> players, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.roster.RosterPlayer> prospects, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.roster.TeamGm> gms) {
        super();
    }
}