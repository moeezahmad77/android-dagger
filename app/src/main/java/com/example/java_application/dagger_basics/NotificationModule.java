package com.example.java_application.dagger_basics;

import dagger.Module;
import dagger.Provides;

@Module
public class NotificationModule {

    @Provides
    public NotificationService getMessageService(int retryCount) {
        return new MessageService(retryCount);
    }
}
