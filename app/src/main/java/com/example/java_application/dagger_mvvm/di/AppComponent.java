package com.example.java_application.dagger_mvvm.di;

import com.example.java_application.MainActivity;
import com.example.java_application.MainActivity2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {
    void inject(MainActivity2 mainActivity2);
}
