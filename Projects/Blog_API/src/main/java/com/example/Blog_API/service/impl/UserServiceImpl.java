package com.example.Blog_API.service.impl;

import com.example.Blog_API.entity.User;
import com.example.Blog_API.payloads.UserDTO;
import com.example.Blog_API.repository.UserRepository;
import com.example.Blog_API.service.UserService;
import com.example.Blog_API.exceptions.ResouceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserDTO createUser(UserDTO userDto) {

        User user=this.dtoToUser(userDto);
        User savedUser=this.userRepo.save(user);
        return this.userToDto(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Integer userid) {
        User user = this.userRepo.findById(userid)
                .orElseThrow(()->new ResouceNotFoundException("User","Id",userid));
        user.setName(userDTO.getName());
        user.setAbout(userDTO.getAbout());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());


        User updatedUser=this.userRepo.save(user);
        UserDTO userDto1=this.userToDto(updatedUser);
        return userDto1;
    }

    @Override
    public UserDTO getUserById(Integer userid) {
        User user = this.userRepo.findById(userid)
                .orElseThrow(()->new ResouceNotFoundException("User","Id",userid));
        return this.userToDto(user);
    }

    @Override
    public void deleteUser(Integer userid) {
        User user=this.userRepo.findById(userid).orElseThrow(()->new ResouceNotFoundException("User","Id",userid));
        this.userRepo.delete(user);

    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users=this.userRepo.findAll();
        return users.stream().map(this::userToDto).collect(Collectors.toList());

    }
    private User dtoToUser(UserDTO userDto){
        User user=this.modelMapper.map(userDto,User.class);
//        user.setId(userDto.getId());
//        user.setName(userDto.getName());
//        user.setEmail(userDto.getEmail());
//        user.setPassword(userDto.getPassword());
//        user.setAbout(userDto.getAbout());
        return  user;
    }
    private UserDTO userToDto(User user){
        UserDTO userDto=this.modelMapper.map(user,UserDTO.class);
//        userDto.setId(user.getId());
//        userDto.setName(user.getName());
//        userDto.setEmail(user.getEmail());
//        userDto.setPassword(user.getPassword());
//        userDto.setAbout(user.getAbout());
        return  userDto;
    }
}
