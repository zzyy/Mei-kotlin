package com.zy.mei_kotlin.base;

import android.os.Bundle;

/**
 * Created by Simon on 2017/5/25.
 */

public abstract class BaseActivityPresenter<T extends BaseView> implements BasePresenter {
    private T mView;

    @Override
    public T getView() {
        return mView;
    }

    public void setView(T view){
        if (mView != null){
            return;
        }

        if (view == null){
            throw new IllegalArgumentException();
        }
        this.mView = view;
    }

    public BaseActivityPresenter(T mView) {
        this.mView = mView;
    }

    public void onActivityCreate(Bundle bundle) {

    }

    public void onActivityStarted() {
    }

    public void onActivityResumed() {
    }


    public void onActivityPaused() {

    }

    public void onActivityStopped() {
    }

    public void onActivityDestroyed() {
    }

    public void onActivitySaveInstanceState(Bundle bundle) {
    }
}
