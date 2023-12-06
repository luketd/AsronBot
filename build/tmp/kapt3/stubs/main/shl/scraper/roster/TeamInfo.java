package shl.scraper.roster;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\u0001\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001ABM\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@\u00a8\u0006B"}, d2 = {"Lshl/scraper/roster/TeamInfo;", "", "rosterId", "", "updateId", "fullName", "", "nameRegex", "Lkotlin/text/Regex;", "teamColor", "logoUrl", "prospectsId", "leagueType", "Lshl/scraper/index/LeagueType;", "(Ljava/lang/String;IIILjava/lang/String;Lkotlin/text/Regex;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lshl/scraper/index/LeagueType;)V", "getFullName", "()Ljava/lang/String;", "getLeagueType", "()Lshl/scraper/index/LeagueType;", "getLogoUrl", "getNameRegex", "()Lkotlin/text/Regex;", "getProspectsId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRosterId", "()I", "getTeamColor", "getUpdateId", "ATLANTA", "BALTIMORE", "BUFFALO", "CHICAGO", "HAMILTON", "MANHATTAN", "NEW_ENGLAND", "TAMPA", "TORONTO", "CALGARY", "EDMONTON", "LOS_ANGELES", "MINNESOTA", "NEW_ORLEANS", "SAN_FRANCISCO", "SEATTLE", "TEXAS", "WINNIPEG", "MONTREAL", "PHILADELPHIA", "YUKON", "ANCHORAGE", "CAROLINA", "COLORADO", "DETROIT", "KELOWNA", "MAINE", "NEVADA", "NEWFOUNDLAND", "QUEBEC", "ST_LOUIS", "VANCOUVER", "REGINA", "GREAT_FALLS", "IIHF_TEAM", "WJC_TEAM", "Companion", "SHLScraper"})
public enum TeamInfo {
    /*public static final*/ ATLANTA /* = new ATLANTA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ BALTIMORE /* = new BALTIMORE(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ BUFFALO /* = new BUFFALO(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ CHICAGO /* = new CHICAGO(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ HAMILTON /* = new HAMILTON(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ MANHATTAN /* = new MANHATTAN(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ NEW_ENGLAND /* = new NEW_ENGLAND(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ TAMPA /* = new TAMPA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ TORONTO /* = new TORONTO(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ CALGARY /* = new CALGARY(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ EDMONTON /* = new EDMONTON(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ LOS_ANGELES /* = new LOS_ANGELES(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ MINNESOTA /* = new MINNESOTA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ NEW_ORLEANS /* = new NEW_ORLEANS(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ SAN_FRANCISCO /* = new SAN_FRANCISCO(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ SEATTLE /* = new SEATTLE(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ TEXAS /* = new TEXAS(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ WINNIPEG /* = new WINNIPEG(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ MONTREAL /* = new MONTREAL(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ PHILADELPHIA /* = new PHILADELPHIA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ YUKON /* = new YUKON(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ ANCHORAGE /* = new ANCHORAGE(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ CAROLINA /* = new CAROLINA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ COLORADO /* = new COLORADO(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ DETROIT /* = new DETROIT(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ KELOWNA /* = new KELOWNA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ MAINE /* = new MAINE(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ NEVADA /* = new NEVADA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ NEWFOUNDLAND /* = new NEWFOUNDLAND(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ QUEBEC /* = new QUEBEC(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ ST_LOUIS /* = new ST_LOUIS(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ VANCOUVER /* = new VANCOUVER(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ REGINA /* = new REGINA(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ GREAT_FALLS /* = new GREAT_FALLS(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ IIHF_TEAM /* = new IIHF_TEAM(0, 0, null, null, null, null, null, null) */,
    /*public static final*/ WJC_TEAM /* = new WJC_TEAM(0, 0, null, null, null, null, null, null) */;
    private final int rosterId = 0;
    private final int updateId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex nameRegex = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String teamColor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logoUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer prospectsId = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.LeagueType leagueType = null;
    public static final shl.scraper.roster.TeamInfo.Companion Companion = null;
    
    public final int getRosterId() {
        return 0;
    }
    
    public final int getUpdateId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.text.Regex getNameRegex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTeamColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getProspectsId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.LeagueType getLeagueType() {
        return null;
    }
    
    TeamInfo(int rosterId, int updateId, java.lang.String fullName, kotlin.text.Regex nameRegex, java.lang.String teamColor, java.lang.String logoUrl, java.lang.Integer prospectsId, shl.scraper.index.LeagueType leagueType) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lshl/scraper/roster/TeamInfo$Companion;", "", "()V", "find", "Lshl/scraper/roster/TeamInfo;", "value", "", "SHLScraper"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.roster.TeamInfo find(@org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}