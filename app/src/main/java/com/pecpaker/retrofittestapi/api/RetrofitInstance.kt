package com.pecpaker.retrofittestapi.api

import com.pecpaker.retrofittestapi.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val API: ApiTest by lazy {
        retrofit.create(ApiTest::class.java)
    }
}