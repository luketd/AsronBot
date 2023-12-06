package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lshl/scraper/index/api/LeagueDivision;", "", "id", "", "league", "conference", "name", "", "season", "(IIILjava/lang/String;I)V", "getConference", "()I", "getId", "getLeague", "getName", "()Ljava/lang/String;", "getSeason", "teams", "", "Lshl/scraper/index/TeamStats;", "getTeams", "()Ljava/util/List;", "setTeams", "(Ljava/util/List;)V", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class LeagueDivision {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<shl.scraper.index.TeamStats> teams;
    private final int id = 0;
    private final int league = 0;
    private final int conference = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int season = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.TeamStats> getTeams() {
        return null;
    }
    
    public final void setTeams(@org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.TeamStats> p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getLeague() {
        return 0;
    }
    
    public final int getConference() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public LeagueDivision(int id, int league, int conference, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int season) {
        super();
    }
}