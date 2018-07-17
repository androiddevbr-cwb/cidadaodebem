package com.cwb.androiddevbr.cidadaodebem.ui.base

import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction

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