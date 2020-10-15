package com.xzy.demo.core

import android.app.Activity
import android.content.Intent
import android.net.Uri

fun jumpToOtherModule(activity:Activity?,uri: String) {
    val intent = Intent()
    intent.data = Uri.parse(uri)
    intent.setPackage(activity?.packageName)
    activity?.startActivity(intent)
}