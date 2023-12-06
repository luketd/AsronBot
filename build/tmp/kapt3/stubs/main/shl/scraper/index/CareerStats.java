package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lshl/scraper/index/CareerStats;", "", "name", "", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "position", "isGoalie", "", "seasons", "", "Lshl/scraper/index/CareerStats$Season;", "(Ljava/lang/String;Lshl/scraper/roster/TeamInfo;Ljava/lang/String;ZLjava/util/List;)V", "()Z", "getName", "()Ljava/lang/String;", "getPosition", "getSeasons", "()Ljava/util/List;", "getTeamInfo", "()Lshl/scraper/roster/TeamInfo;", "Season", "SHLScraper"})
public final class CareerStats {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final shl.scraper.roster.TeamInfo teamInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String position = null;
    private final boolean isGoalie = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<shl.scraper.index.CareerStats.Season> seasons = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.roster.TeamInfo getTeamInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosition() {
        return null;
    }
    
    public final boolean isGoalie() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.CareerStats.Season> getSeasons() {
        return null;
    }
    
    public CareerStats(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String position, boolean isGoalie, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.CareerStats.Season> seasons) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lshl/scraper/index/CareerStats$Season;", "", "leagueType", "Lshl/scraper/index/LeagueType;", "season", "", "regular", "Lshl/scraper/index/BasePlayerStats;", "playoffs", "(Lshl/scraper/index/LeagueType;ILshl/scraper/index/BasePlayerStats;Lshl/scraper/index/BasePlayerStats;)V", "getLeagueType", "()Lshl/scraper/index/LeagueType;", "getPlayoffs", "()Lshl/scraper/index/BasePlayerStats;", "getRegular", "getSeason", "()I", "SHLScraper"})
    public static final class Season {
        @org.jetbrains.annotations.NotNull()
        private final shl.scraper.index.LeagueType leagueType = null;
        private final int season = 0;
        @org.jetbrains.annotations.NotNull()
        private final shl.scraper.index.BasePlayerStats regular = null;
        @org.jetbrains.annotations.Nullable()
        private final shl.scraper.index.BasePlayerStats playoffs = null;
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.LeagueType getLeagueType() {
            return null;
        }
        
        public final int getSeason() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.BasePlayerStats getRegular() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.index.BasePlayerStats getPlayoffs() {
            return null;
        }
        
        public Season(@org.jetbrains.annotations.NotNull()
        shl.scraper.index.LeagueType leagueType, int season, @org.jetbrains.annotations.NotNull()
        shl.scraper.index.BasePlayerStats regular, @org.jetbrains.annotations.Nullable()
        shl.scraper.index.BasePlayerStats playoffs) {
            super();
        }
    }
}