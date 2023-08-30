package com.example.dependencyapp;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module

public class memorycardmodule {
    private int memorysize;

    public memorycardmodule(int memorysize) {
        this.memorysize = memorysize;
    }
    @Provides
    memotycard memoryprovider(){
        Log.d("memory", "size of memory");
        return new memotycard();

    }
}
