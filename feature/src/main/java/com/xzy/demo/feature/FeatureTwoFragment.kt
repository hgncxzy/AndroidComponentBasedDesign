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
            jumpToOtherModule(requireActivity(), "http://www.xzy.com/app/home")
        }
    }

}