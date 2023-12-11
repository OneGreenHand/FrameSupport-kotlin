package com.ogh.support.view.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.LoadMoreModule
import com.ogh.frame.base.BaseQuickHolder
import com.ogh.support.R
import com.ogh.support.bean.WenZhangBean2


class ExampleAdapter : BaseQuickAdapter<WenZhangBean2.DataBean.DatasBean, BaseQuickHolder>(R.layout.item_common), LoadMoreModule {

    override fun convert(holder: BaseQuickHolder, item: WenZhangBean2.DataBean.DatasBean) {
        holder.setText(R.id.item_content, item.title)
    }
}