package com.ogh.support.util;

/**
 * description: 所有关于时间计算的工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f\u00a8\u0006\u0012"}, d2 = {"Lcom/ogh/support/util/DateUtil;", "", "()V", "getAfter30Day", "Ljava/util/Calendar;", "cl", "getAfterDay", "getBeforeDay", "getDateAfter", "Ljava/util/Date;", "d", "day", "", "getDateBefore", "setCalendar", "year", "month", "date", "app_debug"})
public final class DateUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.DateUtil INSTANCE = null;
    
    private DateUtil() {
        super();
    }
    
    /**
     * 设置时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar setCalendar(int year, int month, int date) {
        return null;
    }
    
    /**
     * 获取当前时间的前一天时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar getBeforeDay(@org.jetbrains.annotations.NotNull
    java.util.Calendar cl) {
        return null;
    }
    
    /**
     * 获取当前时间的后一天时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar getAfterDay(@org.jetbrains.annotations.NotNull
    java.util.Calendar cl) {
        return null;
    }
    
    /**
     * 获取当前时间的后30天时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar getAfter30Day(@org.jetbrains.annotations.NotNull
    java.util.Calendar cl) {
        return null;
    }
    
    /**
     * 得到几天前的时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateBefore(@org.jetbrains.annotations.NotNull
    java.util.Date d, int day) {
        return null;
    }
    
    /**
     * 得到几天后的时间
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateAfter(@org.jetbrains.annotations.NotNull
    java.util.Date d, int day) {
        return null;
    }
}