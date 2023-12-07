package com.ogh.support.view.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.LoadMoreModule
import com.ogh.frame.base.BaseQuickHolder
import com.ogh.support.R
import com.ogh.support.bean.DuanZiBean


class ExampleAdapter : BaseQuickAdapter<DuanZiBean.ResultBean, BaseQuickHolder>(R.layout.item_common), LoadMoreModule {

    override fun convert(holder: BaseQuickHolder, item: DuanZiBean.ResultBean) {
        holder.setText(R.id.item_content, item.text)
    }
}