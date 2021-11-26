package com.example.weathertestmvvm.data.remoterequest.retrofit

import com.example.weathertestmvvm.data.remoterequest.RemoteRequestWeatherRepository

class RetrofitRequestWeatherRepositoryImpl(): RemoteRequestWeatherRepository {

    override fun getWeatherFromServer(lat: Double, lon: Double): List<String> {
        return listOf("it's alive", "$lat", "$lon")
    }


}