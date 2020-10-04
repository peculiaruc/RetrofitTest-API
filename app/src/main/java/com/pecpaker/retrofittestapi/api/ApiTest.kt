package com.pecpaker.retrofittestapi.api

import com.pecpaker.retrofittestapi.model.Latum
import retrofit2.http.GET

interface ApiTest{
    @GET("post/1")
    suspend fun getLatum(): Latum
}