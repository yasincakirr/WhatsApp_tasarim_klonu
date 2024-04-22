package com.yasincakir.whatsapp_tasarm_klon.ayarlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yasincakir.whatsapp_tasarm_klon.R
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentAyarlarBinding

class ayarlarFragment : Fragment() {
    private lateinit var binding:FragmentAyarlarBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        binding = FragmentAyarlarBinding.inflate(inflater, container, false)



        binding.imageButton2.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.bottomSheet)
        }


        binding.cardYardim.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.yardimGecis)
        }



        binding.cardHesap.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.hesapGecis)
        }


        binding.cardGizlilik.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gizlilikGecis)
        }


        binding.cardSohbetler.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sohbetGecis)
        }



        binding.cardBildirimler.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bildirimlerGecis)
        }


        return binding.root
    }

}