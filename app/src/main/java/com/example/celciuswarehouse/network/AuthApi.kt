package com.example.celciuswarehouse.network

import com.example.celciuswarehouse.model.response.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApi {

    @FormUrlEncoded
    @POST("api/customer/login")
    suspend fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ): LoginResponse
}