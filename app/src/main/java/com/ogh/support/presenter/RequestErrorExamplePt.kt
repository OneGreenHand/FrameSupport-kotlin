package com.ogh.support.presenter

import com.ogh.frame.base.BaseModel
import com.ogh.frame.base.BasePresenter
import com.ogh.support.api.API
import com.ogh.support.bean.DuanZiBean
import com.ogh.support.view.activity.NoDataExampleActivity


class RequestErrorExamplePt(activity: NoDataExampleActivity) : BasePresenter<NoDataExampleActivity>(activity) {
    /**
     * 获取段子
     */
    fun personalizedSignature() {
            createRequestBuilder()
                .setLoadStyle(BaseModel.LoadStyle.DIALOG_VIEW)
                .create()
                .get(API.GET_DUAN_ZI + "?page=999&count=10&type=text", DuanZiBean::class.java)
        }
}