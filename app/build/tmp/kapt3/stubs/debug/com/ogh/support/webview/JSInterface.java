package com.ogh.support.webview;

/**
 * 备注: 在这里面的方法都是子线程
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ogh/support/webview/JSInterface;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mHandler", "Landroid/os/Handler;", "doFinish", "", "getChannel", "", "getDeviceId", "getManufacturer", "getOSVersion", "getVersion", "showDialog", "title", "msg", "showToast", "app_debug"})
public final class JSInterface {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler mHandler = null;
    
    public JSInterface(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChannel() {
        return null;
    }
    
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return null;
    }
    
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOSVersion() {
        return null;
    }
    
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getManufacturer() {
        return null;
    }
    
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    @android.webkit.JavascriptInterface
    public final void showToast(@org.jetbrains.annotations.Nullable
    java.lang.String msg) {
    }
    
    @android.webkit.JavascriptInterface
    public final void showDialog(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @android.webkit.JavascriptInterface
    public final void doFinish() {
    }
}