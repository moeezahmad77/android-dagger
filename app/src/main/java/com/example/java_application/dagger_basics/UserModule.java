package com.example.java_application.dagger_basics;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    public UserService getSqlRepository() {
        return new SQLRepository();
    }
}
