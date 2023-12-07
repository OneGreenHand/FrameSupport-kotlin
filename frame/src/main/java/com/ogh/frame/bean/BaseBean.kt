package com.ogh.frame.bean

open class BaseBean {
    var code = 0
    var msg = ""

    //判断数据是否为空(详情请看BaseModel)
   open fun isEmpty() = false
}