package com.example.celciuswarehouse.model.response

data class LoginResponse(
    val `data`: Data,
    val response: String,
    val responseCode: Int,
    val status: String
)