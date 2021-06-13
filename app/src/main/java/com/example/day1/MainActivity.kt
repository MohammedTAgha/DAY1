package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mosque.setOnClickListener {
            var intent1= Intent(this,MOsqueShow::class.java)
            startActivity(intent1)
        }
        web.setOnClickListener {
            var intent1=Intent(this,MosqueSite::class.java)
            startActivity(intent1)
        }
        vedio.setOnClickListener {
            var intent1=Intent(this,MosqueVedio::class.java)
            startActivity(intent1)
        }
    }
}