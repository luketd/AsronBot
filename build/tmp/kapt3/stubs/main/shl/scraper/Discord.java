package shl.scraper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lshl/scraper/Discord;", "", "()V", "commands", "", "Lshl/scraper/commands/DiscordCommand;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "jda", "Lnet/dv8tion/jda/api/JDA;", "getJda", "()Lnet/dv8tion/jda/api/JDA;", "sendError", "", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sendMessage", "message", "", "channel", "Lnet/dv8tion/jda/api/entities/channel/concrete/TextChannel;", "Lnet/dv8tion/jda/api/entities/channel/unions/MessageChannelUnion;", "sendReply", "command", "splitMessage", "SHLScraper"})
public final class Discord {
    @org.jetbrains.annotations.NotNull()
    private final net.dv8tion.jda.api.JDA jda = null;
    private final java.util.List<shl.scraper.commands.DiscordCommand> commands = null;
    private final java.util.concurrent.ExecutorService executor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.dv8tion.jda.api.JDA getJda() {
        return null;
    }
    
    private final void sendReply(net.dv8tion.jda.api.events.message.MessageReceivedEvent event, shl.scraper.commands.DiscordCommand command) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion channel) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.entities.channel.concrete.TextChannel channel) {
    }
    
    private final java.util.List<java.lang.String> splitMessage(java.lang.String message) {
        return null;
    }
    
    private final void sendError(net.dv8tion.jda.api.events.message.MessageReceivedEvent event, java.lang.Exception e) {
    }
    
    public Discord() {
        super();
    }
}