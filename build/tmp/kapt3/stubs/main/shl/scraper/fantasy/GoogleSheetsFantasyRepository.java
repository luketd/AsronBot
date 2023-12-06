package shl.scraper.fantasy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006J$\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b\u00a8\u0006\u001d"}, d2 = {"Lshl/scraper/fantasy/GoogleSheetsFantasyRepository;", "", "()V", "fetchRows", "", "sheetRange", "", "cacheOnly", "", "getCategoryStandings", "Lshl/scraper/fantasy/FantasyCategoryStandings;", "getGlobal", "Lshl/scraper/fantasy/FantasyTeam;", "getGroup", "Lshl/scraper/fantasy/FantasyGroup;", "number", "", "userName", "getRoster", "Lshl/scraper/fantasy/FantasyRoster;", "groupNumber", "teamName", "getRosters", "parseRoster", "rows", "rowOffset", "updateCache", "", "force", "SHLScraper"})
public final class GoogleSheetsFantasyRepository {
    public static final shl.scraper.fantasy.GoogleSheetsFantasyRepository INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyGroup getGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyGroup getGroup(int number, boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.fantasy.FantasyTeam> getGlobal(boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.fantasy.FantasyRoster getRoster(int groupNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String teamName, boolean cacheOnly) {
        return null;
    }
    
    private final java.util.List<shl.scraper.fantasy.FantasyRoster> getRosters(int groupNumber, boolean cacheOnly) {
        return null;
    }
    
    private final shl.scraper.fantasy.FantasyRoster parseRoster(java.util.List<? extends java.lang.Object> rows, int rowOffset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.fantasy.FantasyCategoryStandings> getCategoryStandings(boolean cacheOnly) {
        return null;
    }
    
    public final void updateCache(boolean force) {
    }
    
    private final java.util.List<java.lang.Object> fetchRows(java.lang.String sheetRange, boolean cacheOnly) {
        return null;
    }
    
    private GoogleSheetsFantasyRepository() {
        super();
    }
}