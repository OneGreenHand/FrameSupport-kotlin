package com.ogh.support.presenter

import com.ogh.frame.base.BaseModel
import com.ogh.frame.base.BasePresenter
import com.ogh.support.api.API
import com.ogh.support.bean.DuanZiBean
import com.ogh.support.view.activity.RefreshRequestActivity

class RefreshRequestPt(activity: RefreshRequestActivity) : BasePresenter<RefreshRequestActivity>(activity) {
    /**
     * 获取段子
     */
    fun getDuanZiList(page: Int) {
        createRequestBuilder()
            .setLoadStyle(if (page == 1) BaseModel.LoadStyle.DIALOG else BaseModel.LoadStyle.NONE)
            .setPageIndex(page)
            .putParam("type", "text")
            .putParam("page", page)
            .putParam("count", "15")
            .create()
            .post(API.GET_DUAN_ZI, DuanZiBean::class.java)
    }
}