package com.ogh.support.webview;

/**
 * 基类 WebView
 * 备注: 使用的时候不要设置 android:scrollbars="none"，不然部分机型会显示空白
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\rR\u001c\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ogh/support/webview/BaseWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "mProgressBar", "Landroid/widget/ProgressBar;", "doFileChoose", "", "data", "Landroid/content/Intent;", "init", "saveImage", "url", "", "setProgressBar", "progressBar", "app_debug"})
public final class BaseWebView extends android.webkit.WebView {
    @org.jetbrains.annotations.Nullable
    private android.widget.ProgressBar mProgressBar;
    @org.jetbrains.annotations.Nullable
    private android.webkit.ValueCallback<android.net.Uri[]> filePathCallback;
    
    public BaseWebView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public BaseWebView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled", "JavascriptInterface"})
    public final void init(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    /**
     * 保存图片到本地
     *
     * @param url 图片地址 data:image/png;base64格式
     */
    public final void saveImage(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void doFileChoose(@org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.Nullable
    android.widget.ProgressBar progressBar) {
    }
}