package com.example.java_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.java_application.dagger_basics.DaggerUserRegistrationComponent;
import com.example.java_application.dagger_basics.EmailService;
import com.example.java_application.dagger_basics.UserRegistrationComponent;
import com.example.java_application.dagger_basics.UserRegistrationService;

/**
 * There are mainly three concepts in dagger
 * → Consumer (classes which want to consume the object) @inject
 * → Producer (which will create the required objects for consumer classes ) @Modules @Provides @Binds
 * -> Connector (which will connect the consumer and the producer) @Component
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserRegistrationComponent userRegistrationComponent = DaggerUserRegistrationComponent.builder().build();
        UserRegistrationService userRegistrationService = userRegistrationComponent.getUserRegistrationService();
        EmailService emailService = userRegistrationComponent.getEmailService();
        userRegistrationService.registerUser("some_email", "some password");
    }
}