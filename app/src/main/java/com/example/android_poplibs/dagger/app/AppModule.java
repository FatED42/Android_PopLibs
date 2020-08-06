package com.example.android_poplibs.dagger.app;

import android.app.Application;

import com.example.android_poplibs.dagger.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideGreen() {
        return new Green();
    }

}
