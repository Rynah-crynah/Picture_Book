package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnexplore: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnexplore = findViewById(R.id.btnexplore)
        btnexplore.setOnClickListener {
            val intent =Intent(this,Rynahs_Juice::class.java)
            startActivity(intent)
        }
    }
}