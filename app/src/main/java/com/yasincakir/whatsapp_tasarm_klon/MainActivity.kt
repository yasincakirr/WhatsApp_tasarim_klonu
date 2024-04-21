package com.yasincakir.whatsapp_tasarm_klon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.yasincakir.whatsapp_tasarm_klon.ayarlar.AyarlarActivity
import com.yasincakir.whatsapp_tasarm_klon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewpager)

        tabLayout.setupWithViewPager(viewPager)

        val adapter = vpAdapter(
            getSupportFragmentManager(),
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )

        adapter.addFragment(fragment1(), "SOHBET")
        adapter.addFragment(fragment2(), "DURUM")
        adapter.addFragment(fragment3(), "ARAMALAR")

        viewPager.setAdapter(adapter)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_activity, menu)
        return super.onCreateOptionsMenu(menu)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.ayarlar ->{
                var intent = Intent(this, AyarlarActivity::class.java)
                startActivity(intent)
            }
        }
        return true
    }



}



