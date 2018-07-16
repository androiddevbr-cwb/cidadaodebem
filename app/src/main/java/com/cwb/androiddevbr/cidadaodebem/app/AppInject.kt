package com.cwb.androiddevbr.cidadaodebem.app

import android.content.Context
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseViewModel
import com.cwb.androiddevbr.cidadaodebem.ui.main.MainViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

object AppInject {

    private const val CONTEXT = "applicationContext"

    fun modules() : List<Module> = listOf(
            applicationModule,
            viewModelModule,
            repositoriesModule
    )

    private val applicationModule: Module = applicationContext {
        bean(CONTEXT) { App.instance!! as Context }
    }

    private val viewModelModule = applicationContext {
        viewModel { BaseViewModel() }
        viewModel { MainViewModel() }

    }

    private val repositoriesModule: Module = applicationContext {
        //bean { MyRepository( restApi = get()) }
    }
}