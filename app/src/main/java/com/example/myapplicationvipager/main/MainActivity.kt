package com.example.myapplicationvipager.main

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.myapplicationvipager.R
import com.example.myapplicationvipager.adapter.NumberAdapterPager
import com.example.myapplicationvipager.mode.RecyclerModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneList: ArrayList<RecyclerModel> = arrayListOf()
        oneList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "мото"))
        oneList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "вото"))
        oneList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "тото"))
        oneList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "кото"))
        oneList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "рото"))

        val twoList: ArrayList<RecyclerModel> = arrayListOf()
        twoList.add(RecyclerModel("https://i.pinimg.com/564x/6a/ab/ce/6aabce832f10308ef00f30b07da713e5.jpg", "можл"))
        twoList.add(RecyclerModel("https://i.pinimg.com/564x/6a/ab/ce/6aabce832f10308ef00f30b07da713e5.jpg", "вото"))
        twoList.add(RecyclerModel("https://i.pinimg.com/564x/6a/ab/ce/6aabce832f10308ef00f30b07da713e5.jpg", "шочо"))
        twoList.add(RecyclerModel("https://i.pinimg.com/564x/6a/ab/ce/6aabce832f10308ef00f30b07da713e5.jpg", "ванчо"))
        twoList.add(RecyclerModel("https://i.pinimg.com/564x/6a/ab/ce/6aabce832f10308ef00f30b07da713e5.jpg", "рото"))

        val fryList: ArrayList<RecyclerModel> = arrayListOf()
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "можл"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "сосо"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "свусу"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "муусцожл"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "цв"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "цв"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "йцв"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "цуацуможл"))
        fryList.add(RecyclerModel("https://aif-s3.aif.ru/images/023/736/f86ac3e4d6b2294382edda69a0b7b8f1.jpg", "йцв"))

        val list: ArrayList<ArrayList<RecyclerModel>> = arrayListOf()
        list.add(oneList)
        list.add(twoList)
        list.add(fryList)
        list.add(oneList)
        list.add(fryList)
        list.add(twoList)
        list.add(oneList)
        list.add(twoList)
        list.add(fryList)
        list.add(oneList)
        list.add(twoList)
        list.add(oneList)
        list.add(twoList)
        list.add(twoList)
        list.add(oneList)
        list.add(twoList)

        val adapter = NumberAdapterPager(this)
        adapter.addImage(list)
        pager.adapter = adapter
    }
}