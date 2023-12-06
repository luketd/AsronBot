package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0087\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0012J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u000fH\u00c6\u0003J\t\u0010w\u001a\u00020\u000fH\u00c6\u0003J\t\u0010x\u001a\u00020\u000fH\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\u008c\u0001\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u00c6\u0001J\u0016\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u001bR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0011\u0010)\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0017R\u0011\u00100\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0017R\u001a\u00107\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u001bR\u0011\u0010:\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0017R\u001a\u0010>\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0017R\u0013\u0010F\u001a\u0004\u0018\u00010\u001d8F\u00a2\u0006\u0006\u001a\u0004\bG\u0010\u001fR\u001a\u0010H\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u0010\u001bR\u001a\u0010K\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0017\"\u0004\bM\u0010\u001bR\u001a\u0010N\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0017\"\u0004\bP\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0017R\u001a\u0010R\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0017\"\u0004\bT\u0010\u001bR\"\u0010U\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010VX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0014R\u001a\u0010]\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0017\"\u0004\b_\u0010\u001bR\u001a\u0010`\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0017\"\u0004\bb\u0010\u001bR\u001a\u0010c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0017\"\u0004\be\u0010\u001bR\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR(\u0010n\u001a\u0004\u0018\u00010m2\b\u0010l\u001a\u0004\u0018\u00010m@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010\u0017\u00a8\u0006\u0088\u0001"}, d2 = {"Lshl/scraper/index/TeamStats;", "", "id", "", "name", "", "games", "wins", "losses", "otw", "otl", "points", "goalsFor", "goalsAgainst", "home", "Lshl/scraper/index/TeamStats$Record;", "away", "shootout", "(ILjava/lang/String;IIIIIIIILshl/scraper/index/TeamStats$Record;Lshl/scraper/index/TeamStats$Record;Lshl/scraper/index/TeamStats$Record;)V", "getAway", "()Lshl/scraper/index/TeamStats$Record;", "conference", "getConference", "()I", "conferencePosition", "getConferencePosition", "setConferencePosition", "(I)V", "corsi", "", "getCorsi", "()Ljava/lang/Double;", "corsiRank", "getCorsiRank", "setCorsiRank", "detailedStats", "Lshl/scraper/index/api/DetailedTeamStats;", "getDetailedStats", "()Lshl/scraper/index/api/DetailedTeamStats;", "setDetailedStats", "(Lshl/scraper/index/api/DetailedTeamStats;)V", "division", "getDivision", "divisionPosition", "getDivisionPosition", "setDivisionPosition", "getGames", "getGoalsAgainst", "goalsAgainstPerGame", "getGoalsAgainstPerGame", "()D", "goalsAgainstRank", "getGoalsAgainstRank", "setGoalsAgainstRank", "getGoalsFor", "goalsForRank", "getGoalsForRank", "setGoalsForRank", "goalsPerGame", "getGoalsPerGame", "getHome", "getId", "leaguePosition", "getLeaguePosition", "setLeaguePosition", "getLosses", "getName", "()Ljava/lang/String;", "getOtl", "getOtw", "pdo", "getPdo", "pdoRank", "getPdoRank", "setPdoRank", "pimsRank", "getPimsRank", "setPimsRank", "pkRank", "getPkRank", "setPkRank", "getPoints", "ppRank", "getPpRank", "setPpRank", "regularSeasonPlayerStats", "", "Lshl/scraper/index/PlayerStats;", "getRegularSeasonPlayerStats", "()Ljava/util/List;", "setRegularSeasonPlayerStats", "(Ljava/util/List;)V", "getShootout", "shotDiffRank", "getShotDiffRank", "setShotDiffRank", "shotsAgainstRank", "getShotsAgainstRank", "setShotsAgainstRank", "shotsForRank", "getShotsForRank", "setShotsForRank", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "getTeamInfo", "()Lshl/scraper/roster/TeamInfo;", "setTeamInfo", "(Lshl/scraper/roster/TeamInfo;)V", "value", "Lshl/scraper/index/api/TeamInfoResponse;", "teamInfoResponse", "getTeamInfoResponse", "()Lshl/scraper/index/api/TeamInfoResponse;", "setTeamInfoResponse", "(Lshl/scraper/index/api/TeamInfoResponse;)V", "getWins", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Record", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TeamStats {
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.roster.TeamInfo teamInfo;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.api.DetailedTeamStats detailedStats;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.api.TeamInfoResponse teamInfoResponse;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<shl.scraper.index.PlayerStats> regularSeasonPlayerStats;
    private int conferencePosition = 0;
    private int leaguePosition = 0;
    private int divisionPosition = 0;
    private int goalsForRank = 0;
    private int goalsAgainstRank = 0;
    private int pdoRank = 0;
    private int corsiRank = 0;
    private int shotsForRank = 0;
    private int shotsAgainstRank = 0;
    private int shotDiffRank = 0;
    private int pimsRank = 0;
    private int ppRank = 0;
    private int pkRank = 0;
    private final double goalsPerGame = 0.0;
    private final double goalsAgainstPerGame = 0.0;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int games = 0;
    private final int wins = 0;
    private final int losses = 0;
    private final int otw = 0;
    private final int otl = 0;
    private final int points = 0;
    private final int goalsFor = 0;
    private final int goalsAgainst = 0;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.TeamStats.Record home = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.TeamStats.Record away = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.TeamStats.Record shootout = null;
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.roster.TeamInfo getTeamInfo() {
        return null;
    }
    
    public final void setTeamInfo(@org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.api.DetailedTeamStats getDetailedStats() {
        return null;
    }
    
    public final void setDetailedStats(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.api.DetailedTeamStats p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.api.TeamInfoResponse getTeamInfoResponse() {
        return null;
    }
    
    public final void setTeamInfoResponse(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.api.TeamInfoResponse value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<shl.scraper.index.PlayerStats> getRegularSeasonPlayerStats() {
        return null;
    }
    
    public final void setRegularSeasonPlayerStats(@org.jetbrains.annotations.Nullable()
    java.util.List<shl.scraper.index.PlayerStats> p0) {
    }
    
    public final int getConference() {
        return 0;
    }
    
    public final int getDivision() {
        return 0;
    }
    
    public final int getConferencePosition() {
        return 0;
    }
    
    public final void setConferencePosition(int p0) {
    }
    
    public final int getLeaguePosition() {
        return 0;
    }
    
    public final void setLeaguePosition(int p0) {
    }
    
    public final int getDivisionPosition() {
        return 0;
    }
    
    public final void setDivisionPosition(int p0) {
    }
    
    public final int getGoalsForRank() {
        return 0;
    }
    
    public final void setGoalsForRank(int p0) {
    }
    
    public final int getGoalsAgainstRank() {
        return 0;
    }
    
    public final void setGoalsAgainstRank(int p0) {
    }
    
    public final int getPdoRank() {
        return 0;
    }
    
    public final void setPdoRank(int p0) {
    }
    
    public final int getCorsiRank() {
        return 0;
    }
    
    public final void setCorsiRank(int p0) {
    }
    
    public final int getShotsForRank() {
        return 0;
    }
    
    public final void setShotsForRank(int p0) {
    }
    
    public final int getShotsAgainstRank() {
        return 0;
    }
    
    public final void setShotsAgainstRank(int p0) {
    }
    
    public final int getShotDiffRank() {
        return 0;
    }
    
    public final void setShotDiffRank(int p0) {
    }
    
    public final int getPimsRank() {
        return 0;
    }
    
    public final void setPimsRank(int p0) {
    }
    
    public final int getPpRank() {
        return 0;
    }
    
    public final void setPpRank(int p0) {
    }
    
    public final int getPkRank() {
        return 0;
    }
    
    public final void setPkRank(int p0) {
    }
    
    public final double getGoalsPerGame() {
        return 0.0;
    }
    
    public final double getGoalsAgainstPerGame() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPdo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCorsi() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getGames() {
        return 0;
    }
    
    public final int getWins() {
        return 0;
    }
    
    public final int getLosses() {
        return 0;
    }
    
    public final int getOtw() {
        return 0;
    }
    
    public final int getOtl() {
        return 0;
    }
    
    public final int getPoints() {
        return 0;
    }
    
    public final int getGoalsFor() {
        return 0;
    }
    
    public final int getGoalsAgainst() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record getHome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record getAway() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record getShootout() {
        return null;
    }
    
    public TeamStats(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @com.squareup.moshi.Json(name = "gp")
    int games, int wins, int losses, @com.squareup.moshi.Json(name = "OTW")
    int otw, @com.squareup.moshi.Json(name = "OTL")
    int otl, int points, int goalsFor, int goalsAgainst, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record home, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record away, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record shootout) {
        super();
    }
    
    public TeamStats() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats.Record component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamStats copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @com.squareup.moshi.Json(name = "gp")
    int games, int wins, int losses, @com.squareup.moshi.Json(name = "OTW")
    int otw, @com.squareup.moshi.Json(name = "OTL")
    int otl, int points, int goalsFor, int goalsAgainst, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record home, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record away, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamStats.Record shootout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lshl/scraper/index/TeamStats$Record;", "", "wins", "", "losses", "otl", "(III)V", "getLosses", "()I", "getOtl", "getWins", "SHLScraper"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Record {
        private final int wins = 0;
        private final int losses = 0;
        private final int otl = 0;
        
        public final int getWins() {
            return 0;
        }
        
        public final int getLosses() {
            return 0;
        }
        
        public final int getOtl() {
            return 0;
        }
        
        public Record(int wins, int losses, @com.squareup.moshi.Json(name = "OTL")
        int otl) {
            super();
        }
        
        public Record() {
            super();
        }
    }
}