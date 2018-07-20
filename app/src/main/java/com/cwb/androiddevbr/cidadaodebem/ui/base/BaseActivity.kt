package com.cwb.androiddevbr.cidadaodebem.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    abstract val viewModel: BaseViewModel
    abstract val activityLayout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityLayout)
    }
}