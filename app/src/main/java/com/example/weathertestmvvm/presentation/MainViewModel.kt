package com.example.weathertestmvvm.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathertestmvvm.data.repository.GetWeatherRepositoryImpl
import com.example.weathertestmvvm.domain.models.Weather
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository
import com.example.weathertestmvvm.domain.usecase.GetWeatherUseCase

class MainViewModel(
    private val getWeatherRepository: GetWeatherRepository = GetWeatherRepositoryImpl()
) : ViewModel() {

    private val _weatherVM = MutableLiveData<String>()
    val weatherVM = _weatherVM

    fun getWeather() {
        _weatherVM.value = getWeatherRepository.getWeather().city
    }
}