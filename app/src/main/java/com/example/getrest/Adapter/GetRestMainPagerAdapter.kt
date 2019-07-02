package com.example.getrest.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.getrest.Fragment.*

class GetRestMainPagerAdapter(fm: FragmentManager, private val num_Fragment: Int): FragmentStatePagerAdapter(fm)
{
    override fun getItem(p0: Int): Fragment? {
        return when (p0) {
            0 -> HomeFragment()
            1 -> PortfolioFragment()
            2 -> JobFragment()
            3 -> MyPfFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return num_Fragment
    }
}