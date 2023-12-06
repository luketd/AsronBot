package shl.scraper.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0010\u001a\u00020\u0005J\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\b\u0010\u0017\u001a\u00020\rH\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lshl/scraper/custom/CustomCommandRepository;", "", "()V", "commandsByServerId", "", "", "", "Lshl/scraper/custom/CustomCommandInfo;", "jsonType", "Ljava/lang/reflect/ParameterizedType;", "kotlin.jvm.PlatformType", "storagePath", "add", "", "commandInfo", "find", "serverId", "message", "findAllForServer", "", "getAllCommands", "remove", "commandName", "save", "SHLScraper"})
public final class CustomCommandRepository {
    private static final java.lang.String storagePath = "/customCommands.txt";
    private static final java.lang.reflect.ParameterizedType jsonType = null;
    private static final java.util.Map<java.lang.String, java.util.List<shl.scraper.custom.CustomCommandInfo>> commandsByServerId = null;
    public static final shl.scraper.custom.CustomCommandRepository INSTANCE = null;
    
    public final synchronized void add(@org.jetbrains.annotations.NotNull()
    shl.scraper.custom.CustomCommandInfo commandInfo) {
    }
    
    public final synchronized void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String serverId, @org.jetbrains.annotations.NotNull()
    java.lang.String commandName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.custom.CustomCommandInfo find(@org.jetbrains.annotations.NotNull()
    java.lang.String serverId, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<shl.scraper.custom.CustomCommandInfo> getAllCommands(@org.jetbrains.annotations.NotNull()
    java.lang.String serverId, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.custom.CustomCommandInfo> findAllForServer(@org.jetbrains.annotations.NotNull()
    java.lang.String serverId) {
        return null;
    }
    
    private final void save() {
    }
    
    private CustomCommandRepository() {
        super();
    }
}