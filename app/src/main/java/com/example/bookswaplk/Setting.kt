package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Setting : AppCompatActivity() {
    lateinit var btnPoatad: ImageView
    lateinit var btnback: ImageView
    lateinit var btnChat: ImageView
    lateinit var btnHome: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)
        btnback = findViewById(R.id.imageView22)
        btnPoatad = findViewById(R.id.imageView13)
        btnChat = findViewById(R.id.imageView14)
        btnHome = findViewById(R.id.imageView12)

        btnback.setOnClickListener {
            val intent = Intent(this, PostAd::class.java)
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
        btnHome.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }

    } 
}
