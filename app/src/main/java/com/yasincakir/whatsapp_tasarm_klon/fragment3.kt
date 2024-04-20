package com.yasincakir.whatsapp_tasarm_klon

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentFragment3Binding

class fragment3 : Fragment() {

    private lateinit var binding : FragmentFragment3Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentFragment3Binding.inflate(inflater, container, false)



        binding.floatingActionButton2.setOnClickListener {

            var intent = Intent(activity,MainActivity2::class.java)

            startActivity(intent)

        }



        return binding.root
    }


}