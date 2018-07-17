package com.cwb.androiddevbr.cidadaodebem.ui.main

import androidx.lifecycle.MutableLiveData
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseViewModel

class MainViewModel :BaseViewModel(){

    val mutableLiveData  = MutableLiveData<String>().apply {
        value = "uhull"
    }

}