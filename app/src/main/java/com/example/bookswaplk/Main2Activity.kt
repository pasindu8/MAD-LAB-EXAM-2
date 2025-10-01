package com.example.bookswaplk

import android.os.Bundle
import android.widget.ImageView
import android.os.Handler
import android.os.Looper
import android.content.Intent
import androidx.activity.enableEdgeToEdge // It seems this import is not used. Consider removing it.
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat // It seems this import is not used. Consider removing it.
import androidx.core.view.WindowInsetsCompat // It seems this import is not used. Consider removing it.

class Main2Activity : AppCompatActivity() {
    lateinit var btnNext: ImageView
    lateinit var btnBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2)
        btnBack = findViewById(R.id.back1)
        btnNext = findViewById(R.id.next2)

        btnBack.setOnClickListener {
            val intent = Intent(this, Main1Activity::class.java)
            startActivity(intent)
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
