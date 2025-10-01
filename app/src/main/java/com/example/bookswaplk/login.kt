package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    lateinit var btnSignup: TextView
    lateinit var btnLogin: Button
    lateinit var btnForgot: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnSignup = findViewById(R.id.signup)
        btnLogin = findViewById(R.id.login2)
        btnForgot = findViewById(R.id.forgot)

        btnSignup.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
        btnForgot.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
            finish()
        }
    } 
}
