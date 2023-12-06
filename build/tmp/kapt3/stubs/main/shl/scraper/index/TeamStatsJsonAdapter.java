package shl.scraper.index;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lshl/scraper/index/TeamStatsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lshl/scraper/index/TeamStats;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "nullableDetailedTeamStatsAdapter", "Lshl/scraper/index/api/DetailedTeamStats;", "nullableListOfPlayerStatsAdapter", "", "Lshl/scraper/index/PlayerStats;", "nullableTeamInfoAdapter", "Lshl/scraper/roster/TeamInfo;", "nullableTeamInfoResponseAdapter", "Lshl/scraper/index/api/TeamInfoResponse;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "recordAdapter", "Lshl/scraper/index/TeamStats$Record;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "SHLScraper"})
public final class TeamStatsJsonAdapter extends com.squareup.moshi.JsonAdapter<shl.scraper.index.TeamStats> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> stringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<shl.scraper.index.TeamStats.Record> recordAdapter = null;
    private final com.squareup.moshi.JsonAdapter<shl.scraper.index.api.DetailedTeamStats> nullableDetailedTeamStatsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<shl.scraper.index.PlayerStats>> nullableListOfPlayerStatsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<shl.scraper.roster.TeamInfo> nullableTeamInfoAdapter = null;
    private final com.squareup.moshi.JsonAdapter<shl.scraper.index.api.TeamInfoResponse> nullableTeamInfoResponseAdapter = null;
    private volatile java.lang.reflect.Constructor<shl.scraper.index.TeamStats> constructorRef;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public shl.scraper.index.TeamStats fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.TeamStats value) {
    }
    
    public TeamStatsJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}