package com.example.DatabaseNoSQL_ORM.controllers;


import com.example.DatabaseNoSQL_ORM.entities.User;
import com.example.DatabaseNoSQL_ORM.repositorys.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @PostMapping
    public User createUser(@RequestBody User user){

        return userRepo.save(user);
    }

    @GetMapping
    public List<User> getAllUser(){

        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable long id){

        return userRepo.findById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user){

        user.setId(String.valueOf(id));

        return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){

        userRepo.deleteById(id);
    }


}
