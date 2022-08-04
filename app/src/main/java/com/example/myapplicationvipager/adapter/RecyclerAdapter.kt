package com.example.myapplicationvipager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationvipager.R
import com.example.myapplicationvipager.adapter.pager.PagerHolder
import com.example.myapplicationvipager.mode.RecyclerModel

class RecyclerAdapter(var list: ArrayList<RecyclerModel> = arrayListOf()) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //Нужен для инуилизации xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PagerHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyler_view, parent, false)
        )
    }

    //Предостовляет доступ для id из xml
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PagerHolder -> {
                if (list.size != 0) {
                    holder.bind(list[position], holder)
                }
            }
        }
    }

    // Указываешь количесто списка и его чтения
    override fun getItemCount(): Int {
        return list.size
    }
}