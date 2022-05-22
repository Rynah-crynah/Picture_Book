package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CakeActivity : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnPrevious2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cake)
        btnNext3= findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            var intent= Intent(this,SandwhichActivity::class.java)
            startActivity(intent)
        }
        btnPrevious2= findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            var intent= Intent(this,CakeActivity::class.java)
            startActivity(intent)
        }
    }
}
