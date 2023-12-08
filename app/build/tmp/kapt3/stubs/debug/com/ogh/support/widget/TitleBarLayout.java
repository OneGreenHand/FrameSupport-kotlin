package com.ogh.support.widget;

/**
 * @describe 通用标题栏
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010#\u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010$\u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\rJ\u000e\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0018J\u000e\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0018R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/ogh/support/widget/TitleBarLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backImage", "backShow", "", "clickListener", "Lcom/ogh/frame/util/CustomClickListener;", "mBackgroundColor", "otherText", "Landroid/widget/TextView;", "getOtherText", "()Landroid/widget/TextView;", "setOtherText", "(Landroid/widget/TextView;)V", "rText", "", "rTextColor", "rTextIsShow", "tText", "tTextColor", "titleText", "getTitleText", "setTitleText", "findId", "", "initView", "setOnBackListener", "setOnRightListener", "setRightIsShow", "isShow", "setRightTitle", "str", "setTitle", "BackClickListener", "app_debug"})
public final class TitleBarLayout extends android.widget.LinearLayout {
    private int mBackgroundColor = android.graphics.Color.WHITE;
    private int backImage = com.ogh.support.R.mipmap.back_black;
    private boolean backShow = true;
    @org.jetbrains.annotations.Nullable
    private java.lang.String tText;
    private int tTextColor = android.graphics.Color.BLACK;
    private boolean rTextIsShow = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String rText;
    private int rTextColor = android.graphics.Color.BLACK;
    public android.widget.TextView titleText;
    public android.widget.TextView otherText;
    @org.jetbrains.annotations.Nullable
    private com.ogh.frame.util.CustomClickListener clickListener;
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTitleText() {
        return null;
    }
    
    public final void setTitleText(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getOtherText() {
        return null;
    }
    
    public final void setOtherText(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    public TitleBarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public TitleBarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TitleBarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void initView(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void findId() {
    }
    
    public final void setOnBackListener(@org.jetbrains.annotations.Nullable
    com.ogh.frame.util.CustomClickListener clickListener) {
    }
    
    public final void setOnRightListener(@org.jetbrains.annotations.Nullable
    com.ogh.frame.util.CustomClickListener clickListener) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
    }
    
    public final void setRightTitle(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
    }
    
    public final void setRightIsShow(boolean isShow) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ogh/support/widget/TitleBarLayout$BackClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface BackClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view);
    }
}