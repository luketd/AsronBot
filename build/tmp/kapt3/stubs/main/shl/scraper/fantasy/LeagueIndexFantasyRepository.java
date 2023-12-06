package shl.scraper.fantasy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u001a"}, d2 = {"Lshl/scraper/fantasy/LeagueIndexFantasyRepository;", "", "()V", "getGlobal", "", "Lshl/scraper/fantasy/FantasyTeam;", "cacheOnly", "", "getGoalies", "Lshl/scraper/fantasy/FantasyPlayer;", "season", "", "(Ljava/lang/Integer;)Ljava/util/List;", "getGroup", "Lshl/scraper/fantasy/FantasyGroup;", "number", "getRoster", "Lshl/scraper/fantasy/FantasyRoster;", "groupNumber", "teamName", "", "matchFantasyPlayer", "player", "matchSwap", "Lshl/scraper/fantasy/FantasySwap;", "swap", "SHLScraper"})
public final class LeagueIndexFantasyRepository {
    public static final shl.scraper.fantasy.LeagueIndexFantasyRepository INSTANCE = null;
    
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
    
    private final shl.scraper.fantasy.FantasySwap matchSwap(shl.scraper.fantasy.FantasySwap swap, boolean cacheOnly) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.fantasy.FantasyPlayer> getGoalies(@org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    private final shl.scraper.fantasy.FantasyPlayer matchFantasyPlayer(shl.scraper.fantasy.FantasyPlayer player, boolean cacheOnly) {
        return null;
    }
    
    private LeagueIndexFantasyRepository() {
        super();
    }
}