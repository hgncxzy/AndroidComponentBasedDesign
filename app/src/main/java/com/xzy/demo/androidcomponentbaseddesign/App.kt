package com.xzy.demo.androidcomponentbaseddesign

import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

internal class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }
}