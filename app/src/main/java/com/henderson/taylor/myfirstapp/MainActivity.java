package com.henderson.taylor.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends Activity {
    final Animation in1 = new AlphaAnimation(0.0f, 1.0f);
    final Animation in2 = new AlphaAnimation(0.0f, 1.0f);
    private AnimationSet as1 = new AnimationSet(true);
    private AnimationSet as2 = new AnimationSet(true);
    private TextView mSwitcher;
    private TextView mheader;
    private RelativeLayout rlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        in1.setDuration(500);
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
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void start(View view){
        //Intent intent = new Intent(this, list_Activity.class);

        //startActivity(intent);
    }

}
