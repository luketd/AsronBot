package shl.scraper.roster;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0013\u001a\u00020\u0005J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\tJ\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0005R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lshl/scraper/roster/RosterRepository;", "", "()V", "playersByDraftClass", "", "", "", "Lshl/scraper/roster/RosterPlayer;", "playersByPlayerName", "", "playersByUsername", "findGms", "", "Lshl/scraper/roster/TeamGm;", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "findRosterPlayer", "name", "getDraftClass", "season", "getDraftClassTpeRanking", "getGoalieBuild", "Lshl/scraper/roster/GoalieBuild;", "pageUrl", "getPlayerBuild", "Lshl/scraper/roster/PlayerBuild;", "getRoster", "Lshl/scraper/roster/Roster;", "includeProspects", "", "forceRefresh", "parseRoster", "forumId", "updateMaps", "", "retryCount", "SHLScraper"})
public final class RosterRepository {
    private static final java.util.Map<java.lang.String, shl.scraper.roster.RosterPlayer> playersByUsername = null;
    private static final java.util.Map<java.lang.String, shl.scraper.roster.RosterPlayer> playersByPlayerName = null;
    private static final java.util.Map<java.lang.Integer, java.util.List<shl.scraper.roster.RosterPlayer>> playersByDraftClass = null;
    public static final shl.scraper.roster.RosterRepository INSTANCE = null;
    
    public final synchronized void updateMaps(int retryCount) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final synchronized shl.scraper.roster.RosterPlayer findRosterPlayer(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.util.List<shl.scraper.roster.RosterPlayer> getDraftClassTpeRanking(int season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.util.List<shl.scraper.roster.RosterPlayer> getDraftClass(int season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.roster.Roster getRoster(@org.jetbrains.annotations.NotNull()
    shl.scraper.roster.TeamInfo teamInfo, boolean includeProspects, boolean forceRefresh) {
        return null;
    }
    
    private final java.util.List<shl.scraper.roster.RosterPlayer> parseRoster(shl.scraper.roster.TeamInfo teamInfo, int forumId, boolean forceRefresh) {
        return null;
    }
    
    private final java.util.List<shl.scraper.roster.TeamGm> findGms(shl.scraper.roster.TeamInfo teamInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.roster.GoalieBuild getGoalieBuild(@org.jetbrains.annotations.NotNull()
    java.lang.String pageUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.roster.PlayerBuild getPlayerBuild(@org.jetbrains.annotations.NotNull()
    java.lang.String pageUrl) {
        return null;
    }
    
    private RosterRepository() {
        super();
    }
}