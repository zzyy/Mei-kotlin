package com.zy.mei_kotlin.main.homepage

import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zy.mei_kotlin.R
import com.zy.mei_kotlin.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home_page.*


class HomePageFragment : BaseFragment() {

    private var mParam1: String? = null
    private var mParam2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString("")
            mParam2 = arguments.getString("")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_home_content.layoutManager = LinearLayoutManager(this.activity)

        rv_home_content.adapter = HomePageAdapter()

    }


}
