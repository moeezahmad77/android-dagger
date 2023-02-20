package com.example.java_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import javax.inject.Inject;

/**
 * There are mainly three concepts in dagger
 * → Consumer (classes which want to consume the object) @inject
 * → Producer (which will create the required objects for consumer classes ) @Modules @Provides @Binds
 * → Connector (which will connect the consumer and the producer) @Component
 */

public class MainActivity extends AppCompatActivity {

//    @Inject
//    UserRegistrationService userRegistrationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * the above approach uses the builder pattern to build the dagger component.
         */
//        UserRegistrationComponent userRegistrationComponent = DaggerUserRegistrationComponent.builder().build();

//        UserRegistrationService userRegistrationService = userRegistrationComponent.getUserRegistrationService();
//        EmailService emailService = userRegistrationComponent.getEmailService();
//        userRegistrationService.registerUser("some_email", "some password");

//        userRegistrationComponent.inject(this);
//        userRegistrationService.registerUser("some email", "password1234");

//        UserRegistrationComponent userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3);
//        userRegistrationComponent.inject(this);
//        userRegistrationService.registerUser("some email", "some password");

    }
}