package com.example.java_application.dagger_basics;

import javax.inject.Inject;

public class UserRegistrationService {
    private NotificationService notificationService;
    private UserService userService;

    @Inject
    public UserRegistrationService(NotificationService notificationService, UserService userService) {
        this.notificationService = notificationService;
        this.userService = userService;
    }

    public void registerUser(String email, String password) {
        userService.saveUser(email, password);
        notificationService.send(email, "", "");
    }
}
