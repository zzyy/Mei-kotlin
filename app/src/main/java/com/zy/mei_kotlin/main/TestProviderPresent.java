package com.zy.mei_kotlin.main;

import android.content.ContentValues;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.zy.mei_kotlin.base.BaseActivityPresenter;
import com.zy.mei_kotlin.db.MeiPojo;
import com.zy.mei_kotlin.db.MeiProvider;

/**
 * Created by Simon on 2017/6/7.
 */

public class TestProviderPresent extends BaseActivityPresenter<TestProviderActivity> {
    private static final String TAG = "zy.TestProviderPresent";
    public TestProviderPresent(TestProviderActivity mView) {
        super(mView);
    }

    Uri uri = Uri.parse("content://" + MeiProvider.AUTHORITY);

    @Override
    public void onActivityCreate(Bundle bundle) {
        super.onActivityCreate(bundle);
        Log.i(TAG, "onActivityCreate");

        getView().getContentResolver().registerContentObserver(Uri.parse("content://"+MeiProvider.AUTHORITY+"/mei/"), true, new ContentObserver(new Handler()) {
            @Override
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                Log.i(TAG, "selfChange=" + selfChange);
            }

            @Override
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                Log.i(TAG, "selfChange=" + selfChange + "  uri= " + uri);
            }
        });
        getView().getContentResolver().registerContentObserver(Uri.parse("content://zy"), true, new ContentObserver(new Handler()) {
            @Override
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                Log.i(TAG, "selfChange=" + selfChange);
            }

            @Override
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                Log.i(TAG, "selfChange=" + selfChange + "  uri= " + uri);
            }
        });
    }

    public void insertData(){
        ContentValues contentValues = new ContentValues();
        contentValues.put(MeiPojo.COLUMN_TITLE, "www");

        Uri ret = getView().getContentResolver().insert(uri, contentValues);
        Log.w(TAG, "inset success = " + ret);
    }
}
