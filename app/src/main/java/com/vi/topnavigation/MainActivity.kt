package com.vi.topnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adaptor: FragmentAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // we have three fragments
        // how to make fragment link in description
        // create a fragment Adaptor

        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager)
        adaptor = FragmentAdaptor(supportFragmentManager,lifecycle)
        viewPager2.adapter = adaptor

        TabLayoutMediator(tabLayout,viewPager2){tab,position ->
            when(position) {
                0-> {
                    tab.text = "First" //set name for the tabs
                }
                1 -> {
                    tab.text = "Second"
                }
                2 -> {
                    tab.text = "Third"
                }
            }
        }.attach()

    }
}