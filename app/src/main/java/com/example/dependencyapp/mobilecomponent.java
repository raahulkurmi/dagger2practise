package com.example.dependencyapp;

import dagger.Component;

@Component(modules = memorycardmodule.class)
public interface mobilecomponent {
    mobile getmobile();


}
