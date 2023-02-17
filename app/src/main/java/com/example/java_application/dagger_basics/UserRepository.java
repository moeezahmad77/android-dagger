package com.example.java_application.dagger_basics;

import android.util.Log;

import javax.inject.Inject;

public class UserRepository {
    private final String TAG = "USER_REPO";

    @Inject
    public UserRepository() {}

    void saveUser(String email, String password) {
        Log.d(TAG, "save user ion db");
    }
}
