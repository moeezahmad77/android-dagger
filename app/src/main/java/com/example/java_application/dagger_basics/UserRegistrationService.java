package com.example.java_application.dagger_basics;

import javax.inject.Inject;

public class UserRegistrationService {
    private EmailService emailService;
    private UserRepository userRepo;

    @Inject
    public UserRegistrationService(EmailService emailService, UserRepository userRepo) {
        this.emailService = emailService;
        this.userRepo = userRepo;
    }

    public void registerUser(String email, String password) {
        userRepo.saveUser(email, password);
        emailService.send(email, "", "");
    }
}
