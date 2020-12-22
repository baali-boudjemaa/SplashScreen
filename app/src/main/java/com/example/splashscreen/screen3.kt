package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen3)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@screen3, screen4::class.java))
            finish()
        }, 2 * 1000)
    }
}