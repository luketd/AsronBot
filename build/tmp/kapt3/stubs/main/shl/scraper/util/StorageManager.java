package shl.scraper.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0007J)\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000fJ#\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0014\u001a\u0002H\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0015J)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0014\u001a\u0002H\f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lshl/scraper/util/StorageManager;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "getFile", "Ljava/io/File;", "path", "", "getLogFile", "read", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Ljava/lang/reflect/ParameterizedType;", "(Ljava/lang/reflect/ParameterizedType;Ljava/lang/String;)Ljava/lang/Object;", "save", "", "value", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Ljava/lang/String;)V", "SHLScraper"})
public final class StorageManager {
    private static final com.squareup.moshi.Moshi moshi = null;
    public static final shl.scraper.util.StorageManager INSTANCE = null;
    
    public final <T extends java.lang.Object>void save(T value, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final <T extends java.lang.Object>void save(T value, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.ParameterizedType type, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T read(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T read(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.ParameterizedType type, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    private final java.io.File getFile(java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getLogFile() {
        return null;
    }
    
    private StorageManager() {
        super();
    }
}