package shl.scraper.subscribe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lshl/scraper/subscribe/ForumSubscriptionRepository;", "", "()V", "configs", "", "Lshl/scraper/subscribe/ForumSubscription;", "getConfigs", "()Ljava/util/Set;", "setConfigs", "(Ljava/util/Set;)V", "discord", "Lshl/scraper/Discord;", "jsonType", "Ljava/lang/reflect/ParameterizedType;", "kotlin.jvm.PlatformType", "storagePath", "", "tasksByConfig", "", "Lshl/scraper/subscribe/ForumMonitorTask;", "add", "", "config", "remove", "start", "SHLScraper"})
public final class ForumSubscriptionRepository {
    private static final java.lang.String storagePath = "/forumStreamConfigs.txt";
    private static final java.lang.reflect.ParameterizedType jsonType = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Set<shl.scraper.subscribe.ForumSubscription> configs;
    private static java.util.Map<shl.scraper.subscribe.ForumSubscription, shl.scraper.subscribe.ForumMonitorTask> tasksByConfig;
    private static shl.scraper.Discord discord;
    public static final shl.scraper.subscribe.ForumSubscriptionRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<shl.scraper.subscribe.ForumSubscription> getConfigs() {
        return null;
    }
    
    public final void setConfigs(@org.jetbrains.annotations.NotNull()
    java.util.Set<shl.scraper.subscribe.ForumSubscription> p0) {
    }
    
    public final synchronized void start(@org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
    }
    
    public final synchronized void add(@org.jetbrains.annotations.NotNull()
    shl.scraper.subscribe.ForumSubscription config) {
    }
    
    public final synchronized void remove(@org.jetbrains.annotations.NotNull()
    shl.scraper.subscribe.ForumSubscription config) {
    }
    
    private ForumSubscriptionRepository() {
        super();
    }
}