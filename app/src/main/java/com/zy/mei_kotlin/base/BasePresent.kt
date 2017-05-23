package com.zy.mei_kotlin.base

import android.os.Bundle

/**
 * Created by Simon on 2017/5/22.
 */
interface BasePresent {

    fun <T : BaseView<BasePresent>, V : BasePresent> newInstance(view: T): V


    fun onCreate(bundle: Bundle?) {

    }

    fun onStarted() {
    }

    fun onResumed() {
    }


    fun onPaused() {

    }

    fun onStopped() {
    }

    fun onDestroyed() {
    }

    fun onSaveInstanceState(bundle: Bundle?) {
    }


}