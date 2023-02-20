package com.example.java_application;

import android.app.Application;

import com.example.java_application.dagger_mvvm.di.AppComponent;
import com.example.java_application.dagger_mvvm.di.DaggerAppComponent;

public class MainApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().build();
    }
}
