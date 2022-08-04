package com.example.myapplicationvipager.adapter.pager

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplicationvipager.mode.RecyclerModel
import kotlinx.android.synthetic.main.item_recyler_view.view.*

class PagerHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bind(item: RecyclerModel, holder: PagerHolder) = with(holder.itemView) {
            Glide
                .with(context)
                .load(item.image)
                .into(picture)

        myDescription.text = item.description
    }
}