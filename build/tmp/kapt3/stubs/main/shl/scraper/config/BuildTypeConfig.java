package shl.scraper.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lshl/scraper/config/BuildTypeConfig;", "", "discordBotToken", "", "indexUpdateServerId", "indexUpdateChannelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscordBotToken", "()Ljava/lang/String;", "getIndexUpdateChannelId", "getIndexUpdateServerId", "Debug", "Release", "Lshl/scraper/config/BuildTypeConfig$Debug;", "Lshl/scraper/config/BuildTypeConfig$Release;", "SHLScraper"})
public abstract class BuildTypeConfig {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String discordBotToken = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String indexUpdateServerId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String indexUpdateChannelId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscordBotToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIndexUpdateServerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIndexUpdateChannelId() {
        return null;
    }
    
    private BuildTypeConfig(java.lang.String discordBotToken, java.lang.String indexUpdateServerId, java.lang.String indexUpdateChannelId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lshl/scraper/config/BuildTypeConfig$Debug;", "Lshl/scraper/config/BuildTypeConfig;", "()V", "SHLScraper"})
    public static final class Debug extends shl.scraper.config.BuildTypeConfig {
        public static final shl.scraper.config.BuildTypeConfig.Debug INSTANCE = null;
        
        private Debug() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lshl/scraper/config/BuildTypeConfig$Release;", "Lshl/scraper/config/BuildTypeConfig;", "()V", "SHLScraper"})
    public static final class Release extends shl.scraper.config.BuildTypeConfig {
        public static final shl.scraper.config.BuildTypeConfig.Release INSTANCE = null;
        
        private Release() {
            super(null, null, null);
        }
    }
}