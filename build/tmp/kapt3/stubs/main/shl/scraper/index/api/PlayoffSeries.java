package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lshl/scraper/index/api/PlayoffSeries;", "", "league", "", "season", "team1", "Lshl/scraper/index/api/PlayoffSeries$Team;", "team2", "(IILshl/scraper/index/api/PlayoffSeries$Team;Lshl/scraper/index/api/PlayoffSeries$Team;)V", "getLeague", "()I", "getSeason", "getTeam1", "()Lshl/scraper/index/api/PlayoffSeries$Team;", "getTeam2", "Team", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PlayoffSeries {
    private final int league = 0;
    private final int season = 0;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.api.PlayoffSeries.Team team1 = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.api.PlayoffSeries.Team team2 = null;
    
    public final int getLeague() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.api.PlayoffSeries.Team getTeam1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.api.PlayoffSeries.Team getTeam2() {
        return null;
    }
    
    public PlayoffSeries(int league, int season, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.api.PlayoffSeries.Team team1, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.api.PlayoffSeries.Team team2) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lshl/scraper/index/api/PlayoffSeries$Team;", "", "id", "", "wins", "name", "", "nickname", "abbr", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbbr", "()Ljava/lang/String;", "fullName", "getFullName", "getId", "()I", "getName", "getNickname", "teamInfo", "Lshl/scraper/index/api/TeamInfoResponse;", "getTeamInfo", "()Lshl/scraper/index/api/TeamInfoResponse;", "setTeamInfo", "(Lshl/scraper/index/api/TeamInfoResponse;)V", "getWins", "SHLScraper"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Team {
        @org.jetbrains.annotations.Nullable()
        private shl.scraper.index.api.TeamInfoResponse teamInfo;
        private final int id = 0;
        private final int wins = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String nickname = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String abbr = null;
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.index.api.TeamInfoResponse getTeamInfo() {
            return null;
        }
        
        public final void setTeamInfo(@org.jetbrains.annotations.Nullable()
        shl.scraper.index.api.TeamInfoResponse p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFullName() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int getWins() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNickname() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAbbr() {
            return null;
        }
        
        public Team(int id, int wins, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String nickname, @org.jetbrains.annotations.NotNull()
        java.lang.String abbr) {
            super();
        }
    }
}