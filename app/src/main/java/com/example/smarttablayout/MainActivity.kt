package com.example.smarttablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pages = FragmentPagerItems(this)
        pages.add(FragmentPagerItem.of("Tab1", Tab1Fragment::class.java))
        pages.add(FragmentPagerItem.of("Tab2", Tab2Fragment::class.java ))
        pages.add(FragmentPagerItem.of("Tab3", Tab3Fragment::class.java ))
        pages.add(FragmentPagerItem.of("Tab4", Tab4Fragment::class.java ))
        pages.add(FragmentPagerItem.of("Tab5", Tab5Fragment::class.java ))

        val adapter = FragmentPagerItemAdapter(supportFragmentManager, pages)

        viewpager.adapter = adapter
        tabLayout.setViewPager(viewpager)
    }
}