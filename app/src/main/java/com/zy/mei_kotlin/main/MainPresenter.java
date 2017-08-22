package com.zy.mei_kotlin.main;

import android.content.Intent;
import android.os.Bundle;

import com.zy.mei_kotlin.base.BaseActivityPresenter;

/**
 * Created by Simon on 2017/5/25.
 */

public class MainPresenter extends BaseActivityPresenter<MainActivity> {

    public MainPresenter(MainActivity mView) {
        super(mView);
    }

    @Override
    public void onActivityCreate(Bundle bundle) {
        super.onActivityCreate(bundle);
    }

    public void goTestPrivider() {
        getView().startActivity(new Intent(getView(), TestProviderActivity.class));
    }
}
