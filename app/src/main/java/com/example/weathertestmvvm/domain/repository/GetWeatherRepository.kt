package com.example.weathertestmvvm.domain.repository

import com.example.weathertestmvvm.domain.models.Weather

interface GetWeatherRepository {

    fun getWeather(): Weather
}