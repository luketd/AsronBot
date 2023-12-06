package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lshl/scraper/index/SthsIndexRepository;", "", "()V", "allGoalieStats", "", "Lshl/scraper/index/GoalieStats;", "allGoalieStatsFixed", "getAllGoalieStatsFixed", "()Ljava/util/List;", "allPlayerStats", "Lshl/scraper/index/PlayerStats;", "allPlayerStatsFixed", "getAllPlayerStatsFixed", "franchiseIdByTeamIdMap", "", "", "franchises", "", "getAllStats", "Lshl/scraper/index/BasePlayerStats;", "isGoalie", "", "SHLScraper"})
public final class SthsIndexRepository {
    private static final java.util.Map<java.lang.Integer, java.lang.String> franchises = null;
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> franchiseIdByTeamIdMap = null;
    private static final java.util.List<shl.scraper.index.PlayerStats> allPlayerStats = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<shl.scraper.index.PlayerStats> allPlayerStatsFixed = null;
    private static final java.util.List<shl.scraper.index.GoalieStats> allGoalieStats = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<shl.scraper.index.GoalieStats> allGoalieStatsFixed = null;
    public static final shl.scraper.index.SthsIndexRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getAllPlayerStatsFixed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.GoalieStats> getAllGoalieStatsFixed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.BasePlayerStats> getAllStats(boolean isGoalie) {
        return null;
    }
    
    private SthsIndexRepository() {
        super();
    }
}