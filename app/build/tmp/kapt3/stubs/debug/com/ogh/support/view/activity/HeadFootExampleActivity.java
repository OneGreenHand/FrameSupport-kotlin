package com.ogh.support.view.activity;

/**
 * 添加头部和脚部的示例(带下拉刷新上拉加载)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0016J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ogh/support/view/activity/HeadFootExampleActivity;", "Lcom/ogh/frame/base/activity/BaseSwipeActivity;", "Lcom/ogh/support/databinding/LayoutHeadFootExampleBinding;", "Lcom/ogh/support/presenter/HeadFootExamplePt;", "Lcom/ogh/frame/bean/BaseBean;", "()V", "adapter", "Lcom/ogh/support/view/adapter/ExampleAdapter;", "init", "", "savedInstanceState", "Landroid/os/Bundle;", "initHeadFootView", "onRefreshRequest", "requestSuccess", "data", "tag", "", "pageIndex", "", "pageCount", "setPresenter", "app_debug"})
public final class HeadFootExampleActivity extends com.ogh.frame.base.activity.BaseSwipeActivity<com.ogh.support.databinding.LayoutHeadFootExampleBinding, com.ogh.support.presenter.HeadFootExamplePt, com.ogh.frame.bean.BaseBean> {
    private com.ogh.support.view.adapter.ExampleAdapter adapter;
    
    public HeadFootExampleActivity() {
        super();
    }
    
    @java.lang.Override
    public void onRefreshRequest() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ogh.support.presenter.HeadFootExamplePt setPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 初始化头部和脚部
     */
    private final void initHeadFootView() {
    }
    
    @java.lang.Override
    public void requestSuccess(@org.jetbrains.annotations.NotNull
    com.ogh.frame.bean.BaseBean data, @org.jetbrains.annotations.NotNull
    java.lang.Object tag, int pageIndex, int pageCount) {
    }
}