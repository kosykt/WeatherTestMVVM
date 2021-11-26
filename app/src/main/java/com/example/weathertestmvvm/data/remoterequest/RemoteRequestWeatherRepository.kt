package com.example.weathertestmvvm.data.remoterequest

interface RemoteRequestWeatherRepository {

    fun getWeatherFromServer (
        lat: Double,
        lon: Double
    ): List<String>
}