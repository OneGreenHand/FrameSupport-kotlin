package com.ogh.frame.base

import com.ogh.frame.bean.BaseBean

interface BaseRequestView<B : BaseBean> : BaseView {
    fun requestSuccess(data: B, tag: Any, pageIndex: Int, pageCount: Int)
    fun requestFail(data: B, tag: Any)
    fun requestError(e: Throwable, tag: Any)
    fun showLoadingView()
    fun showEmptyView()
    fun showNetErrorView(tips: String)
    fun refreshView()
    fun tokenOverdue()
}