package com.ogh.support.view.activity;

/**
 * 无数据显示示例
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/ogh/support/view/activity/NoDataExampleActivity;", "Lcom/ogh/frame/base/activity/BaseSwipeActivity;", "Lcom/ogh/support/databinding/LayoutHeadFootExampleBinding;", "Lcom/ogh/support/presenter/RequestErrorExamplePt;", "Lcom/ogh/frame/bean/BaseBean;", "()V", "getEmptyViewMsg", "", "init", "", "savedInstanceState", "Landroid/os/Bundle;", "onRefreshRequest", "reRequest", "requestSuccess", "data", "tag", "", "pageIndex", "", "pageCount", "setPresenter", "app_debug"})
public final class NoDataExampleActivity extends com.ogh.frame.base.activity.BaseSwipeActivity<com.ogh.support.databinding.LayoutHeadFootExampleBinding, com.ogh.support.presenter.RequestErrorExamplePt, com.ogh.frame.bean.BaseBean> {
    
    public NoDataExampleActivity() {
        super();
    }
    
    @java.lang.Override
    public void onRefreshRequest() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ogh.support.presenter.RequestErrorExamplePt setPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void reRequest() {
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getEmptyViewMsg() {
        return null;
    }
    
    @java.lang.Override
    public void requestSuccess(@org.jetbrains.annotations.NotNull
    com.ogh.frame.bean.BaseBean data, @org.jetbrains.annotations.NotNull
    java.lang.Object tag, int pageIndex, int pageCount) {
    }
}