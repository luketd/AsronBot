package shl.scraper.forum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JW\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0006\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00060\u00042\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0018H\u0002\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u0016J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0016J8\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0016J8\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0016J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u0016R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lshl/scraper/forum/ShlForumRepository;", "", "()V", "cacheByForumId", "", "", "Lshl/scraper/forum/CacheValue;", "", "Lshl/scraper/util/ForumThread;", "cacheByThreadId", "Lshl/scraper/util/ThreadPost;", "cacheByUrl", "", "Lorg/jsoup/nodes/Document;", "profileCacheByUrl", "Lshl/scraper/forum/ForumUserProfile;", "checkCache", "V", "K", "cache", "key", "refreshMls", "", "getValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;JLkotlin/jvm/functions/Function0;)Lshl/scraper/forum/CacheValue;", "getDocument", "url", "timeout", "getPosts", "threadId", "getPostsSynced", "getThreads", "forumId", "maxPages", "startPage", "getThreadsSynced", "getUserProfile", "SHLScraper"})
public final class ShlForumRepository {
    private static final java.util.Map<java.lang.Integer, shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ForumThread>>> cacheByForumId = null;
    private static final java.util.Map<java.lang.Integer, shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ThreadPost>>> cacheByThreadId = null;
    private static final java.util.Map<java.lang.String, shl.scraper.forum.CacheValue<org.jsoup.nodes.Document>> cacheByUrl = null;
    private static final java.util.Map<java.lang.String, shl.scraper.forum.CacheValue<shl.scraper.forum.ForumUserProfile>> profileCacheByUrl = null;
    public static final shl.scraper.forum.ShlForumRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ForumThread>> getThreadsSynced(int forumId, int maxPages, int startPage, long timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ForumThread>> getThreads(int forumId, int maxPages, int startPage, long timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ThreadPost>> getPostsSynced(int threadId, long timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.forum.CacheValue<java.util.List<shl.scraper.util.ThreadPost>> getPosts(int threadId, long timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.forum.CacheValue<org.jsoup.nodes.Document> getDocument(@org.jetbrains.annotations.NotNull()
    java.lang.String url, long timeout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.forum.ForumUserProfile getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String url, long timeout) {
        return null;
    }
    
    private final <K extends java.lang.Object, V extends java.lang.Object>shl.scraper.forum.CacheValue<V> checkCache(java.util.Map<K, shl.scraper.forum.CacheValue<V>> cache, K key, long refreshMls, kotlin.jvm.functions.Function0<? extends V> getValue) {
        return null;
    }
    
    private ShlForumRepository() {
        super();
    }
}