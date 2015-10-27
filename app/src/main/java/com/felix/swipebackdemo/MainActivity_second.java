package com.felix.swipebackdemo;

import android.os.Bundle;

import com.felix.swipebackdemo.BaseClass.SwipeBackActivity;

public class MainActivity_second extends SwipeBackActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

       // this.setTheme(R.style.Theme_Swipe_Back);
        setContentView(R.layout.activity_main_second);
    }


}
