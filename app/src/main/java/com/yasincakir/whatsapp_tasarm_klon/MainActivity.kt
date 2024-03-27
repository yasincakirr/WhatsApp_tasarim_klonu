package com.yasincakir.whatsapp_tasarm_klon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewpager)

        tabLayout.setupWithViewPager(viewPager)

        val adapter = vpAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        adapter.addFragment(fragment1(),"SOHBET")
        adapter.addFragment(fragment2(),"DURUM")
        adapter.addFragment(fragment3(),"ARAMALAR")

        viewPager.setAdapter(adapter)

    }
}