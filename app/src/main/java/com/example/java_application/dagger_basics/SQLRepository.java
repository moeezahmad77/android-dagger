package com.example.java_application.dagger_basics;

import android.util.Log;

public class SQLRepository implements UserService {
    private final String TAG = "SQL_REPO";

    @Override
    public void saveUser(String email, String password) {
        Log.d(TAG, "Save user in sql Database");
    }
}
