package com.zaahid.usermanagement.resource;

import java.util.List;

import com.zaahid.usermanagement.model.User;
import com.zaahid.usermanagement.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

   @Autowired
   private UserRepository repository; 

   @PostMapping("/addUser")
   public String saveUser(@RequestBody User user){
        repository.save(user);
        return "Added user with id : " + user.getId();
   }

   @GetMapping("/findAllUsers")
   public List<User> getUsers(){
       return repository.findAll();
   }
    
}
