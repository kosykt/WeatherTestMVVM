package com.example.weathertestmvvm.domain.usecase

import com.example.weathertestmvvm.domain.models.WeatherModel
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository

class GetWeatherUseCase(private val getWeatherRepository: GetWeatherRepository) {

    fun execute(): WeatherModel{
        return getWeatherRepository.getWeather()
    }
}