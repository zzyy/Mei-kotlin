package com.zy.mei_kotlin.base;

import android.os.Bundle;

/**
 * Created by Simon on 2017/5/25.
 */

public abstract class BasePresenter<T extends BaseView> {
    private T mView;

    public T getView() {
        return mView;
    }

    public BasePresenter(T mView) {
        this.mView = mView;
    }

    public void onCreate(Bundle bundle) {

    }

    public void onStarted() {
    }

    public void onResumed() {
    }


    public void onPaused() {

    }

    public void onStopped() {
    }

    public void onDestroyed() {
    }

    public void onSaveInstanceState( Bundle bundle) {
    }
}
