package com.zy.mei_kotlin.main;

import android.app.Fragment;
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

    Fragment mFragment;

    public void insert(View view) {
        getPresenter().insertData();
    }

    void initView(){
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, mFragment)
                .commit();
    }
}
