package shl.scraper.subscribe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\u001e\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/subscribe/ForumMonitorTask;", "", "config", "Lshl/scraper/subscribe/ForumSubscription;", "discord", "Lshl/scraper/Discord;", "(Lshl/scraper/subscribe/ForumSubscription;Lshl/scraper/Discord;)V", "lastDueTodayReminderDayOfMonth", "", "lastThreadId", "timer", "Ljava/util/Timer;", "cancel", "", "check", "sendPtRemindersIfNeeded", "threads", "", "Lshl/scraper/util/ForumThread;", "channel", "Lnet/dv8tion/jda/api/entities/channel/concrete/TextChannel;", "SHLScraper"})
public final class ForumMonitorTask {
    private final java.util.Timer timer = null;
    private int lastThreadId;
    private int lastDueTodayReminderDayOfMonth;
    private final shl.scraper.subscribe.ForumSubscription config = null;
    private final shl.scraper.Discord discord = null;
    
    private final synchronized void check() {
    }
    
    private final void sendPtRemindersIfNeeded(java.util.List<shl.scraper.util.ForumThread> threads, net.dv8tion.jda.api.entities.channel.concrete.TextChannel channel) {
    }
    
    public final void cancel() {
    }
    
    public ForumMonitorTask(@org.jetbrains.annotations.NotNull()
    shl.scraper.subscribe.ForumSubscription config, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        super();
    }
}