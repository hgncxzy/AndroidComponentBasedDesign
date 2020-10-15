package com.xzy.demo.androidcomponentbaseddesign

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.xzy.demo.base.BaseFragment
import com.xzy.demo.feature.FeatureActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnInclude.setOnClickListener {
            startActivity(Intent(requireActivity(), FeatureActivity::class.java))
           // jumpToOtherModule(requireActivity(), "http://www.xzy.com/app/feature/a")
        }
    }
}