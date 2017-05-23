package com.zy.mei_kotlin.base

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 * Created by Simon on 2017/5/22.
 */
abstract class BaseViewActivity<T : BasePresent> : BaseActivity(), BaseView<T> {


    class ViewLifecycle : Application.ActivityLifecycleCallbacks {

        override fun onActivityCreated(p0: Activity?, p1: Bundle?) {
            if (p0 !is BaseView<*>) {
                return
            }

            p0.present?.onCreate(p1)
        }

        override fun onActivityStarted(p0: Activity?) {
            if (p0 is BaseView<*>) {
                p0.present?.onStarted()
            }
        }

        override fun onActivityResumed(p0: Activity?) {
            if (p0 is BaseView<*>) {
                p0.present?.onResumed()
            }
        }


        override fun onActivityPaused(p0: Activity?) {
            if (p0 is BaseView<*>) {
                p0.present?.onPaused()
            }
        }

        override fun onActivityStopped(p0: Activity?) {
            if (p0 is BaseView<*>) {
                p0.present?.onStopped()
            }
        }

        override fun onActivityDestroyed(p0: Activity?) {
            if (p0 is BaseView<*>) {
                p0.present?.onDestroyed()
            }
        }

        override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {
            if (p0 is BaseView<*>) {
                p0.present?.onSaveInstanceState(p1)
            }
        }

    }
}