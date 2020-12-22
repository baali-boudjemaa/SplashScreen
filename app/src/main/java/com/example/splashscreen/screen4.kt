package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen4)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@screen4, MainActivity::class.java))
            finish()
        }, 2* 1000)
    }

}