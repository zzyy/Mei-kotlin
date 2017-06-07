package com.zy.mei_kotlin.main;

import android.content.Intent;
import android.os.Bundle;

import com.zy.mei_kotlin.base.BasePresenter;

/**
 * Created by Simon on 2017/5/25.
 */

public class MainPresenter extends BasePresenter<MainActivity> {

    public MainPresenter(MainActivity mView) {
        super(mView);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void goTestPrivider() {
        getView().startActivity(new Intent(getView(), TestProviderActivity.class));
    }
}
