package shl.scraper.commands.index.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ*\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a8\u0006\u0013"}, d2 = {"Lshl/scraper/commands/index/base/BaseTeamScheduleCommand;", "Lshl/scraper/commands/DiscordCommand;", "()V", "createResponse", "Lnet/dv8tion/jda/api/EmbedBuilder;", "event", "Lnet/dv8tion/jda/api/events/message/MessageReceivedEvent;", "team", "Lshl/scraper/roster/TeamInfo;", "schedule", "Lshl/scraper/index/TeamSchedule;", "internationalTeamBranding", "Lshl/scraper/iihf/InternationalTeamBranding;", "addCompletedGames", "", "Lshl/scraper/BaseEmbedBuilder;", "games", "", "Lshl/scraper/index/api/GameInfo;", "SHLScraper"})
public abstract class BaseTeamScheduleCommand extends shl.scraper.commands.DiscordCommand {
    
    @org.jetbrains.annotations.NotNull()
    public final net.dv8tion.jda.api.EmbedBuilder createResponse(@org.jetbrains.annotations.NotNull()
    net.dv8tion.jda.api.events.message.MessageReceivedEvent event, @org.jetbrains.annotations.Nullable()
    shl.scraper.roster.TeamInfo team, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.TeamSchedule schedule, @org.jetbrains.annotations.Nullable()
    shl.scraper.iihf.InternationalTeamBranding internationalTeamBranding) {
        return null;
    }
    
    private final void addCompletedGames(shl.scraper.BaseEmbedBuilder $this$addCompletedGames, net.dv8tion.jda.api.events.message.MessageReceivedEvent event, shl.scraper.index.TeamSchedule schedule, java.util.List<shl.scraper.index.api.GameInfo> games) {
    }
    
    public BaseTeamScheduleCommand() {
        super();
    }
}