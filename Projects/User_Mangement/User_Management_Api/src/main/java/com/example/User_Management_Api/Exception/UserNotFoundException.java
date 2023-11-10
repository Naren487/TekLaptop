package com.example.User_Management_Api.Exception;

import org.apache.catalina.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find the user with ID:"+id);
    }
}
