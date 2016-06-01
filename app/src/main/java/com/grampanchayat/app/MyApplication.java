package com.grampanchayat.app;

import android.app.Application;
import android.support.multidex.MultiDex;

import com.facebook.stetho.Stetho;

/**
 * @ Firstcry
 * Created by suhasbachewar on 1/6/16.
 */
public class MyApplication extends Application {
    private MyApplication mInstance;
//    chrome://inspect/#devices
    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        MultiDex.install(this);
        Stetho.initializeWithDefaults(this);
    }
}
