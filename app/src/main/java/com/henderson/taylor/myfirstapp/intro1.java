package com.henderson.taylor.myfirstapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.TextView;

/**
 * Created by taylor on 2/13/15.
 */
public class intro1 extends Fragment{

    final Animation in1 = new AlphaAnimation(0.0f, 1.0f);
    final Animation in2 = new AlphaAnimation(0.0f, 1.0f);
    private AnimationSet as1 = new AnimationSet(true);
    private AnimationSet as2 = new AnimationSet(true);
    private TextView mSwitcher;
    private TextView mheader;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.intro1, container, false);

        /*in1.setDuration(500);
        in1.setStartOffset(500);
        as1.addAnimation(in1);

        in2.setDuration(500);
        in2.setStartOffset(1500);
        as2.addAnimation(in2);

        mSwitcher = (TextView) findViewById(R.id.introContinue);
        mheader = (TextView) findViewById(R.id.header);
        mheader.setVisibility(View.INVISIBLE);
        mSwitcher.setVisibility(View.INVISIBLE);
        mheader.startAnimation(as1);
        mSwitcher.startAnimation(as2);
        mSwitcher.setVisibility(View.VISIBLE);
        mheader.setVisibility(View.VISIBLE);*/
        return view;
    }

}