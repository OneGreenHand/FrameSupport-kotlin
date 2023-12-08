package com.ogh.support.widget;

/**
 * 验证码倒计时工具类
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001CB\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010*\u001a\u00020(H\u0007J\b\u0010+\u001a\u00020(H\u0016J\u0018\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0016J(\u00103\u001a\u00020(2\u0006\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\fH\u0016J\b\u00106\u001a\u00020(H\u0016J\u0018\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020(H\u0016J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u000fH\u0016J\u0016\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020(H\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010!\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018\u00a8\u0006D"}, d2 = {"Lcom/ogh/support/widget/VerificationCode;", "Landroid/widget/TextView;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/ogh/frame/base/BaseRequestView;", "Lcom/ogh/frame/bean/BaseBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "companyText", "", "getCompanyText", "()Ljava/lang/String;", "setCompanyText", "(Ljava/lang/String;)V", "conductColor", "getConductColor", "()I", "setConductColor", "(I)V", "countDownTimer", "Landroid/os/CountDownTimer;", "durationTime", "getDurationTime", "setDurationTime", "endColor", "getEndColor", "setEndColor", "endText", "getEndText", "setEndText", "intervalTime", "getIntervalTime", "setIntervalTime", "dismissLoadingDialog", "", "initView", "onDestroy", "refreshView", "requestError", "e", "", "tag", "", "requestFail", "data", "requestSuccess", "pageIndex", "pageCount", "showEmptyView", "showLoadingDialog", "msg", "isCancel", "", "showLoadingView", "showNetErrorView", "tips", "start", "phone", "codeType", "Lcom/ogh/support/widget/VerificationCode$CodeType;", "tokenOverdue", "CodeType", "app_debug"})
@android.annotation.SuppressLint(value = {"AppCompatCustomView"})
public final class VerificationCode extends android.widget.TextView implements androidx.lifecycle.LifecycleObserver, com.ogh.frame.base.BaseRequestView<com.ogh.frame.bean.BaseBean> {
    private int conductColor = android.graphics.Color.RED;
    private int endColor = android.graphics.Color.RED;
    @org.jetbrains.annotations.NotNull
    private java.lang.String endText = "\u91cd\u65b0\u83b7\u53d6";
    @org.jetbrains.annotations.NotNull
    private java.lang.String companyText = " s";
    private int durationTime = 60000;
    private int intervalTime = 1000;
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer countDownTimer;
    
    public final int getConductColor() {
        return 0;
    }
    
    public final void setConductColor(int p0) {
    }
    
    public final int getEndColor() {
        return 0;
    }
    
    public final void setEndColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEndText() {
        return null;
    }
    
    public final void setEndText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompanyText() {
        return null;
    }
    
    public final void setCompanyText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getDurationTime() {
        return 0;
    }
    
    public final void setDurationTime(int p0) {
    }
    
    public final int getIntervalTime() {
        return 0;
    }
    
    public final void setIntervalTime(int p0) {
    }
    
    public VerificationCode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public VerificationCode(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public VerificationCode(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    /**
     * 开始倒计时
     */
    public final void start(@org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    com.ogh.support.widget.VerificationCode.CodeType codeType) {
    }
    
    /**
     * 初始化
     */
    private final void initView(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }
    
    @java.lang.Override
    public void requestSuccess(@org.jetbrains.annotations.NotNull
    com.ogh.frame.bean.BaseBean data, @org.jetbrains.annotations.NotNull
    java.lang.Object tag, int pageIndex, int pageCount) {
    }
    
    @java.lang.Override
    public void requestFail(@org.jetbrains.annotations.NotNull
    com.ogh.frame.bean.BaseBean data, @org.jetbrains.annotations.NotNull
    java.lang.Object tag) {
    }
    
    @java.lang.Override
    public void requestError(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e, @org.jetbrains.annotations.NotNull
    java.lang.Object tag) {
    }
    
    @java.lang.Override
    public void showLoadingView() {
    }
    
    @java.lang.Override
    public void showEmptyView() {
    }
    
    @java.lang.Override
    public void showNetErrorView(@org.jetbrains.annotations.NotNull
    java.lang.String tips) {
    }
    
    @java.lang.Override
    public void refreshView() {
    }
    
    @java.lang.Override
    public void tokenOverdue() {
    }
    
    @java.lang.Override
    public void showLoadingDialog(@org.jetbrains.annotations.NotNull
    java.lang.String msg, boolean isCancel) {
    }
    
    @java.lang.Override
    public void dismissLoadingDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/ogh/support/widget/VerificationCode$CodeType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LOGIN", "REGISTER", "app_debug"})
    public static enum CodeType {
        /*public static final*/ LOGIN /* = new LOGIN(0) */,
        /*public static final*/ REGISTER /* = new REGISTER(0) */;
        private final int value = 0;
        
        CodeType(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.ogh.support.widget.VerificationCode.CodeType> getEntries() {
            return null;
        }
    }
}