package com.zy.mei_kotlin.main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.zy.mei_kotlin.R
import com.zy.mei_kotlin.base.BaseActivity
import com.zy.mei_kotlin.base.BaseViewActivity
import com.zy.mei_kotlin.splash.SplashFragment

class MainActivity : BaseViewActivity<MainPresenter>() {
    override fun getPresenter(): MainPresenter {
        return MainPresenter(this)
    }

    var mRecyclerView: RecyclerView? = null

    private val mHandler = object : Handler() {
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSplash()
        window.decorView.post { initContentView() }
        mHandler.postDelayed( {hideSplash()}, 5000 )

        mRecyclerView = findViewById(R.id.rv_content) as RecyclerView?;
        mRecyclerView?.layoutManager = LinearLayoutManager(this)

        mRecyclerView?.let {
            it.layoutManager = LinearLayoutManager(this)
        }
    }

    private fun hideSplash() {
        supportFragmentManager.findFragmentByTag("splash")


    }


    fun initContentView() {

    }

    fun initSplash() {
        val splashFragment: Fragment = SplashFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
                .replace(R.id.fl_splash_container, splashFragment, "splash")
                .commit()
    }


    fun goTestProviderActivity(v: View?){
        presenter.goTestPrivider()
    }

    override fun onDestroy() {
        super.onDestroy()

    }
}
