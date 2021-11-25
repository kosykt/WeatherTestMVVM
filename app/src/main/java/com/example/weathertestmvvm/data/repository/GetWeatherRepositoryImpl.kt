package com.example.weathertestmvvm.data.repository

import com.example.weathertestmvvm.domain.models.Weather
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository

class GetWeatherRepositoryImpl: GetWeatherRepository {

    override fun getWeather(): Weather {
        return Weather("Test", "123")
    }
}