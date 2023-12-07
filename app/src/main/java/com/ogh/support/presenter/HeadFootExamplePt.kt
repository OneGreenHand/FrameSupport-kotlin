package com.ogh.support.presenter

import com.ogh.frame.base.BaseModel
import com.ogh.frame.base.BasePresenter
import com.ogh.support.api.API
import com.ogh.support.bean.DuanZiBean
import com.ogh.support.view.activity.HeadFootExampleActivity

class HeadFootExamplePt(activity: HeadFootExampleActivity) : BasePresenter<HeadFootExampleActivity>(activity) {
    /**
     * 获取段子
     */
    fun duanZiList() {
        createRequestBuilder()
            .setLoadStyle(BaseModel.LoadStyle.DIALOG)
            .putParam("type", "text")
            .create()
            .post(API.GET_DUAN_ZI, DuanZiBean::class.java)
    }
}