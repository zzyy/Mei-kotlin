package com.zy.mei_kotlin

import android.app.Application
import com.zy.mei_kotlin.base.BaseViewActivity

/**
 * Created by Simon on 2017/5/21.
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initMVPLifecycle(this)
    }

    fun initMVPLifecycle(application: Application) {
        application.registerActivityLifecycleCallbacks(BaseViewActivity.ViewLifecycle())
    }
}