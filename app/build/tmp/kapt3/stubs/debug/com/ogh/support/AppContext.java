package com.ogh.support;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/ogh/support/AppContext;", "Lcom/ogh/frame/FrameApplication;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "app_debug"})
public final class AppContext extends com.ogh.frame.FrameApplication {
    
    public AppContext() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    /**
     * 不改变onCreate()方法中的业务逻辑
     */
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable
    android.content.Context base) {
    }
}