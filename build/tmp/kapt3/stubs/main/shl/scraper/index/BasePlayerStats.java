package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0012\u0010\u001b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0005\u00a8\u0006\u001d"}, d2 = {"Lshl/scraper/index/BasePlayerStats;", "", "gamesPlayed", "", "getGamesPlayed", "()I", "id", "getId", "league", "getLeague", "name", "", "getName", "()Ljava/lang/String;", "season", "getSeason", "seasonType", "Lshl/scraper/index/SeasonType;", "getSeasonType", "()Lshl/scraper/index/SeasonType;", "setSeasonType", "(Lshl/scraper/index/SeasonType;)V", "sthsId", "getSthsId", "()Ljava/lang/Integer;", "team", "getTeam", "teamId", "getTeamId", "SHLScraper"})
public abstract interface BasePlayerStats {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTeam();
    
    public abstract int getTeamId();
    
    public abstract int getGamesPlayed();
    
    public abstract int getSeason();
    
    public abstract int getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getSthsId();
    
    public abstract int getLeague();
    
    @org.jetbrains.annotations.Nullable()
    public abstract shl.scraper.index.SeasonType getSeasonType();
    
    public abstract void setSeasonType(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType p0);
}