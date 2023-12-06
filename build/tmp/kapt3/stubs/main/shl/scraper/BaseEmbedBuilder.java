package shl.scraper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ2\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\r0\u0012J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0003R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lshl/scraper/BaseEmbedBuilder;", "Lnet/dv8tion/jda/api/EmbedBuilder;", "logoUrl", "", "teamColor", "Lshl/scraper/roster/TeamInfo;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "forceColor", "Ljava/awt/Color;", "(Ljava/lang/String;Lshl/scraper/roster/TeamInfo;Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;Ljava/awt/Color;)V", "footerText", "addField", "", "name", "inline", "", "buildContent", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendToFooter", "text", "SHLScraper"})
public class BaseEmbedBuilder extends net.dv8tion.jda.api.EmbedBuilder {
    private java.lang.String footerText = "";
    
    public final void addField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean inline, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.Unit> buildContent) {
    }
    
    public final void appendToFooter(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public BaseEmbedBuilder(@org.jetbrains.annotations.Nullable()
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo teamColor, @org.jetbrains.annotations.Nullable()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.Nullable()
    java.awt.Color forceColor) {
        super();
    }
    
    public BaseEmbedBuilder() {
        super();
    }
}