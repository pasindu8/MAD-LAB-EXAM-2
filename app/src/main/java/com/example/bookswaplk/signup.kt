package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    lateinit var btnLogin: TextView
    lateinit var btnSignup: Button
    lateinit var edtEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        edtEmail = findViewById(R.id.editTextTextEmailAddress)
        btnSignup = findViewById(R.id.createaccount)
        btnLogin = findViewById(R.id.signin)

        btnSignup.setOnClickListener {
            altemaseeg()
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }

    }
    fun altemaseeg(){
        Toast.makeText(this, "${edtEmail.text.toString()} account has been created successfully",
            Toast.LENGTH_LONG).show()
    }

}

