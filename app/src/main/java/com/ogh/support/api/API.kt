package com.ogh.support.api

import com.ogh.frame.config.BaseConfig

object API {
    private val BASE_URL = BaseConfig.getUrl() //接口统一请求地址
    var GET_DUAN_ZI = BASE_URL + "getJoke" //获取段子  //https://api.apiopen.top/getJoke?page=2&count=2&type=text
}