package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lshl/scraper/index/api/AvailableSeason;", "", "leagueId", "", "season", "(II)V", "getLeagueId", "()I", "getSeason", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class AvailableSeason {
    private final int leagueId = 0;
    private final int season = 0;
    
    public final int getLeagueId() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public AvailableSeason(@com.squareup.moshi.Json(name = "id")
    int leagueId, int season) {
        super();
    }
}