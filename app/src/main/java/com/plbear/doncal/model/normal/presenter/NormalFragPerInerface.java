package com.plbear.doncal.model.normal.presenter;

import com.plbear.doncal.model.normal.data.Data;
import com.plbear.doncal.model.normal.ui.NormalFragInterface;
import com.plbear.doncal.model.normal.ui.NormalFragment;

public interface NormalFragPerInerface {
    void setView(NormalFragInterface view);
    void addData(Data data);
    void getResult();
    void clear();
}
