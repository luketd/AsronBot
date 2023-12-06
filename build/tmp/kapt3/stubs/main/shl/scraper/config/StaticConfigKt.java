package shl.scraper.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00010\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0011\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u001b\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0011\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"API_URL", "", "BOT_CO_OWNER_IDS", "", "getBOT_CO_OWNER_IDS", "()Ljava/util/List;", "BOT_ID", "BOT_OWNER_IDS", "getBOT_OWNER_IDS", "EMOJI_SERVER_IDS", "kotlin.jvm.PlatformType", "getEMOJI_SERVER_IDS", "FANTASY_CATEGORIES_RANGE", "FANTASY_GLOBAL_RANGE", "FANTASY_INDEX_RANGE", "FANTASY_NO_SWAP_NAME", "FANTASY_TEAM_RANGE_FORMAT", "FORUM_THREAD_LIST_REFRESH", "", "getFORUM_THREAD_LIST_REFRESH", "()J", "FORUM_THREAD_POST_REFRESH", "getFORUM_THREAD_POST_REFRESH", "GOOGLE_SHEETS_REFRESH", "getGOOGLE_SHEETS_REFRESH", "GOOGLE_SHEET_URL_FORMAT", "HAM_SERVER_ID", "INDEX_STATS_REFRESH", "getINDEX_STATS_REFRESH", "ROSTER_REFRESH", "getROSTER_REFRESH", "SHLScraper"})
public final class StaticConfigKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BOT_ID = "623014007221256192";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HAM_SERVER_ID = "207189819367882752";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> EMOJI_SERVER_IDS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> BOT_OWNER_IDS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> BOT_CO_OWNER_IDS = null;
    private static final long INDEX_STATS_REFRESH = 0L;
    private static final long FORUM_THREAD_LIST_REFRESH = 0L;
    private static final long FORUM_THREAD_POST_REFRESH = 0L;
    private static final long GOOGLE_SHEETS_REFRESH = 0L;
    private static final long ROSTER_REFRESH = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GOOGLE_SHEET_URL_FORMAT = "https://docs.google.com/spreadsheets/d/%s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FANTASY_INDEX_RANGE = "Index!A1:Q164";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FANTASY_GLOBAL_RANGE = "Global!D4:E323";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FANTASY_CATEGORIES_RANGE = "Categories!C3:Z324";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FANTASY_TEAM_RANGE_FORMAT = "%d!C17:V167";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FANTASY_NO_SWAP_NAME = "None";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_URL = "https://index.simulationhockey.com/api/v1/";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getEMOJI_SERVER_IDS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getBOT_OWNER_IDS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getBOT_CO_OWNER_IDS() {
        return null;
    }
    
    public static final long getINDEX_STATS_REFRESH() {
        return 0L;
    }
    
    public static final long getFORUM_THREAD_LIST_REFRESH() {
        return 0L;
    }
    
    public static final long getFORUM_THREAD_POST_REFRESH() {
        return 0L;
    }
    
    public static final long getGOOGLE_SHEETS_REFRESH() {
        return 0L;
    }
    
    public static final long getROSTER_REFRESH() {
        return 0L;
    }
}