package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rynahs_Juice : AppCompatActivity() {
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rynahs_juice)
        btnNext= findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent= Intent(this,CupcakeActivity::class.java)
            startActivity(intent)
        }
    }
}
