package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class verification : AppCompatActivity() {
    lateinit var btnProceed: Button
    lateinit var btnResend: TextView
    lateinit var btnBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_verification)
        btnProceed = findViewById(R.id.Proceed)
        btnResend = findViewById(R.id.textView14)
        btnBack = findViewById(R.id.back)

        btnProceed.setOnClickListener {
            val intent = Intent(this, resetPassword::class.java)
            startActivity(intent)
            finish()
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
            finish()
        }
        btnResend.setOnClickListener {
            mass()
        }
    }
    fun mass(){
        Toast.makeText(this, "A new email was sent",
            Toast.LENGTH_LONG).show()
    }
}
