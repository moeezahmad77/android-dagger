package com.example.java_application.dagger_basics;

import android.util.Log;

import javax.inject.Inject;

interface NotificationService {
    void send(String to, String from, String body);
}

public class EmailService {
    private final String TAG = "EMAIL_SVC";

    @Inject
    public EmailService() {}

    public void send(String to, String from, String body) {
        Log.d(TAG, "Send Email");
    }
}
