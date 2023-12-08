package com.ogh.support.util;

/**
 * description: 高精度计算工具类
 * https://www.cnblogs.com/zhangyinhua/p/11545305.html
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\"\u0010\f\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010\u0011\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u0012"}, d2 = {"Lcom/ogh/support/util/CalculUtil;", "", "()V", "add", "", "v1", "v2", "", "scale", "", "compare", "", "div", "mul", "remainder", "round", "v", "sub", "app_debug"})
public final class CalculUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.CalculUtil INSTANCE = null;
    
    private CalculUtil() {
        super();
    }
    
    /**
     * 提供精确的加法运算
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public final double add(double v1, double v2) {
        return 0.0;
    }
    
    /**
     * 提供精确的加法运算
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被加数
     * @param v2    加数
     * @param scale 保留scale 位小数
     * @return 两个参数的和
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String add(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2, int scale) {
        return null;
    }
    
    /**
     * 提供精确的减法运算
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public final double sub(double v1, double v2) {
        return 0.0;
    }
    
    /**
     * 提供精确的减法运算
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被减数
     * @param v2    减数
     * @param scale 保留scale 位小数
     * @return 两个参数的差
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String sub(@org.jetbrains.annotations.Nullable
    java.lang.String v1, @org.jetbrains.annotations.Nullable
    java.lang.String v2, int scale) {
        return null;
    }
    
    /**
     * 提供精确的乘法运算
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public final double mul(double v1, double v2) {
        return 0.0;
    }
    
    /**
     * 提供精确的乘法运算
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被乘数
     * @param v2    乘数
     * @param scale 保留scale 位小数
     * @return 两个参数的积
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String mul(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2, int scale) {
        return null;
    }
    
    /**
     * 提供精确的除法运算
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 保留scale 位小数
     * @return 两个参数的商
     */
    public final double div(double v1, double v2, int scale) {
        return 0.0;
    }
    
    /**
     * 提供精确的除法运算
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 保留scale 位小数
     * @return 两个参数的商
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String div(@org.jetbrains.annotations.Nullable
    java.lang.String v1, @org.jetbrains.annotations.Nullable
    java.lang.String v2, int scale) {
        return null;
    }
    
    /**
     * 提供精确的小数位处理
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v     需要四舍五入的数字
     * @param scale 保留scale 位小数
     * @return 四舍五入后的结果
     */
    public final double round(double v, int scale) {
        return 0.0;
    }
    
    /**
     * 提供精确的小数位处理
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v     需要四舍五入的数字
     * @param scale 保留scale 位小数
     * @return 四舍五入后的结果
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String round(@org.jetbrains.annotations.NotNull
    java.lang.String v, int scale) {
        return null;
    }
    
    /**
     * 取余数
     * ROUND_HALF_UP 四舍五入
     * ROUND_FLOOR 不四舍五入
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 保留scale 位小数
     * @return 余数
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String remainder(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2, int scale) {
        return null;
    }
    
    /**
     * 比较大小
     *
     * @param v1 被比较数
     * @param v2 比较数
     * @return 如果v1 大于v2 则 返回true 否则false
     */
    public final boolean compare(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2) {
        return false;
    }
}