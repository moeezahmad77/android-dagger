package com.example.java_application.dagger_basics;

import dagger.Component;

/**
 * For all the required object we will create the function inside the component which will
 * return the required object
 */

@Component
public interface UserRegistrationComponent {

    UserRegistrationService getUserRegistrationService();

    EmailService getEmailService();
}
