package com.henderson.taylor.myfirstapp;

/**
 * Created by taylor on 2/13/15.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class introPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public introPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new intro1();
        }else if (i == 1){
            return new intro2();
        } else if (i == 2){
            return new intro3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
