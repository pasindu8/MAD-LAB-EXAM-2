package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    lateinit var btnPoatad: ImageView
    lateinit var laybook: LinearLayout
    lateinit var btnChat: ImageView
    lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        laybook = findViewById(R.id.linearLayout3)
        btnPoatad = findViewById(R.id.imageView13)
        btnChat = findViewById(R.id.imageView14)
        btnProfile = findViewById(R.id.imageView15)

        laybook.setOnClickListener {
            val intent = Intent(this, Details::class.java)
            startActivity(intent)
            finish()
        }
        btnPoatad.setOnClickListener {
            val intent = Intent(this, PostAd::class.java)
            startActivity(intent)
            finish()
        }
        btnChat.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
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
