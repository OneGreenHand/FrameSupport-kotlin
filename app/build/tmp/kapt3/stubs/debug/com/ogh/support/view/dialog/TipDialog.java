package com.ogh.support.view.dialog;

/**
 * 通用提示框
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002*+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010\u000f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010\u0019\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006,"}, d2 = {"Lcom/ogh/support/view/dialog/TipDialog;", "Lcom/ogh/frame/base/BaseDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancel", "Landroid/widget/TextView;", "getCancel", "()Landroid/widget/TextView;", "setCancel", "(Landroid/widget/TextView;)V", "cancelCalk", "Lcom/ogh/support/view/dialog/TipDialog$CancelCalk;", "content", "getContent", "setContent", "listener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "sure", "getSure", "setSure", "sureCalk", "Lcom/ogh/support/view/dialog/TipDialog$SureCalk;", "title", "getTitle", "setTitle", "getLayoutID", "", "initView", "", "canCancel", "", "setCancelColorText", "msg", "", "setCancelText", "setColorContent", "setColorTitle", "setOnCancelClick", "setOnSureClick", "setSureColorText", "setSureText", "CancelCalk", "SureCalk", "app_debug"})
public final class TipDialog extends com.ogh.frame.base.BaseDialog {
    public android.widget.TextView title;
    public android.widget.TextView content;
    public android.widget.TextView cancel;
    public android.widget.TextView sure;
    @org.jetbrains.annotations.Nullable
    private com.ogh.support.view.dialog.TipDialog.SureCalk sureCalk;
    @org.jetbrains.annotations.Nullable
    private com.ogh.support.view.dialog.TipDialog.CancelCalk cancelCalk;
    @org.jetbrains.annotations.NotNull
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener listener = null;
    
    public TipDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getCancel() {
        return null;
    }
    
    public final void setCancel(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getSure() {
        return null;
    }
    
    public final void setSure(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    public final void setOnSureClick(@org.jetbrains.annotations.NotNull
    com.ogh.support.view.dialog.TipDialog.SureCalk sureCalk) {
    }
    
    public final void setOnCancelClick(@org.jetbrains.annotations.NotNull
    com.ogh.support.view.dialog.TipDialog.CancelCalk sureCalk) {
    }
    
    @java.lang.Override
    public void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * 是否可以点击取消
     */
    public final void setCancel(boolean canCancel) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setColorTitle(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setColorContent(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setSureText(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setSureColorText(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setCancelText(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setCancelColorText(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @java.lang.Override
    public int getLayoutID() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ogh/support/view/dialog/TipDialog$CancelCalk;", "", "onCancelClick", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface CancelCalk {
        
        public abstract void onCancelClick(@org.jetbrains.annotations.NotNull
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ogh/support/view/dialog/TipDialog$SureCalk;", "", "onSureClick", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface SureCalk {
        
        public abstract void onSureClick(@org.jetbrains.annotations.NotNull
        android.view.View view);
    }
}