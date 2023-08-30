package com.example.dependencyapp;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class nickelbatterymodule {
    private int batter;

    public nickelbatterymodule(int batter) {
        Log.d("percentage", String.valueOf(batter));
        this.batter = batter;
    }

    @Provides
    battery providebatter(nicketbattery nicketbattery){

//        nicketbattery.showtype();
//
//
        return  nicketbattery;
    }





}
