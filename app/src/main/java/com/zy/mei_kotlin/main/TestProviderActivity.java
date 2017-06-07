package com.zy.mei_kotlin.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zy.mei_kotlin.R;
import com.zy.mei_kotlin.base.BaseViewActivity;

public class TestProviderActivity extends BaseViewActivity<TestProviderPresent> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_provider);
    }

    @Override
    public TestProviderPresent getPresenter() {
        return new TestProviderPresent(this);
    }

    public void insert(View view) {
        getPresenter().insertData();
    }
}
