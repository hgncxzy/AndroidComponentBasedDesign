package com.xzy.demo.feature

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View

import com.xzy.demo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_feature1.*

class FeatureOneFragment : BaseFragment(R.layout.fragment_feature1) {

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = "feature module - fragment1"
        title.setOnClickListener {
            val ft = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.container, FeatureTwoFragment())
            ft.commit()
        }
    }

}