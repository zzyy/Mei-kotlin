package com.zy.mei_kotlin.main

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.zy.mei_kotlin.R
import com.zy.mei_kotlin.base.BaseActivity
import com.zy.mei_kotlin.splash.SplashFragment

class MainActivity : BaseActivity() {

    var mRecyclerView: RecyclerView? = null

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSplash()


        mRecyclerView = findViewById(R.id.rv_content) as RecyclerView?;
        mRecyclerView?.layoutManager = LinearLayoutManager(this)

        mRecyclerView?.let {
            it.layoutManager = LinearLayoutManager(this)
        }
    }


    fun initContentView()  {

    }

    fun initSplash(){
        val splashFragment : Fragment = SplashFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
                .replace(R.id.fl_splash_container, splashFragment, "splash")
                .commit()
    }


    override fun onDestroy() {
        super.onDestroy()

    }
}
