package com.example.celciuswarehouse.domain.repository

import com.example.celciuswarehouse.domain.base.BaseRepository
import com.example.celciuswarehouse.network.AuthApi

class AuthRepository(
    private val api: AuthApi
) : BaseRepository() {

    suspend fun login (
        email : String,
        password : String
    )  = safeApiCall{
        api.login(email, password)

    }
}