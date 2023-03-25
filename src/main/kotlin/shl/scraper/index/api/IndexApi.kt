package shl.scraper.index.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import shl.scraper.index.GoalieStats
import shl.scraper.index.PlayerStats
import shl.scraper.index.TeamStats

interface IndexApi {
    @GET("standings")
    fun getStandings(@Query("league") leagueId: Int, @Query("season") season: Int): Call<List<TeamStats>>

    @GET("leagues/seasons")
    fun getSeasons(@Query("league") leagueId: Int): Call<List<AvailableSeason>>

    @GET("conferences")
    fun getConferences(@Query("league") leagueId: Int, @Query("season") season: Int): Call<List<LeagueConference>>

    @GET("teams")
    fun getTeams(@Query("league") leagueId: Int, @Query("season") season: Int): Call<List<TeamInfoResponse>>

    @GET("teams/stats")
    fun getDetailedTeamStats(@Query("league") leagueId: Int, @Query("season") season: Int? = null): Call<List<DetailedTeamStats>>

    @GET("divisions")
    fun getDivisions(@Query("league") leagueId: Int, @Query("season") season: Int): Call<List<LeagueDivision>>

    @GET("players/stats")
    fun getPlayerStats(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
        @Query("type") type: String // preseason, regular, playoffs
    ): Call<List<PlayerStats>>

    @GET("goalies/stats")
    fun getGoalieStats(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
        @Query("type") type: String
    ): Call<List<GoalieStats>>

    @GET("schedule")
    fun getSchedule(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
        @Query("type") type: String
    ): Call<List<GameInfo>>

    @GET("standings/playoffs")
    fun getPlayoffs(@Query("league") leagueId: Int, @Query("season") season: Int): Call<List<List<PlayoffSeries>>>
}