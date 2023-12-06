package shl.scraper.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J6\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H&J2\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0004J \u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0004J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0004J2\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040\u001fH\u0004J<\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u001fH\u0004J#\u0010\"\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010#\u001a\u00020\u0014H\u0004\u00a2\u0006\u0002\u0010$\u00a8\u0006%"}, d2 = {"Lshl/scraper/commands/DiscordCommand;", "", "()V", "buildResponse", "", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "buildResponseArray", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "commandNameRegex", "Lkotlin/text/Regex;", "getTeamName", "skipArguments", "", "fallbackToStoredTeam", "", "getUserName", "isCommand", "requireRole", "role", "minRole", "responseBuilder", "Lkotlin/Function0;", "withTeamInfo", "Lkotlin/Function1;", "Lshl/scraper/roster/TeamInfo;", "withTeamInfoEmbed", "getSeason", "index", "(Ljava/util/List;I)Ljava/lang/Integer;", "SHLScraper"})
public abstract class DiscordCommand {
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String buildResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<java.lang.String> buildResponseArray(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.text.Regex commandNameRegex();
    
    public final boolean isCommand(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String requireRole(@org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole role, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole minRole, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> responseBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getUserName(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Integer getSeason(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$getSeason, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getTeamName(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, int skipArguments, boolean fallbackToStoredTeam) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final net.dv8tion.jda.api.EmbedBuilder withTeamInfoEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, int skipArguments, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super shl.scraper.roster.TeamInfo, ? extends net.dv8tion.jda.api.EmbedBuilder> responseBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String withTeamInfo(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super shl.scraper.roster.TeamInfo, java.lang.String> responseBuilder) {
        return null;
    }
    
    public DiscordCommand() {
        super();
    }
}