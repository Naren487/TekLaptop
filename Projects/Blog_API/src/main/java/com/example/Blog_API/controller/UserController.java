package com.example.Blog_API.controller;
import com.example.Blog_API.payloads.ApiResponse;
import com.example.Blog_API.payloads.UserDTO;
import com.example.Blog_API.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/")
    public ResponseEntity<UserDTO> createUser( @Valid  @RequestBody UserDTO userDto){
        UserDTO createUserdto=this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserdto, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserDTO userDto, @PathVariable Integer id){
        UserDTO UpdatedUser=this.userService.updateUser(userDto,id);
        return ResponseEntity.ok(UpdatedUser);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer id){
        this.userService.deleteUser(id);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User Successfully Deleted",true),HttpStatus.OK);
    }


    @GetMapping("/")
    public  ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> allUsers=this.userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        return ResponseEntity.ok(this.userService.getUserById(id));
    }
}
