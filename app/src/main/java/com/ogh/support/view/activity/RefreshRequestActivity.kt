package com.ogh.support.view.activity

import android.os.Bundle
import com.chad.library.adapter.base.BaseQuickAdapter
import com.ogh.frame.base.BaseQuickHolder
import com.ogh.frame.base.activity.BaseSwipeListActivity
import com.ogh.frame.bean.BaseBean
import com.ogh.support.bean.DuanZiBean
import com.ogh.support.databinding.LayoutHeadFootExampleBinding
import com.ogh.support.presenter.RefreshRequestPt
import com.ogh.support.view.adapter.ExampleAdapter

/**
 * 上拉刷新和下拉加载
 */
class RefreshRequestActivity : BaseSwipeListActivity<LayoutHeadFootExampleBinding, RefreshRequestPt, BaseBean, DuanZiBean.ResultBean>() {

    override fun setAdapter(): BaseQuickAdapter<DuanZiBean.ResultBean, BaseQuickHolder> {
        return ExampleAdapter()
    }

    override fun userAdapterEmpty(): Boolean {
        return true
    }

    override fun loadMoreListRequest(page: Int) {
        mPresenter.getDuanZiList(page)
    }

    override fun onRefreshRequest() {
        mPresenter.getDuanZiList(1)
    }

    override fun setPresenter(): RefreshRequestPt {
        return RefreshRequestPt(this)
    }

    override fun init(savedInstanceState: Bundle?) {
        viewBinding.titlebar.setTitle("下拉刷新上拉加载示例")
        mPresenter.getDuanZiList(1)
    }

    override fun requestSuccess(data: BaseBean, tag: Any, pageIndex: Int, pageCount: Int) {
        val duanZiBean: DuanZiBean = data as DuanZiBean
        notifyAdapterStatus(duanZiBean.result, pageIndex, pageCount)
    }
}