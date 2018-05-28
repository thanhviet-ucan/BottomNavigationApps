package com.thanhviet.bottomnavigationapps.fragments.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.thanhviet.bottomnavigationapps.R

/**
 * Created by FRAMGIA\bui.dinh.viet on 28/05/2018.
 */
class ImageAdapter(
    val imageList: MutableList<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ImageViewHolder {
    val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_image, parent, false)
    return ImageViewHolder(v);
  }

  override fun getItemCount(): Int {
    return imageList.size
  }

  override fun onBindViewHolder(holder: ImageViewHolder?, position: Int) {
    holder?.bindData(imageList.get(position))
  }


  class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val image: ImageView = itemView.findViewById(R.id.img)
    fun bindData(idImg: Int) {
      image.setImageResource(idImg)
    }
  }
}