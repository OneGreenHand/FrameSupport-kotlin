package com.ogh.support.bean

import com.ogh.frame.bean.BaseBean
import com.ogh.support.bean.DuanZiBean.ResultBean

/**
 * @describe 段子实体类
 */
class DuanZiBean : BaseBean() {
    var message: String? = null
    var result: List<ResultBean>? = null

    override fun isEmpty(): Boolean {
        return result == null || result!!.isEmpty()
    }

    class ResultBean {
        var sid: String? = null
        var text: String? = null
        var type: String? = null
        var thumbnail: String? = null
        var video: String? = null
        var images: String? = null
        var up: String? = null
        var down: String? = null
        var forward: String? = null
        var comment: String? = null
        var uid: String? = null
        var name: String? = null
        var header: String? = null
        var top_comments_content: String? = null
        var top_comments_voiceuri: String? = null
        var top_comments_uid: String? = null
        var top_comments_name: String? = null
        var top_comments_header: String? = null
        var passtime: String? = null
    }
}