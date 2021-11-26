package com.example.weathertestmvvm.domain.models

data class Weather(val city: String,
                   val temperature: Int,
                   val lat: Double,
                   val lon: Double)