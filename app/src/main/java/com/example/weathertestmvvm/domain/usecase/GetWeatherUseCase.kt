package com.example.weathertestmvvm.domain.usecase

import com.example.weathertestmvvm.domain.models.Weather
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository

class GetWeatherUseCase(private val getWeatherRepository: GetWeatherRepository) {

    fun execute(): Weather{
        return getWeatherRepository.getWeather()
    }
}