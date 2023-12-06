package shl.scraper.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lshl/scraper/db/UserRepository;", "", "()V", "filePath", "", "userDb", "Lshl/scraper/db/UserDb;", "usersByDiscordId", "", "Lshl/scraper/db/UserInfo;", "find", "discordId", "save", "", "userInfo", "SHLScraper"})
public final class UserRepository {
    private static final java.lang.String filePath = "/users.txt";
    private static final shl.scraper.db.UserDb userDb = null;
    private static final java.util.Map<java.lang.String, shl.scraper.db.UserInfo> usersByDiscordId = null;
    public static final shl.scraper.db.UserRepository INSTANCE = null;
    
    public final synchronized void save(@org.jetbrains.annotations.NotNull()
    shl.scraper.db.UserInfo userInfo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.db.UserInfo find(@org.jetbrains.annotations.NotNull()
    java.lang.String discordId) {
        return null;
    }
    
    private UserRepository() {
        super();
    }
}