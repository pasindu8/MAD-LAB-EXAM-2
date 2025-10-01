package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PostAd : AppCompatActivity() {
    lateinit var btnHome: ImageView
    lateinit var texPost: TextView
    lateinit var btnChat: ImageView
    lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.postad)
        texPost = findViewById(R.id.textView36)
        btnHome = findViewById(R.id.imageView12)
        btnChat = findViewById(R.id.imageView14)
        btnProfile = findViewById(R.id.imageView15)

        texPost.setOnClickListener {
            maseeg()
        }
        btnHome.setOnClickListener {
            val intent = Intent(this, home::class.java)
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
    fun maseeg(){
        Toast.makeText(this, "POST upload successful",
            Toast.LENGTH_LONG).show()
    }
}
