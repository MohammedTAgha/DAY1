package com.example.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mosque_show.*

class MOsqueShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mosque_show)
        var mousqus= arrayListOf<String>("mosque 1","mosque 1","mosque 1")
        list_view.adapter=CustomAdapter(this,mousqus)
    }
}