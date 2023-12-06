package shl.scraper.tpe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0010\u001a\u00020\u000bJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000b\u00a8\u0006\u0014"}, d2 = {"Lshl/scraper/tpe/TpeClaimRepository;", "", "()V", "convertClaimPostToLines", "", "", "post", "Lshl/scraper/util/ThreadPost;", "getClaims", "Lshl/scraper/tpe/TpeClaim;", "threadId", "", "season", "juniors", "", "getClaimsForPlayer", "draftSeason", "getLatestClaimsForUser", "userName", "size", "SHLScraper"})
public final class TpeClaimRepository {
    public static final shl.scraper.tpe.TpeClaimRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.tpe.TpeClaim> getClaimsForPlayer(int draftSeason) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.tpe.TpeClaim> getLatestClaimsForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, int size) {
        return null;
    }
    
    private final java.util.List<shl.scraper.tpe.TpeClaim> getClaims(int threadId, int season, boolean juniors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> convertClaimPostToLines(@org.jetbrains.annotations.NotNull()
    shl.scraper.util.ThreadPost post) {
        return null;
    }
    
    private TpeClaimRepository() {
        super();
    }
}