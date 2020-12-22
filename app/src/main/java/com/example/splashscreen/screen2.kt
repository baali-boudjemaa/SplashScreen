package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@screen2, screen3::class.java))
            finish()
        }, 2 * 1000)
    }
}