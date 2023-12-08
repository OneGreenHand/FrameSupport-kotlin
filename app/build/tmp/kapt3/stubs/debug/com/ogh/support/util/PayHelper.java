package com.ogh.support.util;

/**
 * @describe 支付工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ogh/support/util/PayHelper;", "", "()V", "SDK_PAY_FLAG", "", "mHandler", "Landroid/os/Handler;", "mIPayListener", "Lcom/ogh/support/util/PayHelper$IPayListener;", "wxapi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "aliPay", "", "activity", "Landroid/app/Activity;", "orderInfo", "", "setIPayListener", "wexPay", "result", "Lcom/ogh/support/bean/WXResult;", "Companion", "IPayListener", "app_debug"})
public final class PayHelper {
    @org.jetbrains.annotations.Nullable
    private static com.ogh.support.util.PayHelper mPayHelper;
    
    /**
     * ******************************微信支付
     */
    @org.jetbrains.annotations.Nullable
    private com.tencent.mm.opensdk.openapi.IWXAPI wxapi;
    
    /**
     * ******************************支付宝支付
     */
    private final int SDK_PAY_FLAG = 1;
    @android.annotation.SuppressLint(value = {"HandlerLeak"})
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler mHandler = null;
    @org.jetbrains.annotations.Nullable
    private com.ogh.support.util.PayHelper.IPayListener mIPayListener;
    @org.jetbrains.annotations.NotNull
    public static final com.ogh.support.util.PayHelper.Companion Companion = null;
    
    private PayHelper() {
        super();
    }
    
    public final void wexPay(@org.jetbrains.annotations.Nullable
    com.ogh.support.bean.WXResult result) {
    }
    
    public final void aliPay(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String orderInfo, @org.jetbrains.annotations.Nullable
    com.ogh.support.util.PayHelper.IPayListener mIPayListener) {
    }
    
    public final void setIPayListener(@org.jetbrains.annotations.NotNull
    com.ogh.support.util.PayHelper.IPayListener mIPayListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ogh/support/util/PayHelper$Companion;", "", "()V", "mPayHelper", "Lcom/ogh/support/util/PayHelper;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ogh.support.util.PayHelper getInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ogh/support/util/PayHelper$IPayListener;", "", "onFail", "", "resultInfo", "", "onSuccess", "app_debug"})
    public static abstract interface IPayListener {
        
        public abstract void onSuccess(@org.jetbrains.annotations.Nullable
        java.lang.String resultInfo);
        
        public abstract void onFail(@org.jetbrains.annotations.Nullable
        java.lang.String resultInfo);
    }
}