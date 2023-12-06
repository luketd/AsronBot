package shl.scraper.fantasy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/fantasy/FantasyInteractor;", "", "()V", "getCategoryStandings", "Lshl/scraper/fantasy/FantasyResponse;", "", "Lshl/scraper/fantasy/FantasyCategoryStandings;", "cacheOnly", "", "getGlobal", "Lshl/scraper/fantasy/FantasyTeam;", "getGroup", "Lshl/scraper/fantasy/FantasyGroup;", "number", "", "userName", "", "getRoster", "Lshl/scraper/fantasy/FantasyRoster;", "groupNumber", "teamName", "SHLScraper"})
public final class FantasyInteractor {
    public static final shl.scraper.fantasy.FantasyInteractor INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.fantasy.FantasyResponse<java.util.List<shl.scraper.fantasy.FantasyCategoryStandings>> getCategoryStandings(boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.fantasy.FantasyResponse<java.util.List<shl.scraper.fantasy.FantasyTeam>> getGlobal(boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyResponse<shl.scraper.fantasy.FantasyGroup> getGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyResponse<shl.scraper.fantasy.FantasyGroup> getGroup(int number, boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyResponse<shl.scraper.fantasy.FantasyRoster> getRoster(int groupNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String teamName, boolean cacheOnly) {
        return null;
    }
    
    private FantasyInteractor() {
        super();
    }
}