package com.zaahid.usermanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "User")
public class User {
    @Id
    private int id;
    private String name;
    private int phoneNumber;
    private String email;

}
