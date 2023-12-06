package shl.scraper.index.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001dR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010(\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010+\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u00102\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u00107\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010!R\u0011\u0010=\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010!R\u0011\u0010@\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010!R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010!R\u0011\u0010D\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010$R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010!\u00a8\u0006G"}, d2 = {"Lshl/scraper/index/api/DetailedTeamStats;", "", "id", "", "season", "league", "conference", "division", "name", "", "abbreviation", "gamesPlayed", "goalsFor", "goalsAgainst", "shotsFor", "shotsAgainst", "faceoffPct", "", "shotsBlocked", "hits", "takeaways", "giveaways", "penaltyMinutesPerGame", "ppOpportunities", "ppGoalsFor", "ppGoalsAgainst", "shOpportunities", "shGoalsFor", "shGoalsAgainst", "(IIIIILjava/lang/String;Ljava/lang/String;IIIIIDIIIIDIIIIII)V", "getAbbreviation", "()Ljava/lang/String;", "getConference", "()I", "getDivision", "getFaceoffPct", "()D", "getGamesPlayed", "getGiveaways", "getGoalsAgainst", "goalsAgainstPerGame", "getGoalsAgainstPerGame", "getGoalsFor", "goalsPerGame", "getGoalsPerGame", "getHits", "getId", "getLeague", "getName", "getPenaltyMinutesPerGame", "pkPercentage", "getPkPercentage", "getPpGoalsAgainst", "getPpGoalsFor", "getPpOpportunities", "ppPercentage", "getPpPercentage", "getSeason", "getShGoalsAgainst", "getShGoalsFor", "getShOpportunities", "shotDiff", "getShotDiff", "getShotsAgainst", "shotsAgainstPerGame", "getShotsAgainstPerGame", "getShotsBlocked", "getShotsFor", "shotsForPerGame", "getShotsForPerGame", "getTakeaways", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class DetailedTeamStats {
    private final double shotsForPerGame = 0.0;
    private final double shotsAgainstPerGame = 0.0;
    private final double shotDiff = 0.0;
    private final double ppPercentage = 0.0;
    private final double pkPercentage = 0.0;
    private final double goalsPerGame = 0.0;
    private final double goalsAgainstPerGame = 0.0;
    private final int id = 0;
    private final int season = 0;
    private final int league = 0;
    private final int conference = 0;
    private final int division = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String abbreviation = null;
    private final int gamesPlayed = 0;
    private final int goalsFor = 0;
    private final int goalsAgainst = 0;
    private final int shotsFor = 0;
    private final int shotsAgainst = 0;
    private final double faceoffPct = 0.0;
    private final int shotsBlocked = 0;
    private final int hits = 0;
    private final int takeaways = 0;
    private final int giveaways = 0;
    private final double penaltyMinutesPerGame = 0.0;
    private final int ppOpportunities = 0;
    private final int ppGoalsFor = 0;
    private final int ppGoalsAgainst = 0;
    private final int shOpportunities = 0;
    private final int shGoalsFor = 0;
    private final int shGoalsAgainst = 0;
    
    public final double getShotsForPerGame() {
        return 0.0;
    }
    
    public final double getShotsAgainstPerGame() {
        return 0.0;
    }
    
    public final double getShotDiff() {
        return 0.0;
    }
    
    public final double getPpPercentage() {
        return 0.0;
    }
    
    public final double getPkPercentage() {
        return 0.0;
    }
    
    public final double getGoalsPerGame() {
        return 0.0;
    }
    
    public final double getGoalsAgainstPerGame() {
        return 0.0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final int getLeague() {
        return 0;
    }
    
    public final int getConference() {
        return 0;
    }
    
    public final int getDivision() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbbreviation() {
        return null;
    }
    
    public final int getGamesPlayed() {
        return 0;
    }
    
    public final int getGoalsFor() {
        return 0;
    }
    
    public final int getGoalsAgainst() {
        return 0;
    }
    
    public final int getShotsFor() {
        return 0;
    }
    
    public final int getShotsAgainst() {
        return 0;
    }
    
    public final double getFaceoffPct() {
        return 0.0;
    }
    
    public final int getShotsBlocked() {
        return 0;
    }
    
    public final int getHits() {
        return 0;
    }
    
    public final int getTakeaways() {
        return 0;
    }
    
    public final int getGiveaways() {
        return 0;
    }
    
    public final double getPenaltyMinutesPerGame() {
        return 0.0;
    }
    
    public final int getPpOpportunities() {
        return 0;
    }
    
    public final int getPpGoalsFor() {
        return 0;
    }
    
    public final int getPpGoalsAgainst() {
        return 0;
    }
    
    public final int getShOpportunities() {
        return 0;
    }
    
    public final int getShGoalsFor() {
        return 0;
    }
    
    public final int getShGoalsAgainst() {
        return 0;
    }
    
    public DetailedTeamStats(int id, int season, int league, int conference, int division, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String abbreviation, int gamesPlayed, int goalsFor, int goalsAgainst, int shotsFor, int shotsAgainst, double faceoffPct, int shotsBlocked, int hits, int takeaways, int giveaways, double penaltyMinutesPerGame, int ppOpportunities, int ppGoalsFor, int ppGoalsAgainst, int shOpportunities, int shGoalsFor, int shGoalsAgainst) {
        super();
    }
}