package shl.scraper.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002\u00a8\u0006\u0015"}, d2 = {"Lshl/scraper/util/ShlForumParser;", "", "()V", "connect", "Lorg/jsoup/nodes/Document;", "url", "", "getThreadList", "", "Lshl/scraper/util/ForumThread;", "forumId", "", "maxPages", "startPage", "getThreadPosts", "Lshl/scraper/util/ThreadPost;", "threadId", "getUserProfile", "Lshl/scraper/forum/ForumUserProfile;", "parseThreadPosts", "doc", "SHLScraper"})
public final class ShlForumParser {
    public static final shl.scraper.util.ShlForumParser INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.util.ForumThread> getThreadList(int forumId, int maxPages, int startPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<shl.scraper.util.ThreadPost> getThreadPosts(int threadId) {
        return null;
    }
    
    private final java.util.List<shl.scraper.util.ThreadPost> parseThreadPosts(org.jsoup.nodes.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.forum.ForumUserProfile getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jsoup.nodes.Document connect(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private ShlForumParser() {
        super();
    }
}