package com.example.dependencyapp;

import android.util.Log;

import javax.inject.Inject;

public class mobile {
    cpu cp;
    battery bt;
    memotycard mc;

    @Inject
    public mobile(cpu cp, battery bt, memotycard mc) {
        this.cp = cp;
        this.bt = bt;
        this.mc = mc;
    }
public void makemobilering(){
        Log.d("ring","mobile is ringing");
}
}
