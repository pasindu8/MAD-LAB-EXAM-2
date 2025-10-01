package com.example.bookswaplk

import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import android.os.Handler
import android.os.Looper
import android.content.Intent
import androidx.activity.enableEdgeToEdge // It seems this import is not used. Consider removing it.
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat // It seems this import is not used. Consider removing it.
import androidx.core.view.WindowInsetsCompat // It seems this import is not used. Consider removing it.

class welcomeActivity : AppCompatActivity() {
    lateinit var btnCreAcc: Button
    lateinit var btnlog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        btnCreAcc = findViewById(R.id.CreateAccount)
        btnlog = findViewById(R.id.Login)

        btnCreAcc.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        }
        btnlog.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }
}