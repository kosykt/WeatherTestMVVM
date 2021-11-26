package com.example.weathertestmvvm.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathertestmvvm.data.remoterequest.retrofit.RetrofitRequestWeatherRepositoryImpl
import com.example.weathertestmvvm.data.repository.GetWeatherRepositoryImpl
import com.example.weathertestmvvm.domain.usecase.GetWeatherUseCase

class MainViewModel() : ViewModel() {

    private val retrofitRequestWeatherRepositoryImpl = RetrofitRequestWeatherRepositoryImpl()
    private val getWeatherRepositoryImpl = GetWeatherRepositoryImpl(retrofitRequestWeatherRepositoryImpl)
    private val getWeatherUseCase: GetWeatherUseCase = GetWeatherUseCase(getWeatherRepositoryImpl)

    private val _weatherVM = MutableLiveData<String>()
    val weatherVM = _weatherVM

    fun getWeather() {
        _weatherVM.value = getWeatherUseCase.execute().city
    }
}