package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J=\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0019J=\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0002\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ?\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010#J)\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010&J=\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J7\u0010$\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*JG\u0010+\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010,\u001a\u00020\u001e\u00a2\u0006\u0002\u0010-J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ-\u0010/\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u00100JI\u00101\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u00102J)\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\r0\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J-\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u00108\u001a\u00020\u000b\u00a2\u0006\u0002\u00109J\u001d\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010:J#\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J-\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010>J-\u0010?\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010>J%\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\r2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010B\u001a\u0004\u0018\u00010<2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010C\u00a8\u0006D"}, d2 = {"Lshl/scraper/index/LeagueIndexRepository;", "", "()V", "getActivePlayerIds", "", "", "leagueType", "Lshl/scraper/index/LeagueType;", "getCareerStats", "Lshl/scraper/index/CareerStats;", "name", "", "getDetailedStats", "", "Lshl/scraper/index/api/DetailedTeamStats;", "season", "(Lshl/scraper/index/LeagueType;Ljava/lang/Integer;)Ljava/util/List;", "getDivisionStandings", "Lshl/scraper/index/api/LeagueDivision;", "getGoalieStats", "Lkotlin/Pair;", "Lshl/scraper/index/GoalieStats;", "seasonType", "Lshl/scraper/index/SeasonType;", "(Lshl/scraper/index/LeagueType;Ljava/lang/String;Ljava/lang/Integer;Lshl/scraper/index/SeasonType;)Lkotlin/Pair;", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;)Ljava/util/List;", "getGoalieStatsForLeaders", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "isRookies", "", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;Lshl/scraper/roster/TeamInfo;Z)Ljava/util/List;", "getGoalieStatsForRecords", "getGoalieStatsSince", "draftClass", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;Ljava/lang/Integer;Lshl/scraper/roster/TeamInfo;)Ljava/util/List;", "getPlayerStats", "Lshl/scraper/index/BasePlayerStats;", "(Ljava/lang/String;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;)Lshl/scraper/index/BasePlayerStats;", "Lshl/scraper/index/PlayerStats;", "positionFilter", "Lshl/scraper/index/PositionFilter;", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;Lshl/scraper/index/PositionFilter;)Ljava/util/List;", "getPlayerStatsForLeaders", "onlyRookies", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;Lshl/scraper/index/PositionFilter;Lshl/scraper/roster/TeamInfo;Z)Ljava/util/List;", "getPlayerStatsForRecords", "getPlayerStatsForTeam", "(Lshl/scraper/roster/TeamInfo;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;)Ljava/util/List;", "getPlayerStatsSince", "(Lshl/scraper/index/LeagueType;Lshl/scraper/index/SeasonType;Ljava/lang/Integer;Lshl/scraper/index/PositionFilter;Ljava/lang/Integer;Lshl/scraper/roster/TeamInfo;)Ljava/util/List;", "getPlayoffs", "Lshl/scraper/index/api/PlayoffSeries;", "getSchedule", "Lshl/scraper/index/TeamSchedule;", "teamId", "teamName", "(ILshl/scraper/index/LeagueType;Ljava/lang/Integer;Ljava/lang/String;)Lshl/scraper/index/TeamSchedule;", "(Lshl/scraper/roster/TeamInfo;Ljava/lang/Integer;)Lshl/scraper/index/TeamSchedule;", "getStandings", "Lshl/scraper/index/TeamStats;", "getSthsOrFhmGoalieStats", "(Lshl/scraper/index/LeagueType;Ljava/lang/Integer;Lshl/scraper/index/SeasonType;)Ljava/util/List;", "getSthsOrFhmSkaterStats", "getTeamInfos", "Lshl/scraper/index/api/TeamInfoResponse;", "getTeamStats", "(Lshl/scraper/roster/TeamInfo;Ljava/lang/Integer;)Lshl/scraper/index/TeamStats;", "SHLScraper"})
public final class LeagueIndexRepository {
    public static final shl.scraper.index.LeagueIndexRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.api.DetailedTeamStats> getDetailedStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.TeamStats getTeamStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.TeamStats> getStandings(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.api.LeagueDivision> getDivisionStandings(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamSchedule getSchedule(@org.jetbrains.annotations.NotNull()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.TeamSchedule getSchedule(int teamId, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.NotNull()
    java.lang.String teamName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.api.TeamInfoResponse> getTeamInfos(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<shl.scraper.index.api.PlayoffSeries>> getPlayoffs(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.BasePlayerStats getPlayerStats(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getPlayerStatsForTeam(@org.jetbrains.annotations.NotNull()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getPlayerStatsSince(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.PositionFilter positionFilter, @org.jetbrains.annotations.Nullable()
    java.lang.Integer draftClass, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getActivePlayerIds(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.GoalieStats> getGoalieStatsSince(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    java.lang.Integer draftClass, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getPlayerStatsForRecords(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getPlayerStatsForLeaders(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.PositionFilter positionFilter, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo, boolean onlyRookies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.PlayerStats> getPlayerStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.PositionFilter positionFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<shl.scraper.index.PlayerStats, java.lang.Integer> getPlayerStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    private final java.util.List<shl.scraper.index.PlayerStats> getSthsOrFhmSkaterStats(shl.scraper.index.LeagueType leagueType, java.lang.Integer season, shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    private final java.util.List<shl.scraper.index.GoalieStats> getSthsOrFhmGoalieStats(shl.scraper.index.LeagueType leagueType, java.lang.Integer season, shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.GoalieStats> getGoalieStatsForRecords(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.GoalieStats> getGoalieStatsForLeaders(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo, boolean isRookies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.index.GoalieStats> getGoalieStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<shl.scraper.index.GoalieStats, java.lang.Integer> getGoalieStats(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.CareerStats getCareerStats(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    private LeagueIndexRepository() {
        super();
    }
}