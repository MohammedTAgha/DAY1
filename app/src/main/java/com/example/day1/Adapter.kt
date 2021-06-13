package com.example.day1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.ArrayList

class CustomAdapter(context: Context,
                    private val names: ArrayList<String>,
                    ) :
    ArrayAdapter<String>(context, R.layout.item_layout, names) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val l:LayoutInflater = LayoutInflater.from(context)
        val View = l.inflate(R.layout.item_layout, parent, false)
        View.txt_name.text=names[position]

//        customView.textView.text = names[position]
//        customView.imageView.setImageResource(images[position])

        return View
    }
}
