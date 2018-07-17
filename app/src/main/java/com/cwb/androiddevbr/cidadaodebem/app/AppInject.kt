package com.cwb.androiddevbr.cidadaodebem.app

import android.content.Context
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseViewModel
import com.cwb.androiddevbr.cidadaodebem.ui.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import org.koin.dsl.module.module

object AppInject {

    private const val CONTEXT = "applicationContext"

    fun modules() : List<Module> = listOf(
            applicationModule,
            viewModelModule,
            repositoriesModule
    )

    private val applicationModule: Module = module {
        single(CONTEXT) { App.instance!! as Context }
    }

    private val viewModelModule = module {
        viewModel { BaseViewModel() }
        viewModel { MainViewModel() }

    }

    private val repositoriesModule: Module = module {
        //bean { MyRepository( restApi = get()) }
    }
}