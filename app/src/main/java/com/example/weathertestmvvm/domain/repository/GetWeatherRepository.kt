package com.example.weathertestmvvm.domain.repository

import com.example.weathertestmvvm.domain.models.WeatherModel

interface GetWeatherRepository {

    fun getWeather(): WeatherModel
}