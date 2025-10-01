package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    lateinit var btnPoatad: ImageView
    lateinit var btnlogout: TextView
    lateinit var btnChat: ImageView
    lateinit var btnHome: ImageView

    lateinit var btnSettings: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)
        btnlogout = findViewById(R.id.textView34)
        btnPoatad = findViewById(R.id.imageView13)
        btnChat = findViewById(R.id.imageView14)
        btnHome = findViewById(R.id.imageView12)
        btnSettings = findViewById(R.id.imageView23)

        btnlogout.setOnClickListener {
            val intent = Intent(this, login::class.java)
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
        btnSettings.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
            finish()
        }
    } 
}
