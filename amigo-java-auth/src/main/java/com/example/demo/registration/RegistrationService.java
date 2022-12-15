package com.example.demo.registration;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrationService {

  private EmailValidator EmailValidator;

  public String register(RegistrationRequest request) {

    // next 1

    boolean isValidEmail = EmailValidator.test(request.getEmail());

    if(!isValidEmail) {
      throw new IllegalStateException("email not valid");
    }

    return "it works";
  }

}
