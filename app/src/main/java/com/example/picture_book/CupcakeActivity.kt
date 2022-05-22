package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CupcakeActivity : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cupcake)
        btnNext2= findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            var intent= Intent(this,CakeActivity::class.java)
            startActivity(intent)
        }
        btnPrevious= findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            var intent= Intent(this,Rynahs_Juice::class.java)
            startActivity(intent)
        }
    }
}