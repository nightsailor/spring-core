package com.example.demo.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

// next 1
@Service
public class EmailValidator implements Predicate<String>  {

  @Override
  public boolean test(String arg0) {
    // TODO: Regex to validate email
    
    return true;
  }

}
