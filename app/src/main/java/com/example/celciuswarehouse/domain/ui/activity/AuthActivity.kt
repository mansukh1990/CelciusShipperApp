package com.example.celciuswarehouse.domain.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.celciuswarehouse.R
import dagger.hilt.android.AndroidEntryPoint

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}