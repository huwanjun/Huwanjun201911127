package com.bawei.huwanjun;

import android.app.Application;
import android.content.Context;
import android.view.View;

/**
 * author: 斛万珺
 * data: 2019/11/27 09:9:14
 * function:
 */
public class App extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
