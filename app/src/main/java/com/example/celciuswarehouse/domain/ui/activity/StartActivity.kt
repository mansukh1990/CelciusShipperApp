package com.example.celciuswarehouse.domain.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.celciuswarehouse.R
import dagger.hilt.android.AndroidEntryPoint

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        finish()
        startActivity(Intent(this,AuthActivity::class.java))
    }
}