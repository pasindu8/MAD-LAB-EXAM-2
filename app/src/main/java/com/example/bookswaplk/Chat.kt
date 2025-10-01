package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chat : AppCompatActivity() {
    lateinit var btnPoatad: ImageView
    lateinit var btnHome: ImageView
    lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat)
        btnPoatad = findViewById(R.id.imageView13)
        btnHome = findViewById(R.id.imageView12)
        btnProfile = findViewById(R.id.imageView15)


        btnPoatad.setOnClickListener {
            val intent = Intent(this, PostAd::class.java)
            startActivity(intent)
            finish()
        }
        btnHome.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
            finish()
        }
    } 
}
