package com.example.weathertestmvvm.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathertestmvvm.data.repository.GetWeatherRepositoryImpl
import com.example.weathertestmvvm.domain.models.Weather
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository
import com.example.weathertestmvvm.domain.usecase.GetWeatherUseCase

class MainViewModel() : ViewModel() {

    private val getWeatherRepository: GetWeatherRepository = GetWeatherRepositoryImpl()
    private val getWeatherUseCase: GetWeatherUseCase = GetWeatherUseCase(getWeatherRepository)

    private val _weatherVM = MutableLiveData<String>()
    val weatherVM = _weatherVM

    fun getWeather() {
        _weatherVM.value = getWeatherUseCase.execute().city
    }
}