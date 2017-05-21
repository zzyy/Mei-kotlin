package com.zy.mei_kotlin.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.zy.mei_kotlin.R
import com.zy.mei_kotlin.base.BaseActivity

class MainActivity : BaseActivity() {

    var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.rv_content) as RecyclerView?;
        mRecyclerView?.layoutManager = LinearLayoutManager(this)

    }


    fun showData() {
    }
}
