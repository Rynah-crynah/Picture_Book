package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SnackActivity : AppCompatActivity() {
    lateinit var btnNext6: Button
    lateinit var btnPrevious5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)
        btnNext6= findViewById(R.id.btnNext6)
        btnNext6.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnPrevious5= findViewById(R.id.btnPrevious5)
        btnPrevious5.setOnClickListener {
            var intent= Intent(this,SandwhichActivity::class.java)
            startActivity(intent)
        }
    }
}