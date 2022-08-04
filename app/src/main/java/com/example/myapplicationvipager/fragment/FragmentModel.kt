package com.example.myapplicationvipager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplicationvipager.R
import com.example.myapplicationvipager.adapter.RecyclerAdapter
import com.example.myapplicationvipager.mode.RecyclerModel
import kotlinx.android.synthetic.main.fragment_model.*

class FragmentModel : Fragment() {

    companion object{
        const val ARG_OBJECT = "object"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_model, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

            val resAdapter = RecyclerAdapter(getSerializable(ARG_OBJECT) as ArrayList<RecyclerModel>)
            RView.adapter = resAdapter

        }
    }
}