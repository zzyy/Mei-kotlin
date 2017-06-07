package com.zy.mei_kotlin.db;

import android.content.Context;

/**
 * Created by Simon on 2017/6/6.
 */

public class DBManager {
    private final static String dbName = "test_db";

    private static DBManager INSTANCE = null;

    private DaoMaster.DevOpenHelper openHelper;
    private Context context;
    private DBManager(Context ctx) {
        context = ctx.getApplicationContext();
        openHelper = new DaoMaster.DevOpenHelper(context, dbName);
    }

    public static DBManager getInstance(Context context){
        if (INSTANCE == null){
            synchronized (DBManager.class){
                if (INSTANCE == null){
                    INSTANCE = new DBManager(context);
                }
            }
        }

        return INSTANCE;
    }

    public long insert(MeiPojo meiPojo){
        DaoSession daoSession = new DaoMaster(openHelper.getWritableDb()).newSession();
        return daoSession.getMeiPojoDao().insert(meiPojo);
    }




}
