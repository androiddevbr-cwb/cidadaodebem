package com.cwb.androiddevbr.cidadaodebem.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {

    abstract val viewModel: BaseViewModel
    abstract val fragmentLayout: Int
    //Nessario para o replace de fagmentos funcionar com ofuscação de código.
    abstract val fragmentTag:String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        return inflater.inflate(fragmentLayout,container, false)
    }
}