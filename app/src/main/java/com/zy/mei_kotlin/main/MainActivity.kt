package com.zy.mei_kotlin.main

import android.app.Fragment
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v4.view.ViewPager
import com.zy.mei_kotlin.R
import com.zy.mei_kotlin.base.BaseViewActivity
import com.zy.mei_kotlin.main.homepage.HomePageFragment
import com.zy.mei_kotlin.splash.SplashFragment

class MainActivity : BaseViewActivity<MainPresenter>() {
    var mHomePageFragment : Fragment? = null

    override fun getPresenter(): MainPresenter {
        return MainPresenter(this)
    }


    private val mHandler = object : Handler() {
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSplash()
        window.decorView.post { initContentView() }
        mHandler.postDelayed({ hideSplash() }, 1000)
    }

    fun initContentView() {
        mHomePageFragment = HomePageFragment()

       fragmentManager.beginTransaction()
               .replace(R.id.vg_main_container, mHomePageFragment)
               .commit()

    }

    private fun hideSplash() {
        val splashFragment = fragmentManager.findFragmentByTag("splash")
        fragmentManager.beginTransaction()
                .hide(splashFragment)
                .remove(splashFragment)
                .commit()
    }

    private fun showSplash() {
        val splashFragment: Fragment = SplashFragment()
        fragmentManager.beginTransaction()
                .replace(android.R.id.content, splashFragment, "splash")
                .commit()
    }


    override fun onDestroy() {
        mHandler.removeCallbacksAndMessages(null)
        super.onDestroy()

    }
}


