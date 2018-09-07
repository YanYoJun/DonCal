package com.plbear.doncal.model.base;

import android.app.Activity;

import java.util.Stack;

public class ActivityStack {
    public Stack<Activity> mStack = new Stack<>();

    private ActivityStack(){

    }

    private static ActivityStack sInstance = null;
    public static ActivityStack getInstace(){
        if(sInstance == null){
            synchronized (ActivityStack.class){
                if(sInstance == null){
                    sInstance = new ActivityStack();
                }
            }
        }
        return sInstance;
    }

    public void push(Activity activity){
        mStack.push(activity);
    }

    public void pop(Activity activity){
        mStack.remove(activity);
    }

    public void exitAll(){
        while(!mStack.isEmpty()){
            Activity activity = mStack.pop();
            activity.finish();
        }
    }
}
