package shl.scraper.subscribe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lshl/scraper/subscribe/PtDueDateType;", "", "date", "Ljava/util/Calendar;", "(Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "Day", "Exact", "SimStart", "Lshl/scraper/subscribe/PtDueDateType$Exact;", "Lshl/scraper/subscribe/PtDueDateType$SimStart;", "Lshl/scraper/subscribe/PtDueDateType$Day;", "SHLScraper"})
public abstract class PtDueDateType {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Calendar date = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Calendar getDate() {
        return null;
    }
    
    private PtDueDateType(java.util.Calendar date) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lshl/scraper/subscribe/PtDueDateType$Exact;", "Lshl/scraper/subscribe/PtDueDateType;", "date", "Ljava/util/Calendar;", "(Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SHLScraper"})
    public static final class Exact extends shl.scraper.subscribe.PtDueDateType {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Calendar date = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Calendar getDate() {
            return null;
        }
        
        public Exact(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Calendar component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.subscribe.PtDueDateType.Exact copy(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lshl/scraper/subscribe/PtDueDateType$SimStart;", "Lshl/scraper/subscribe/PtDueDateType;", "date", "Ljava/util/Calendar;", "(Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SHLScraper"})
    public static final class SimStart extends shl.scraper.subscribe.PtDueDateType {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Calendar date = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Calendar getDate() {
            return null;
        }
        
        public SimStart(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Calendar component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.subscribe.PtDueDateType.SimStart copy(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lshl/scraper/subscribe/PtDueDateType$Day;", "Lshl/scraper/subscribe/PtDueDateType;", "date", "Ljava/util/Calendar;", "(Ljava/util/Calendar;)V", "getDate", "()Ljava/util/Calendar;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SHLScraper"})
    public static final class Day extends shl.scraper.subscribe.PtDueDateType {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Calendar date = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Calendar getDate() {
            return null;
        }
        
        public Day(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Calendar component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final shl.scraper.subscribe.PtDueDateType.Day copy(@org.jetbrains.annotations.NotNull()
        java.util.Calendar date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}