package com.hobashola.week5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return firstFragment()
            }
            1 -> {
                return secondFragment()
            }
            else -> {
                return firstFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Males Names"
            }
            1 -> {
                return "Females Names"
            }
        }
        return super.getPageTitle(position)
    }


}