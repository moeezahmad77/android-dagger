package com.example.java_application.dagger_basics;

import com.example.java_application.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * For all the required object we will create the function inside the component which will
 * return the required object
 */

@Component(modules = {UserModule.class, NotificationModule.class})
public interface UserRegistrationComponent {

//    UserRegistrationService getUserRegistrationService();
//    EmailService getEmailService();

    void inject(MainActivity mainActivity);

    @Component.Factory
    interface Factory {
        UserRegistrationComponent create(@BindsInstance int retryCount);
    }
}
