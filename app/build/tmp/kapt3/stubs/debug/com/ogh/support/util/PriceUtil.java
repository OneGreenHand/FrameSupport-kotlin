package com.ogh.support.util;

/**
 * 数字相关转换工具
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ.\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/ogh/support/util/PriceUtil;", "", "()V", "getAccurateNumber", "", "num", "", "digit", "", "getPerformanceNumber", "qianWeiFenGe", "rounding", "setPriceSp", "Landroid/text/Spannable;", "text1", "text2", "font", "color1", "color2", "font1", "font2", "setPriceSp2", "color", "subZeroAndDot", "s", "app_debug"})
public final class PriceUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.PriceUtil INSTANCE = null;
    
    private PriceUtil() {
        super();
    }
    
    /**
     * 得到转化后的数值
     * 性能较好,精度低
     * digit 小数点后保留几位（四舍五入）
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPerformanceNumber(double num, int digit) {
        return null;
    }
    
    /**
     * 得到转化后的数值
     * 性能较差,精度高
     * digit 小数点后保留几位（价格为正:数值不变，价格为负:数值变小）
     */
    public final double getAccurateNumber(@org.jetbrains.annotations.NotNull
    java.lang.String num, int digit) {
        return 0.0;
    }
    
    /**
     * 四舍五入计算
     * 性能较差
     * digit 小数点后保留几位
     */
    public final double rounding(@org.jetbrains.annotations.NotNull
    java.lang.String num, int digit) {
        return 0.0;
    }
    
    /**
     * 千位分隔符 10000会变成10,000
     * 小数点后的数字不会参与分割
     * digit 每隔几位分割
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String qianWeiFenGe(@org.jetbrains.annotations.NotNull
    java.lang.String num, int digit) {
        return null;
    }
    
    /**
     * 使用java正则表达式去掉多余的.与0
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String subZeroAndDot(@org.jetbrains.annotations.NotNull
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.Spannable setPriceSp(@org.jetbrains.annotations.NotNull
    java.lang.String text1, @org.jetbrains.annotations.NotNull
    java.lang.String text2, int font, int color1, int color2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.Spannable setPriceSp2(@org.jetbrains.annotations.NotNull
    java.lang.String text1, @org.jetbrains.annotations.NotNull
    java.lang.String text2, int font1, int font2, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.Spannable setPriceSp(@org.jetbrains.annotations.NotNull
    java.lang.String text1, @org.jetbrains.annotations.NotNull
    java.lang.String text2, int font1, int font2, int color1, int color2) {
        return null;
    }
}