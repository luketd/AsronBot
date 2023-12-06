package shl.scraper.commands.index.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0003012B\u0005\u00a2\u0006\u0002\u0010\u0002Je\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0004\u00a2\u0006\u0002\u0010\u0015J`\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0004J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0014J|\u0010%\u001a\u00020&\"\b\b\u0000\u0010\'*\u00020$*\u00020\u00042\u0006\u0010(\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\'0\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\r2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\'\u0012\u0004\u0012\u00020\u001c0+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\'\u0012\u0004\u0012\u00020\r0+H\u0002J,\u0010-\u001a\u00020\b*\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u00020\u0012H\u0004\u00a8\u00063"}, d2 = {"Lshl/scraper/commands/index/base/BaseLeadersCommand;", "Lshl/scraper/commands/index/base/BaseIndexCommand;", "()V", "replyForGoalies", "Lshl/scraper/BaseEmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arg", "Lshl/scraper/commands/index/base/BaseLeadersCommand$LeadersArgs;", "goalies", "", "Lshl/scraper/index/GoalieStats;", "outputCount", "", "minGamesPlayedPercentage", "", "maxMinGamesPlayed", "outputIneligible", "", "categories", "Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;", "(Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;Lshl/scraper/commands/index/base/BaseLeadersCommand$LeadersArgs;Ljava/util/List;IFLjava/lang/Integer;ZLjava/util/List;)Lshl/scraper/BaseEmbedBuilder;", "replyForSkaters", "leagueType", "Lshl/scraper/index/LeagueType;", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "playerName", "", "skaters", "Lshl/scraper/index/PlayerStats;", "categoryFilter", "Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;", "displayedCategories", "toOutputName", "stats", "Lshl/scraper/index/BasePlayerStats;", "addCategory", "", "T", "title", "minGamesPlayed", "output", "Lkotlin/Function1;", "selector", "parseArguments", "arguments", "allowRookieFilter", "CategoryFilter", "GoalieCategoryFilter", "LeadersArgs", "SHLScraper"})
public abstract class BaseLeadersCommand extends shl.scraper.commands.index.base.BaseIndexCommand {
    
    @org.jetbrains.annotations.NotNull()
    protected final shl.scraper.commands.index.base.BaseLeadersCommand.LeadersArgs parseArguments(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent $this$parseArguments, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, boolean allowRookieFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final shl.scraper.BaseEmbedBuilder replyForGoalies(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    shl.scraper.commands.index.base.BaseLeadersCommand.LeadersArgs arg, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.GoalieStats> goalies, int outputCount, float minGamesPlayedPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxMinGamesPlayed, boolean outputIneligible, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter> categories) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final shl.scraper.BaseEmbedBuilder replyForSkaters(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String playerName, @org.jetbrains.annotations.NotNull()
    java.util.List<shl.scraper.index.PlayerStats> skaters, @org.jetbrains.annotations.Nullable()
    shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter categoryFilter, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter> displayedCategories, int outputCount) {
        return null;
    }
    
    private final <T extends shl.scraper.index.BasePlayerStats>void addCategory(shl.scraper.BaseEmbedBuilder $this$addCategory, java.lang.String title, java.util.List<? extends T> stats, java.lang.String playerName, int outputCount, boolean outputIneligible, int minGamesPlayed, kotlin.jvm.functions.Function1<? super T, java.lang.String> output, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> selector) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String toOutputName(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.BasePlayerStats stats) {
        return null;
    }
    
    public BaseLeadersCommand() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0014H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0080\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0005H\u00d6\u0001J\t\u00108\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u00069"}, d2 = {"Lshl/scraper/commands/index/base/BaseLeadersCommand$LeadersArgs;", "", "leagueType", "Lshl/scraper/index/LeagueType;", "season", "", "seasonType", "Lshl/scraper/index/SeasonType;", "category", "Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;", "positionFilter", "Lshl/scraper/index/PositionFilter;", "goalieCategory", "Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;", "playerName", "", "draftClass", "teamInfo", "Lshl/scraper/roster/TeamInfo;", "isRookies", "", "(Lshl/scraper/index/LeagueType;Ljava/lang/Integer;Lshl/scraper/index/SeasonType;Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;Lshl/scraper/index/PositionFilter;Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;Ljava/lang/String;Ljava/lang/Integer;Lshl/scraper/roster/TeamInfo;Z)V", "getCategory", "()Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;", "getDraftClass", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGoalieCategory", "()Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;", "()Z", "getLeagueType", "()Lshl/scraper/index/LeagueType;", "getPlayerName", "()Ljava/lang/String;", "getPositionFilter", "()Lshl/scraper/index/PositionFilter;", "getSeason", "getSeasonType", "()Lshl/scraper/index/SeasonType;", "getTeamInfo", "()Lshl/scraper/roster/TeamInfo;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lshl/scraper/index/LeagueType;Ljava/lang/Integer;Lshl/scraper/index/SeasonType;Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;Lshl/scraper/index/PositionFilter;Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;Ljava/lang/String;Ljava/lang/Integer;Lshl/scraper/roster/TeamInfo;Z)Lshl/scraper/commands/index/base/BaseLeadersCommand$LeadersArgs;", "equals", "other", "hashCode", "toString", "SHLScraper"})
    public static final class LeadersArgs {
        @org.jetbrains.annotations.NotNull()
        private final shl.scraper.index.LeagueType leagueType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer season = null;
        @org.jetbrains.annotations.NotNull()
        private final shl.scraper.index.SeasonType seasonType = null;
        @org.jetbrains.annotations.Nullable()
        private final shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter category = null;
        @org.jetbrains.annotations.Nullable()
        private final shl.scraper.index.PositionFilter positionFilter = null;
        @org.jetbrains.annotations.Nullable()
        private final shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter goalieCategory = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String playerName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer draftClass = null;
        @org.jetbrains.annotations.Nullable()
        private final shl.scraper.roster.TeamInfo teamInfo = null;
        private final boolean isRookies = false;
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.LeagueType getLeagueType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSeason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.SeasonType getSeasonType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.index.PositionFilter getPositionFilter() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter getGoalieCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPlayerName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDraftClass() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.roster.TeamInfo getTeamInfo() {
            return null;
        }
        
        public final boolean isRookies() {
            return false;
        }
        
        public LeadersArgs(@org.jetbrains.annotations.NotNull()
        shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer season, @org.jetbrains.annotations.NotNull()
        shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
        shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter category, @org.jetbrains.annotations.Nullable()
        shl.scraper.index.PositionFilter positionFilter, @org.jetbrains.annotations.Nullable()
        shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter goalieCategory, @org.jetbrains.annotations.Nullable()
        java.lang.String playerName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer draftClass, @org.jetbrains.annotations.Nullable()
        shl.scraper.roster.TeamInfo teamInfo, boolean isRookies) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.LeagueType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.index.SeasonType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.index.PositionFilter component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final shl.scraper.roster.TeamInfo component9() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.commands.index.base.BaseLeadersCommand.LeadersArgs copy(@org.jetbrains.annotations.NotNull()
        shl.scraper.index.LeagueType leagueType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer season, @org.jetbrains.annotations.NotNull()
        shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
        shl.scraper.commands.index.base.BaseLeadersCommand.CategoryFilter category, @org.jetbrains.annotations.Nullable()
        shl.scraper.index.PositionFilter positionFilter, @org.jetbrains.annotations.Nullable()
        shl.scraper.commands.index.base.BaseLeadersCommand.GoalieCategoryFilter goalieCategory, @org.jetbrains.annotations.Nullable()
        java.lang.String playerName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer draftClass, @org.jetbrains.annotations.Nullable()
        shl.scraper.roster.TeamInfo teamInfo, boolean isRookies) {
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
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lshl/scraper/commands/index/base/BaseLeadersCommand$CategoryFilter;", "", "regex", "Lkotlin/text/Regex;", "displayName", "", "selector", "Lkotlin/Function1;", "Lshl/scraper/index/PlayerStats;", "", "(Ljava/lang/String;ILkotlin/text/Regex;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDisplayName", "()Ljava/lang/String;", "getRegex", "()Lkotlin/text/Regex;", "getSelector", "()Lkotlin/jvm/functions/Function1;", "Points", "Goals", "Assists", "PlusMinus", "PenaltyMinutes", "Shots", "Hits", "Blocks", "GamesPlayed", "PowerPlayPoints", "SHLScraper"})
    public static enum CategoryFilter {
        /*public static final*/ Points /* = new Points(null, null, null) */,
        /*public static final*/ Goals /* = new Goals(null, null, null) */,
        /*public static final*/ Assists /* = new Assists(null, null, null) */,
        /*public static final*/ PlusMinus /* = new PlusMinus(null, null, null) */,
        /*public static final*/ PenaltyMinutes /* = new PenaltyMinutes(null, null, null) */,
        /*public static final*/ Shots /* = new Shots(null, null, null) */,
        /*public static final*/ Hits /* = new Hits(null, null, null) */,
        /*public static final*/ Blocks /* = new Blocks(null, null, null) */,
        /*public static final*/ GamesPlayed /* = new GamesPlayed(null, null, null) */,
        /*public static final*/ PowerPlayPoints /* = new PowerPlayPoints(null, null, null) */;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.text.Regex regex = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<shl.scraper.index.PlayerStats, java.lang.Integer> selector = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.text.Regex getRegex() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<shl.scraper.index.PlayerStats, java.lang.Integer> getSelector() {
            return null;
        }
        
        CategoryFilter(kotlin.text.Regex regex, java.lang.String displayName, kotlin.jvm.functions.Function1<? super shl.scraper.index.PlayerStats, java.lang.Integer> selector) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e\u00a8\u0006\u001f"}, d2 = {"Lshl/scraper/commands/index/base/BaseLeadersCommand$GoalieCategoryFilter;", "", "regex", "Lkotlin/text/Regex;", "displayName", "", "selector", "Lkotlin/Function1;", "Lshl/scraper/index/GoalieStats;", "", "minGamesRestricted", "", "output", "(Ljava/lang/String;ILkotlin/text/Regex;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "getDisplayName", "()Ljava/lang/String;", "getMinGamesRestricted", "()Z", "getOutput", "()Lkotlin/jvm/functions/Function1;", "getRegex", "()Lkotlin/text/Regex;", "getSelector", "Wins", "Gaa", "SavePercentage", "ShotsAgainst", "Saves", "Shutouts", "GamesPlayed", "GameRating", "SHLScraper"})
    public static enum GoalieCategoryFilter {
        /*public static final*/ Wins /* = new Wins(null, null, null, false, null) */,
        /*public static final*/ Gaa /* = new Gaa(null, null, null, false, null) */,
        /*public static final*/ SavePercentage /* = new SavePercentage(null, null, null, false, null) */,
        /*public static final*/ ShotsAgainst /* = new ShotsAgainst(null, null, null, false, null) */,
        /*public static final*/ Saves /* = new Saves(null, null, null, false, null) */,
        /*public static final*/ Shutouts /* = new Shutouts(null, null, null, false, null) */,
        /*public static final*/ GamesPlayed /* = new GamesPlayed(null, null, null, false, null) */,
        /*public static final*/ GameRating /* = new GameRating(null, null, null, false, null) */;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.text.Regex regex = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<shl.scraper.index.GoalieStats, java.lang.Integer> selector = null;
        private final boolean minGamesRestricted = false;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<shl.scraper.index.GoalieStats, java.lang.String> output = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.text.Regex getRegex() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<shl.scraper.index.GoalieStats, java.lang.Integer> getSelector() {
            return null;
        }
        
        public final boolean getMinGamesRestricted() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<shl.scraper.index.GoalieStats, java.lang.String> getOutput() {
            return null;
        }
        
        GoalieCategoryFilter(kotlin.text.Regex regex, java.lang.String displayName, kotlin.jvm.functions.Function1<? super shl.scraper.index.GoalieStats, java.lang.Integer> selector, boolean minGamesRestricted, kotlin.jvm.functions.Function1<? super shl.scraper.index.GoalieStats, java.lang.String> output) {
        }
    }
}