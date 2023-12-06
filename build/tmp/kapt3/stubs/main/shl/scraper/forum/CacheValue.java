package shl.scraper.forum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lshl/scraper/forum/CacheValue;", "T", "", "value", "timestamp", "", "(Ljava/lang/Object;J)V", "getTimestamp", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isExpired", "", "refreshMls", "SHLScraper"})
public final class CacheValue<T extends java.lang.Object> {
    private final T value = null;
    private final long timestamp = 0L;
    
    public final boolean isExpired(long refreshMls) {
        return false;
    }
    
    public final T getValue() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public CacheValue(T value, long timestamp) {
        super();
    }
}