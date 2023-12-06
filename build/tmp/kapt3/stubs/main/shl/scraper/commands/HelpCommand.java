package shl.scraper.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u0011*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a8\u0006\u0016"}, d2 = {"Lshl/scraper/commands/HelpCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "buildResponseEmbed", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "arguments", "", "", "userRole", "Lshl/scraper/UserRole;", "discord", "Lshl/scraper/Discord;", "commandNameRegex", "Lkotlin/text/Regex;", "appendCommandDescription", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "command", "description", "SHLScraper"})
public final class HelpCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public net.dv8tion.jda.api.EmbedBuilder buildResponseEmbed(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> arguments, @org.jetbrains.annotations.NotNull()
    shl.scraper.UserRole userRole, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        return null;
    }
    
    private final void appendCommandDescription(java.lang.StringBuilder $this$appendCommandDescription, java.lang.String command, java.lang.String description) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.text.Regex commandNameRegex() {
        return null;
    }
    
    public HelpCommand() {
        super();
    }
}