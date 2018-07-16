package com.cwb.androiddevbr.cidadaodebem.ui.base

import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.Toolbar
import android.widget.FrameLayout

abstract class BaseFragmentActivity: BaseActivity(){

    abstract val container: FrameLayout
    abstract val toolbar : Toolbar

    private val fragmentTransaction : FragmentTransaction
        get() = supportFragmentManager.beginTransaction()

    fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    fun setDisplayHomeAsUpEnabled() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun replaceFragment(fragment: BaseFragment) {
        if(supportFragmentManager.findFragmentByTag(fragment.fragmentTag) == null){
            val ft = fragmentTransaction
            ft.replace(container.id, fragment, fragment.fragmentTag)
            ft.commit()
        }
    }

    fun replaceAndBackStackFragment(fragment: BaseFragment) {
        if(supportFragmentManager.findFragmentByTag(fragment.fragmentTag) == null){
            val ft = fragmentTransaction
            ft.replace(container.id, fragment, fragment.fragmentTag)
            ft.addToBackStack(fragment.fragmentTag)
            ft.commit()
        }
    }
}