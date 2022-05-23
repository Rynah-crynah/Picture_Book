package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SandwhichActivity : AppCompatActivity() {
    lateinit var btnNext4: Button
    lateinit var btnPrevious3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sandwhich)
        btnNext4= findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            var intent= Intent(this,SnackActivity::class.java)
            startActivity(intent)
        }
        btnPrevious3= findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            var intent= Intent(this,CakeActivity::class.java)
            startActivity(intent)
        }
    }
}
