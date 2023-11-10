package com.example.Blog_API.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {
    private int id;
    @NotEmpty
    @Size(min = 4 ,message="Username must be min of 4 characters")
    private String name;
    @NotEmpty
    @Email(message = "Email addess is not Valid!!")
    private String email;
    @NotEmpty
    @Size(min = 4 ,message="Password must be min of 4 characters")
    private String password;
    @NotEmpty
    private String about;

    public UserDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
