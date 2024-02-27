package com.example.celciuswarehouse.model.request

data class LoginRequest (
    val password: String,
    val appVersion: String,
    val email: String
)
