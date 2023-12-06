package shl.scraper.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u0010*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a8\u0006\u0018"}, d2 = {"Lshl/scraper/commands/TeamPtStatsCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "buildResponse", "", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "commandNameRegex", "Lkotlin/text/Regex;", "appendPts", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "playerPts", "Lshl/scraper/commands/TeamPtStatsCommand$PlayerPtInfo;", "maxUserNameLength", "", "PlayerPtInfo", "SHLScraper"})
public final class TeamPtStatsCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String buildResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    private final void appendPts(java.lang.StringBuilder $this$appendPts, shl.scraper.commands.TeamPtStatsCommand.PlayerPtInfo playerPts, int maxUserNameLength) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public TeamPtStatsCommand() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/commands/TeamPtStatsCommand$PlayerPtInfo;", "", "player", "Lshl/scraper/roster/RosterPlayer;", "claims", "", "Lshl/scraper/tpe/TpeClaim;", "(Lshl/scraper/roster/RosterPlayer;Ljava/util/List;)V", "lastClaims", "getLastClaims", "()Ljava/util/List;", "lastClaimsCompleted", "", "getLastClaimsCompleted", "()I", "percentageOverall", "getPercentageOverall", "getPlayer", "()Lshl/scraper/roster/RosterPlayer;", "streak", "getStreak", "SHLScraper"})
    static final class PlayerPtInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<shl.scraper.tpe.TpeClaim> lastClaims = null;
        private final int lastClaimsCompleted = 0;
        private final int streak = 0;
        private final int percentageOverall = 0;
        @org.jetbrains.annotations.NotNull()
        private final shl.scraper.roster.RosterPlayer player = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<shl.scraper.tpe.TpeClaim> getLastClaims() {
            return null;
        }
        
        public final int getLastClaimsCompleted() {
            return 0;
        }
        
        public final int getStreak() {
            return 0;
        }
        
        public final int getPercentageOverall() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.roster.RosterPlayer getPlayer() {
            return null;
        }
        
        public PlayerPtInfo(@org.jetbrains.annotations.NotNull()
        shl.scraper.roster.RosterPlayer player, @org.jetbrains.annotations.NotNull()
        java.util.List<shl.scraper.tpe.TpeClaim> claims) {
            super();
        }
    }
}