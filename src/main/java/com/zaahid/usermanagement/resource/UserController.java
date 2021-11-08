package com.zaahid.usermanagement.resource;

import com.zaahid.usermanagement.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

   @Autowired
   private UserRepository repository; 
    
}
