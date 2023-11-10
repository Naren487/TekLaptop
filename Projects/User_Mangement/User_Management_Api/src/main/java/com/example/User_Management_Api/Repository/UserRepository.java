package com.example.User_Management_Api.Repository;

import com.example.User_Management_Api.Entity.users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<users,Long> {
}
