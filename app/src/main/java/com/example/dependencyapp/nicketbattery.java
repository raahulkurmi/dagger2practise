package com.example.dependencyapp;

import android.util.Log;

import javax.inject.Inject;

public class nicketbattery implements battery {
    @Inject
    public nicketbattery(){

    }



    @Override
    public void showtype() {

        Log.d("showtype","showing battery percentage");
    }
}
