package com.pecpaker.retrofittestapi.repository

import com.pecpaker.retrofittestapi.api.RetrofitInstance
import com.pecpaker.retrofittestapi.model.Latum

class Repository {
    suspend fun getLatum(): Latum{
        return RetrofitInstance.API.getLatum()
    }
}