package com.example.starwars.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {
    const val BASE_URL = "https://swapi.dev/" //siempre debe terminar en diagonal
    const val LOGTAG = "LOGS"

    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }

}