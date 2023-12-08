package com.ogh.support.presenter

import com.ogh.frame.base.BaseModel
import com.ogh.frame.base.BasePresenter
import com.ogh.support.api.API
import com.ogh.support.bean.WenZhangBean
import com.ogh.support.view.activity.RefreshRequestActivity

class RefreshRequestPt(activity: RefreshRequestActivity) : BasePresenter<RefreshRequestActivity>(activity) {
    /**
     * 首页文章列表
     */
    fun getWenZhangList(page: Int) {
        createRequestBuilder()
            .setLoadStyle(if (page == 0) BaseModel.LoadStyle.DIALOG else BaseModel.LoadStyle.NONE)
            .setPageIndex(page)
            .create()
            .get(API.GET_WEN_ZHANG+ "/$page/json?page_size=15", WenZhangBean::class.java)
    }
}