package com.example.weathertestmvvm.data.repository

import com.example.weathertestmvvm.data.remoterequest.RemoteRequestWeatherRepository
import com.example.weathertestmvvm.domain.models.Weather
import com.example.weathertestmvvm.domain.repository.GetWeatherRepository

class GetWeatherRepositoryImpl(private val remoteRequest: RemoteRequestWeatherRepository): GetWeatherRepository {

    override fun getWeatherRetrofit(): Weather {
        val result = remoteRequest.getWeatherFromServer(lat = 62.020, lon = 129.43)
        return Weather(result[0], 23, result[1].toDouble(), result[2].toDouble())
    }
}