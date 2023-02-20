package com.example.java_application.dagger_basics;

import android.util.Log;

public class MessageService implements NotificationService {

    private String TAG = "MSG_SERVICE";
    private int retryCount;

    public MessageService(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public void send(String to, String from, String body) {
        Log.d("MSG_SERVICE", "send message through message service");
        Log.d(TAG, "retry count is" + retryCount);
    }
}
