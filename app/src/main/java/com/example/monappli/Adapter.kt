
package com.example.monappli

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_un.view.*

class Adapter(private val ExempleList: List<Item>) : RecyclerView.Adapter<Adapter.ExempleViewHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExempleViewHold {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_un,
       parent, false)

        return ExempleViewHold(itemView)
    }

    override fun onBindViewHolder(holder: ExempleViewHold, position: Int) {
        val currentItem = ExempleList[position]
        holder.imageView.setImageResource(currentItem.imageRessource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2

    }

    override fun getItemCount() = ExempleList.size


    class ExempleViewHold(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.Image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2


    }
}

