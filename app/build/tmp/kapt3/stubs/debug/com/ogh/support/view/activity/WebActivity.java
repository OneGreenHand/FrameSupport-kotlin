package com.ogh.support.view.activity;

/**
 * 可以播放视频的WebView
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0005H\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0014J\b\u0010\u0012\u001a\u00020\u0005H\u0014J\b\u0010\u0013\u001a\u00020\u0005H\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ogh/support/view/activity/WebActivity;", "Lcom/ogh/frame/base/activity/BaseActivity;", "Lcom/ogh/support/databinding/ActivityWebBinding;", "()V", "init", "", "savedInstanceState", "Landroid/os/Bundle;", "isImmersionBarEnabled", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "onPause", "onResume", "Companion", "app_debug"})
public final class WebActivity extends com.ogh.frame.base.activity.BaseActivity<com.ogh.support.databinding.ActivityWebBinding> {
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.view.activity.WebActivity.Companion Companion = null;
    
    public WebActivity() {
        super();
    }
    
    @java.lang.Override
    public boolean isImmersionBarEnabled() {
        return false;
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    public void onBackPressed() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/ogh/support/view/activity/WebActivity$Companion;", "", "()V", "openActivity", "", "context", "Landroid/content/Context;", "isHorizontalScreen", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void openActivity(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final void openActivity(@org.jetbrains.annotations.NotNull
        android.content.Context context, boolean isHorizontalScreen) {
        }
    }
}