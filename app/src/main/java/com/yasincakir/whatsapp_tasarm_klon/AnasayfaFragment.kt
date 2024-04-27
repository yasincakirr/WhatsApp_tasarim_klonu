package com.yasincakir.whatsapp_tasarm_klon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.yasincakir.whatsapp_tasarm_klon.*
import com.yasincakir.whatsapp_tasarm_klon.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        tabLayout = view?.findViewById(R.id.tabLayout)!!
        viewPager = view?.findViewById(R.id.viewpager)!!

        tabLayout.setupWithViewPager(viewPager)

        val adapter = vpAdapter(
            requireActivity().supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )

        adapter.addFragment(fragment1(), "SOHBET")
        adapter.addFragment(fragment2(), "DURUM")
        adapter.addFragment(fragment3(), "ARAMALAR")

        viewPager.setAdapter(adapter)


        return binding.root
    }

}