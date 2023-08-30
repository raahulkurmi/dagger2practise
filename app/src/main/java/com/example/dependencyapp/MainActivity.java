package com.example.dependencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        battery bt=new battery(100);
//        memotycard mc=new memotycard(100);
//        cpu cp=new cpu("silicon");
//
//        mobile mb=new mobile(cp,bt,mc);

        mobile mobile;
        mobilecomponent mobilecomponent= Daggermobilecomponent.builder().nickelbatterymodule(new nickelbatterymodule(1)).build();

        mobile=mobilecomponent.getmobile();
        mobile.makemobilering();
    }
}