package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H\'\u00a2\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J.\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\u001e"}, d2 = {"Lshl/scraper/index/api/IndexApi;", "", "getConferences", "Lretrofit2/Call;", "", "Lshl/scraper/index/api/LeagueConference;", "leagueId", "", "season", "getDetailedTeamStats", "Lshl/scraper/index/api/DetailedTeamStats;", "(ILjava/lang/Integer;)Lretrofit2/Call;", "getDivisions", "Lshl/scraper/index/api/LeagueDivision;", "getGoalieStats", "Lshl/scraper/index/GoalieStats;", "type", "", "getPlayerStats", "Lshl/scraper/index/PlayerStats;", "getPlayoffs", "Lshl/scraper/index/api/PlayoffSeries;", "getSchedule", "Lshl/scraper/index/api/GameInfo;", "getSeasons", "Lshl/scraper/index/api/AvailableSeason;", "getStandings", "Lshl/scraper/index/TeamStats;", "getTeams", "Lshl/scraper/index/api/TeamInfoResponse;", "SHLScraper"})
public abstract interface IndexApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "standings")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.TeamStats>> getStandings(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "leagues/seasons")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.AvailableSeason>> getSeasons(@retrofit2.http.Query(value = "league")
    int leagueId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "conferences")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.LeagueConference>> getConferences(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "teams")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.TeamInfoResponse>> getTeams(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "teams/stats")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.DetailedTeamStats>> getDetailedTeamStats(@retrofit2.http.Query(value = "league")
    int leagueId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "season")
    java.lang.Integer season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "divisions")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.LeagueDivision>> getDivisions(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "players/stats")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.PlayerStats>> getPlayerStats(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "goalies/stats")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.GoalieStats>> getGoalieStats(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "schedule")
    public abstract retrofit2.Call<java.util.List<shl.scraper.index.api.GameInfo>> getSchedule(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "standings/playoffs")
    public abstract retrofit2.Call<java.util.List<java.util.List<shl.scraper.index.api.PlayoffSeries>>> getPlayoffs(@retrofit2.http.Query(value = "league")
    int leagueId, @retrofit2.http.Query(value = "season")
    int season);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}