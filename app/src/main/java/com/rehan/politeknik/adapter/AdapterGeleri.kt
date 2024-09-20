package com.rehan.politeknik.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.politeknik.Geleri
import com.rehan.politeknik.R
import com.rehan.politeknik.model.modelPoli

class AdapterGeleri(
    private val itemList : ArrayList<modelPoli>,
    private val context :Context
): RecyclerView.Adapter<AdapterGeleri.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val itemImage : ImageView = itemView.findViewById(R.id.gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_geleri, parent, false)
        return MyViewHolder(nView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]

        // Set images for the item
        holder.itemImage.setImageResource(currentItem.image)

        // Set click listener for the image
        holder.itemImage.setOnClickListener {
            openDetailActivity(currentItem.image)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    private fun openDetailActivity(imageResId: Int) {
        val intent = Intent(context, Geleri::class.java)
        intent.putExtra("imageResId", imageResId)
        context.startActivity(intent)
    }
}