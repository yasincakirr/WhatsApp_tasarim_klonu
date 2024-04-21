package com.yasincakir.whatsapp_tasarm_klon.ayarlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.yasincakir.whatsapp_tasarm_klon.R
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentAyarlarBinding
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentBottomSheetTikBinding


class bottomSheetTikFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetTikBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentBottomSheetTikBinding.inflate(inflater, container, false)





        return binding.root
    }

}