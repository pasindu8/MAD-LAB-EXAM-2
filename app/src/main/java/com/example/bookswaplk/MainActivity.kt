package com.example.bookswaplk

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, Main1Activity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}