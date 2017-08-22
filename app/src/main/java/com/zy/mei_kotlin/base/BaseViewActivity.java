package com.zy.mei_kotlin.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by Simon on 2017/5/25.
 */

public abstract class BaseViewActivity<T extends BaseActivityPresenter> extends BaseActivity implements BaseView<T> {


    public static final class ViewActivityLifecycle implements Application.ActivityLifecycleCallbacks {


        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityCreate(savedInstanceState);
        }

        @Override
        public void onActivityStarted(Activity activity) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityStarted();
        }

        @Override
        public void onActivityResumed(Activity activity) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityResumed();
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityPaused();
        }

        @Override
        public void onActivityStopped(Activity activity) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityStopped();
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivitySaveInstanceState(outState);
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (!(activity instanceof BaseViewActivity)) {
                return;
            }
            if (((BaseViewActivity) activity).getPresenter() == null) {
                return;
            }
            ((BaseViewActivity) activity).getPresenter().onActivityDestroyed();
        }
    }
}
