package com.ogh.support.util;

/**
 * 通用工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\nJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n\u00a8\u0006&"}, d2 = {"Lcom/ogh/support/util/CommonUtil;", "", "()V", "checkGpsIsOpen", "", "mContext", "Landroid/content/Context;", "compareVersion", "", "version1", "", "version2", "contactQQ", "", "context", "qq", "getFirstHindName", "name", "getPermissions", "tips", "intentToBrowsable", "url", "intentToOpenGps", "activity", "Landroid/app/Activity;", "requestCode", "notificationAuthority", "setBackgroundAlpha", "bgAlpha", "", "setHtmlColor", "Landroid/text/Spanned;", "string", "setHtmlColor2", "setTingEmail", "email", "setTingPhone", "phone", "app_debug"})
public final class CommonUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.CommonUtil INSTANCE = null;
    
    private CommonUtil() {
        super();
    }
    
    /**
     * 请求权限弹框
     */
    public final void getPermissions(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String tips) {
    }
    
    /**
     * 请求打开通知权限
     */
    public final boolean notificationAuthority(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    /**
     * 设置支持html标签
     * String s = "<font color='#999999'>温馨提示</font>";
     */
    @org.jetbrains.annotations.NotNull
    public final android.text.Spanned setHtmlColor(@org.jetbrains.annotations.Nullable
    java.lang.String string) {
        return null;
    }
    
    /**
     * 设置支持html标签（额外支持文字大小、删除线,单位为px）
     * String s = "<font color='#999999' size='20px'>温馨提示</font>";
     */
    @org.jetbrains.annotations.NotNull
    public final android.text.Spanned setHtmlColor2(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
    
    /**
     * 版本号比较(versionName对比方式)
     *
     * @return 0代表相等，1代表version1大于version2，-1代表version1小于version2
     */
    public final int compareVersion(@org.jetbrains.annotations.NotNull
    java.lang.String version1, @org.jetbrains.annotations.NotNull
    java.lang.String version2) {
        return 0;
    }
    
    /**
     * 手机号用****号隐藏中间数字
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setTingPhone(@org.jetbrains.annotations.NotNull
    java.lang.String phone) {
        return null;
    }
    
    /**
     * 第一个汉字用*代替
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstHindName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    /**
     * 邮箱用****号隐藏前面的字母
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String setTingEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    /**
     * 设置页面的透明度
     *
     * @param bgAlpha 1表示不透明
     */
    public final void setBackgroundAlpha(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, float bgAlpha) {
    }
    
    public final void intentToBrowsable(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    /**
     * 跳转QQ
     */
    public final void contactQQ(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String qq) {
    }
    
    public final boolean checkGpsIsOpen(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        return false;
    }
    
    public final void intentToOpenGps(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, int requestCode) {
    }
}