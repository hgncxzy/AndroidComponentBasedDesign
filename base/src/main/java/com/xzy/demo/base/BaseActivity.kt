package com.xzy.demo.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(@LayoutRes private val layoutId: Int) : AppCompatActivity(layoutId)
