package com.zy.mei_kotlin.splash

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zy.mei_kotlin.R

/**
 * Created by Simon on 2017/5/22.
 */

class SplashFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        return view
    }
}