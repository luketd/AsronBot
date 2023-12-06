package shl.scraper.tpe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2 = {"Lshl/scraper/tpe/TpeClaim;", "", "content", "", "userList", "", "timestamp", "", "post", "Lshl/scraper/util/ThreadPost;", "season", "", "juniors", "", "(Ljava/lang/String;Ljava/util/List;JLshl/scraper/util/ThreadPost;IZ)V", "getContent", "()Ljava/lang/String;", "getJuniors", "()Z", "getPost", "()Lshl/scraper/util/ThreadPost;", "getSeason", "()I", "getTimestamp", "()J", "getUserList", "()Ljava/util/List;", "mentions", "userName", "Companion", "SHLScraper"})
public final class TpeClaim {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> userList = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.util.ThreadPost post = null;
    private final int season = 0;
    private final boolean juniors = false;
    public static final shl.scraper.tpe.TpeClaim.Companion Companion = null;
    
    public final boolean mentions(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getUserList() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.util.ThreadPost getPost() {
        return null;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    public final boolean getJuniors() {
        return false;
    }
    
    public TpeClaim(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> userList, long timestamp, @org.jetbrains.annotations.NotNull()
    shl.scraper.util.ThreadPost post, int season, boolean juniors) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lshl/scraper/tpe/TpeClaim$Companion;", "", "()V", "doesMatch", "", "userName", "", "line", "SHLScraper"})
    public static final class Companion {
        
        public final boolean doesMatch(@org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.NotNull()
        java.lang.String line) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}