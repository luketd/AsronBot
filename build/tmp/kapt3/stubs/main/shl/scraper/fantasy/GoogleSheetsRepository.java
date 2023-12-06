package shl.scraper.fantasy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JB\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t0\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lshl/scraper/fantasy/GoogleSheetsRepository;", "", "()V", "APPLICATION_NAME", "", "CREDENTIALS_FILE_PATH", "JSON_FACTORY", "Lcom/google/api/client/json/JsonFactory;", "SCOPES", "", "TOKENS_DIRECTORY_PATH", "cache", "", "Lshl/scraper/forum/CacheValue;", "checkCache", "sheetId", "range", "cacheOnly", "", "getValue", "Lkotlin/Function0;", "getCredentials", "Lcom/google/api/client/auth/oauth2/Credential;", "HTTP_TRANSPORT", "Lcom/google/api/client/http/javanet/NetHttpTransport;", "getValues", "SHLScraper"})
public final class GoogleSheetsRepository {
    private static final java.lang.String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final com.google.api.client.json.JsonFactory JSON_FACTORY = null;
    private static final java.lang.String TOKENS_DIRECTORY_PATH = "tokens";
    private static final java.util.List<java.lang.String> SCOPES = null;
    private static final java.lang.String CREDENTIALS_FILE_PATH = "storage/credentials.json";
    private static final java.util.Map<java.lang.String, shl.scraper.forum.CacheValue<java.util.List<java.lang.Object>>> cache = null;
    public static final shl.scraper.fantasy.GoogleSheetsRepository INSTANCE = null;
    
    private final com.google.api.client.auth.oauth2.Credential getCredentials(com.google.api.client.http.javanet.NetHttpTransport HTTP_TRANSPORT) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getValues(@org.jetbrains.annotations.NotNull()
    java.lang.String sheetId, @org.jetbrains.annotations.NotNull()
    java.lang.String range, boolean cacheOnly) {
        return null;
    }
    
    private final shl.scraper.forum.CacheValue<java.util.List<java.lang.Object>> checkCache(java.lang.String sheetId, java.lang.String range, boolean cacheOnly, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> getValue) {
        return null;
    }
    
    private GoogleSheetsRepository() {
        super();
    }
}