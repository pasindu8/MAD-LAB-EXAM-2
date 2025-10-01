package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ForgotPassword : AppCompatActivity() {
    lateinit var btnBack: ImageView
    lateinit var btnRecover: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        btnRecover = findViewById(R.id.recover)
        btnBack = findViewById(R.id.back)

        btnRecover.setOnClickListener {
            val intent = Intent(this, verification::class.java)
            startActivity(intent)
            finish()
        }
        btnBack.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    } 
}
