package com.cwb.androiddevbr.cidadaodebem.ui.main


import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseActivity
import org.koin.android.architecture.ext.viewModel

class MainActivity : BaseActivity() {

    override val viewModel: MainViewModel by viewModel()
    override val activityLayout = R.layout.activity_main

}
