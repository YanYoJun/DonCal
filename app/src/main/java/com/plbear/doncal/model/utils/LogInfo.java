package com.plbear.doncal.model.utils;

import android.util.Log;

public class LogInfo {
    private static final String TAG = "DonCal";

    public void info(String tag, String msg) {
        if (Utils.DEBUG) {
            Log.i(TAG + " --tag:", msg);
        }
    }

    public void error(String tag, String msg) {
        Log.e(TAG + " --tag", msg);
    }
}
