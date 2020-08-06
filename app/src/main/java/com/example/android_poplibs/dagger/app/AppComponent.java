package com.example.android_poplibs.dagger.app;

import com.example.android_poplibs.dagger.DaggerActivity;
import com.example.android_poplibs.dagger.Red;
import com.example.android_poplibs.dagger.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);
    void inject(Red red);
    void inject(White white);
}