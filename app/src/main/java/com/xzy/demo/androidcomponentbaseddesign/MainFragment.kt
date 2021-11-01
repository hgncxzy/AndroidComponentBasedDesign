package com.xzy.demo.androidcomponentbaseddesign

import android.os.Bundle
import android.view.View
import com.xzy.demo.base.BaseFragment
import com.xzy.demo.feature.FeatureOneFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnInclude.setOnClickListener {
            // 深度连接的跳转目标需要是activity，使用下面的方式跳转会有问题
            // jumpToOtherModule(requireActivity(), "http://www.xzy.com/app/feature/a")
            // app module 包含 feature 模块，使用下面的方式跳转没有有问题
            val ft = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(com.xzy.demo.feature.R.id.container, FeatureOneFragment())
            ft.commit()
        }
    }
}