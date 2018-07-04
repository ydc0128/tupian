package com.example.administrator.pingjia;

import android.app.Application;

/**
 * Created by Administrator on 2018/7/4.
 */

public class AppContext extends Application {
    private static AppContext instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static AppContext getInstance(){
        return instance;
    }
}
