package com.ogh.support.view.activity;

/**
 * 上拉刷新和下拉加载
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/ogh/support/view/activity/RefreshRequestActivity;", "Lcom/ogh/frame/base/activity/BaseSwipeListActivity;", "Lcom/ogh/support/databinding/LayoutHeadFootExampleBinding;", "Lcom/ogh/support/presenter/RefreshRequestPt;", "Lcom/ogh/frame/bean/BaseBean;", "Lcom/ogh/support/bean/WenZhangBean$DataBean$DatasBean;", "()V", "init", "", "savedInstanceState", "Landroid/os/Bundle;", "loadMoreListRequest", "page", "", "onRefreshRequest", "requestSuccess", "data", "tag", "", "pageIndex", "pageCount", "setAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/ogh/frame/base/BaseQuickHolder;", "setPresenter", "userAdapterEmpty", "", "app_debug"})
public final class RefreshRequestActivity extends com.ogh.frame.base.activity.BaseSwipeListActivity<com.ogh.support.databinding.LayoutHeadFootExampleBinding, com.ogh.support.presenter.RefreshRequestPt, com.ogh.frame.bean.BaseBean, com.ogh.support.bean.WenZhangBean.DataBean.DatasBean> {
    
    public RefreshRequestActivity() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.chad.library.adapter.base.BaseQuickAdapter<com.ogh.support.bean.WenZhangBean.DataBean.DatasBean, com.ogh.frame.base.BaseQuickHolder> setAdapter() {
        return null;
    }
    
    @java.lang.Override
    public boolean userAdapterEmpty() {
        return false;
    }
    
    @java.lang.Override
    public void loadMoreListRequest(int page) {
    }
    
    @java.lang.Override
    public void onRefreshRequest() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ogh.support.presenter.RefreshRequestPt setPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void requestSuccess(@org.jetbrains.annotations.NotNull
    com.ogh.frame.bean.BaseBean data, @org.jetbrains.annotations.NotNull
    java.lang.Object tag, int pageIndex, int pageCount) {
    }
}