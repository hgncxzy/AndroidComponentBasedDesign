package com.xzy.demo.feature

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View

import com.xzy.demo.base.BaseFragment
import com.xzy.demo.core.jumpToOtherModule

import kotlinx.android.synthetic.main.fragment_feature2.*

class FeatureTwoFragment : BaseFragment(R.layout.fragment_feature2) {

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = "feature module - fragment2"
        title.setOnClickListener {
            // 由于 feature 模块无法包含 app 模块（不能循环依赖），因此采用深度链接形式跳转
            jumpToOtherModule(requireActivity(), "http://www.xzy.com/app/home")
            // 下面这种方式是找不到目标页面的
            /*val ft = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.container, MainFragment())
            ft.commit()*/
        }
    }
}