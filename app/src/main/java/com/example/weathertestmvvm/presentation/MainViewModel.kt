package com.example.weathertestmvvm.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _testVM = MutableLiveData<String>()
    val testVM = _testVM

    init {
        _testVM.value = "test view model"
    }

    fun changeData(){
        _testVM.value = "test change"
    }
}