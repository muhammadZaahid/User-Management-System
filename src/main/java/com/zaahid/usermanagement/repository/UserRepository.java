package com.zaahid.usermanagement.repository;

import com.zaahid.usermanagement.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
    
}
