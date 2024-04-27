package com.yasincakir.whatsapp_tasarm_klon.ayarlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yasincakir.whatsapp_tasarm_klon.R
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentBildirimlerBinding

class bildirimlerFragment : Fragment() {


    private lateinit var binding: FragmentBildirimlerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentBildirimlerBinding.inflate(inflater, container, false)

        return binding.root
    }

}