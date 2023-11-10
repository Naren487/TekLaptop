package com.example.Blog_API.service;

import com.example.Blog_API.entity.User;
import com.example.Blog_API.payloads.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO updateUser(UserDTO user,Integer userid);
    UserDTO getUserById(Integer userid);
    void deleteUser(Integer userid);
    List<UserDTO> getAllUsers();
}
