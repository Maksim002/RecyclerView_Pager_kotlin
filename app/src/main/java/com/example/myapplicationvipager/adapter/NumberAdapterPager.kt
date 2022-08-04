package com.example.myapplicationvipager.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplicationvipager.fragment.FragmentModel
import com.example.myapplicationvipager.fragment.FragmentModel.Companion.ARG_OBJECT
import com.example.myapplicationvipager.mode.RecyclerModel

class NumberAdapterPager (fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 100

    var list: ArrayList<ArrayList<RecyclerModel>> = arrayListOf()

    fun addImage(item: ArrayList<ArrayList<RecyclerModel>>){
        list = item
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = FragmentModel()
        fragment.arguments = Bundle().apply {
            if (position < list.size){
                putSerializable(ARG_OBJECT, list[position])
            }else{
                putSerializable(ARG_OBJECT, arrayListOf(RecyclerModel(
                    "https://www.meme-arsenal.com/memes/e70bfb2c1c7a191edeb32304ea3ba87a.jpg",
                    ""
                )))
            }
        }
        return fragment
    }
}