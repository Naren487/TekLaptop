package com.example.User_Management_Api.Controller;
import com.example.User_Management_Api.Entity.users;
import com.example.User_Management_Api.Exception.UserNotFoundException;
import com.example.User_Management_Api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserRepository userRepo;
    @PostMapping("/AddUser")
    public String getAll(@RequestBody users u){
        System.out.println(u.getName());
        userRepo.save(u);
        return "User Data Saved";
    }
    @GetMapping("/getUsers")
    public List<users> getusers(){
        return (List<users>) userRepo.findAll();
    }

    @GetMapping("/getUser/{id}")
    public users getUserById(@PathVariable Long id){
        return userRepo.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
    }

    @PutMapping("/editUser/{id}")
    public  users editUser(@RequestBody users newUser,@PathVariable Long id){
        return userRepo.findById(id)
                .map(user->{
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepo.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        if(!userRepo.existsById(id)){
            throw  new UserNotFoundException(id);
        }
        userRepo.deleteById(id);
        return "User with Id: "+id+" has been deleted Success";
    }
}