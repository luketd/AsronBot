package shl.scraper.commands.index.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\rH\u0004J&\u0010\u000f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0004J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0004J/\u0010\u0014\u001a\u00020\u0015*\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0004\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\t0\bH\u0004J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\bH\u0004\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\t0\bH\u0004\u00a8\u0006\u001f"}, d2 = {"Lshl/scraper/commands/index/base/BaseIndexCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "withSeasonAndName", "Lshl/scraper/BaseEmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "nameRequired", "", "responseBuilder", "Lkotlin/Function2;", "", "getName", "skip", "getPosition", "Lshl/scraper/index/PositionFilter;", "index", "setInfo", "", "season", "seasonType", "Lshl/scraper/index/SeasonType;", "regularSeasonCommand", "(Lshl/scraper/BaseEmbedBuilder;Ljava/lang/Integer;Lshl/scraper/index/SeasonType;Ljava/lang/String;)V", "tryFindPositionFilter", "tryFindSeason", "(Ljava/util/List;)Ljava/lang/Integer;", "tryFindSeasonType", "SHLScraper"})
public abstract class BaseIndexCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Integer tryFindSeason(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$tryFindSeason) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final shl.scraper.index.PositionFilter tryFindPositionFilter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$tryFindPositionFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final shl.scraper.index.SeasonType tryFindSeasonType(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$tryFindSeasonType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final shl.scraper.index.PositionFilter getPosition(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$getPosition, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getName(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$getName, @org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, int skip) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final shl.scraper.BaseEmbedBuilder withSeasonAndName(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, boolean nameRequired, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, ? extends shl.scraper.BaseEmbedBuilder> responseBuilder) {
        return null;
    }
    
    protected final void setInfo(@org.jetbrains.annotations.NotNull()
    shl.scraper.BaseEmbedBuilder $this$setInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType, @org.jetbrains.annotations.Nullable()
    java.lang.String regularSeasonCommand) {
    }
    
    public BaseIndexCommand() {
        super();
    }
}