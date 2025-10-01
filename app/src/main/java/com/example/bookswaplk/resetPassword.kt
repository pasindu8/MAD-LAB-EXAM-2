package com.example.bookswaplk

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class resetPassword : AppCompatActivity() {
    lateinit var btnContiune: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reset_password)
        btnContiune = findViewById(R.id.contiune)

        btnContiune.setOnClickListener {
            mass()
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun mass(){
        Toast.makeText(this, " Password update successful",
            Toast.LENGTH_LONG).show()
    }
}
