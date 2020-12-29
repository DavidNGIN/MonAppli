package com.example.monappli.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.monappli.Adapter
import com.example.monappli.Item
import com.example.monappli.R
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val exemplelist = generateDummyList(200)
        recycler_view.adapter = Adapter(exemplelist)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<Item> {
        val list = ArrayList<Item>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.android_picture
              //  1 -> R.drawable.ic_audio
               else -> R.drawable.android_picture
            }
            val item = Item(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}