package com.plbear.doncal.model.normal.presenter;

import android.app.Service;
import android.os.Vibrator;

import com.plbear.doncal.model.base.App;
import com.plbear.doncal.model.normal.data.Data;
import com.plbear.doncal.model.normal.ui.NormalFragInterface;

public class NormalFragPersenter implements NormalFragPerInerface{
    private Vibrator vibrator = null;

    @Override
    public void getResult() {

    }

    @Override
    public void addData(Data data) {
        if(vibrator==null){
            vibrator = (Vibrator) App.getContext().getSystemService(Service.VIBRATOR_SERVICE);
        }
        vibrator.vibrate(45);
    }

    @Override
    public void setView(NormalFragInterface view) {

    }

    @Override
    public void clear() {
        if(vibrator==null){
            vibrator = (Vibrator) App.getContext().getSystemService(Service.VIBRATOR_SERVICE);
        }
        vibrator.vibrate(45);
    }
}
