package com.example.getrest.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.example.getrest.Adapter.GetRestMainPagerAdapter
import com.example.getrest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureMainTab()
    }

    private fun configureMainTab() {
        vp_main_getrest.adapter= GetRestMainPagerAdapter(supportFragmentManager, 4)
        vp_main_getrest.offscreenPageLimit = 3
        tl_main_category.setupWithViewPager(vp_main_getrest)

        val navCategoryMainLayout: View = (this.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.tab_layout, null, false)
        tl_main_category.getTabAt(0)!!.customView = navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_home) as RelativeLayout
        tl_main_category.getTabAt(1)!!.customView = navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_portfolio) as RelativeLayout
        tl_main_category.getTabAt(2)!!.customView = navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_notice) as RelativeLayout
        tl_main_category.getTabAt(3)!!.customView = navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_folder) as RelativeLayout

    }

}
