package com.example.bookswaplk

import android.os.Bundle
import android.widget.ImageView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Main1Activity : AppCompatActivity() {
    lateinit var btnNext: ImageView
    lateinit var btnSkip: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main1)
        btnSkip = findViewById(R.id.skip1)
        btnNext = findViewById(R.id.next1)

        btnSkip.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
