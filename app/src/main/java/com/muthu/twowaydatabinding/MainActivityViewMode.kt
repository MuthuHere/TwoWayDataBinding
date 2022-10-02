package com.muthu.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewMode : ViewModel() {

    var name = MutableLiveData<String>()

    init {
        name.value = "Muthu"
    }
}