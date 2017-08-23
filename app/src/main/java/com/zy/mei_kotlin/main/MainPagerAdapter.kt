package com.zy.mei_kotlin.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by yunzou on 17-8-23.
 */

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return null
    }

    override fun getCount(): Int {
        return 0
    }
}
