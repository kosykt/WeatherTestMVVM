package com.example.weathertestmvvm.domain.models

data class WeatherModel(val city: String,
                        val temperature: Int,
                        val lat: Double,
                        val lon: Double)