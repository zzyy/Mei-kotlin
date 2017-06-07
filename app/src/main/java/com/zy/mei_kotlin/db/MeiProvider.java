package com.zy.mei_kotlin.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class MeiProvider extends ContentProvider {
    public final static String AUTHORITY = "com.zy.mei";

    public MeiProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        MeiPojo meiPojo = new MeiPojo();
        meiPojo.setTitle(values.getAsString(MeiPojo.COLUMN_TITLE));

        long id = mDBManager.insert(meiPojo);


        Uri retUri = new Uri.Builder().authority(AUTHORITY)
                .scheme("content")
                .path("mei")
                .appendPath(String.valueOf(id))
                .build();

        getContext().getContentResolver().notifyChange(retUri, null);
        getContext().getContentResolver().notifyChange(Uri.parse("content://zy"), null);
        return retUri;

    }

    DBManager mDBManager;

    private void checkInit() {
        if (mDBManager == null) {
            mDBManager = DBManager.getInstance(getContext());
        }
    }

    @Override
    public boolean onCreate() {
        checkInit();
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        // TODO: Implement this to handle query requests from clients.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
