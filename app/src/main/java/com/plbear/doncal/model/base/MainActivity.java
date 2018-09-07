package com.plbear.doncal.model.base;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.plbear.doncal.R;
import com.plbear.doncal.model.normal.ui.NormalFragment;

public class MainActivity extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void afterCreated() {

    }

    @Override
    protected void onStart() {
        super.onStart();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment normalFrag = new NormalFragment();
        transaction.add(R.id.main_frag_layout,normalFrag);
        transaction.commit();
    }
}
