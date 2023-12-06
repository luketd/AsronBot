package shl.scraper.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J0\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/commands/ListThreadsCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "buildResponse", "", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "commandNameRegex", "Lkotlin/text/Regex;", "shouldShow", "", "thread", "Lshl/scraper/util/ForumThread;", "SHLScraper"})
public class ListThreadsCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String buildResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    protected boolean shouldShow(@org.jetbrains.annotations.NotNull()
    shl.scraper.util.ForumThread thread) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public ListThreadsCommand() {
        super();
    }
}