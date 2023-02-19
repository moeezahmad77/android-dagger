package com.example.java_application.dagger_basics;

import android.util.Log;

import javax.inject.Inject;

interface UserService {
    void saveUser(String email, String password);
}

public class UserRepository implements UserService {
    private final String TAG = "USER_REPO";

    @Inject
    public UserRepository() {}

    @Override
    public void saveUser(String email, String password) {
        Log.d(TAG, "save user in firebase");
    }
}
