package com.example.java_application.dagger_basics;

import android.util.Log;

public class MessageService implements NotificationService {

    @Override
    public void send(String to, String from, String body) {
        Log.d("MSG_SERVICE", "send message through message service");
    }
}
