package com.ogh.support.view.fragment

import android.os.Bundle
import android.view.View
import com.ogh.frame.base.fragment.BaseFragment
import com.ogh.support.databinding.FragmentMineBinding
import com.ogh.support.util.IntentUtil
import com.ogh.support.view.activity.HeadFootExampleActivity
import com.ogh.support.view.activity.NoDataExampleActivity
import com.ogh.support.view.activity.RefreshRequestActivity

class MineFragment : BaseFragment<FragmentMineBinding>() {

    override fun init(savedInstanceState: Bundle?) {
        setViewClicked()
    }

    private fun setViewClicked() {
        viewBinding.exampleOne.setOnClickListener(View.OnClickListener {
            IntentUtil.goActivity(mActivity, NoDataExampleActivity::class.java)
        })
        viewBinding.exampleTwo.setOnClickListener(View.OnClickListener {
            IntentUtil.goActivity(mActivity, HeadFootExampleActivity::class.java)
        })
        viewBinding.exampleThree.setOnClickListener(View.OnClickListener {
            IntentUtil.goActivity(mActivity, RefreshRequestActivity::class.java)
        })
    }
}