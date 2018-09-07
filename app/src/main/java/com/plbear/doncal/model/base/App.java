package com.plbear.doncal.model.base;

import android.app.Application;
import android.content.Context;

public class App extends Application{
    private static Context sContext = null;
    @Override
    public void onCreate() {
        sContext = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext(){
        return sContext;
    }
}
