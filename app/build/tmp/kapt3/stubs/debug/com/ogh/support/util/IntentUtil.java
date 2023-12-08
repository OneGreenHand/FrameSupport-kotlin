package com.ogh.support.util;

/**
 * 跳转工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\fJ:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fJ6\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJB\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u0014\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/ogh/support/util/IntentUtil;", "", "()V", "goActivity", "", "context", "Landroid/content/Context;", "activity", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "ifLogin", "", "param", "", "", "goActivityForResult", "Landroid/app/Activity;", "requestCode", "", "putIntent", "intent", "Landroid/content/Intent;", "app_debug"})
public final class IntentUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.IntentUtil INSTANCE = null;
    
    private IntentUtil() {
        super();
    }
    
    public final void goActivity(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<?> activity) {
    }
    
    public final void goActivity(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<?> activity, boolean ifLogin) {
    }
    
    /**
     * 跳转activity,通过bundle方式传入数据
     */
    public final void goActivity(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<?> activity, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle, boolean ifLogin) {
    }
    
    /**
     * 跳转activity并回调,通过bundle方式传入数据
     */
    public final void goActivityForResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Class<?> activity, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle, int requestCode, boolean ifLogin) {
    }
    
    /**
     * 跳转activity,通过map方式传入数据,主要配合CommonUtil中goLocationActivity方法使用
     * 携带的数据(目前只支持 String、Boolean、Integer、Double、Long、Float、Bundle、Parcelable、Serializable)
     */
    public final void goActivity(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.Class<?> activity, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, ? extends java.lang.Object> param, boolean ifLogin) {
    }
    
    /**
     * 跳转activity并回调,通过map方式传入数据,主要配合CommonUtil中goLocationActivity方法使用
     * 携带的数据(目前只支持 String、Boolean、Integer、Double、Long、Float、Bundle、Parcelable、Serializable)
     */
    public final void goActivityForResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Class<?> activity, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, ? extends java.lang.Object> param, int requestCode, boolean ifLogin) {
    }
    
    private final void putIntent(java.util.Map<java.lang.String, ? extends java.lang.Object> param, android.content.Intent intent) {
    }
}