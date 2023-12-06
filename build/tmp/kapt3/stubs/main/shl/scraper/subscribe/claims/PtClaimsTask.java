package shl.scraper.subscribe.claims;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lshl/scraper/subscribe/claims/PtClaimsTask;", "", "config", "Lshl/scraper/subscribe/claims/PtClaimSubscription;", "discord", "Lshl/scraper/Discord;", "(Lshl/scraper/subscribe/claims/PtClaimSubscription;Lshl/scraper/Discord;)V", "lastRunTimestamp", "", "timer", "Ljava/util/Timer;", "cancel", "", "check", "SHLScraper"})
public final class PtClaimsTask {
    private final java.util.Timer timer = null;
    private long lastRunTimestamp;
    private final shl.scraper.subscribe.claims.PtClaimSubscription config = null;
    private final shl.scraper.Discord discord = null;
    
    private final synchronized void check() {
    }
    
    public final void cancel() {
    }
    
    public PtClaimsTask(@org.jetbrains.annotations.NotNull()
    shl.scraper.subscribe.claims.PtClaimSubscription config, @org.jetbrains.annotations.NotNull()
    shl.scraper.Discord discord) {
        super();
    }
}