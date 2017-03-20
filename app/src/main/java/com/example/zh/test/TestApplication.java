package com.example.zh.test;

import android.app.Application;

import com.suninfo.commonlibrary.AppContext;

/**
 * Created by erfli on 11/1/16.
 */
public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppContext.init(getApplicationContext());
    }


}
