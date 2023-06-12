package com.example.Viveka.SpringApp.Controller;

import com.example.Viveka.SpringApp.Models.User;
import com.example.Viveka.SpringApp.Services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {
    private final UserServices userServices;


    public UserController(UserServices userServices) {
        this.userServices = userServices;

    }

    @GetMapping
    public List<User> findAllUser(){
        return userServices.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userServices.findById(id);
    }

    @PostMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userServices.deleteUser(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userServices.saveUser(user);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userServices.saveUser(user);
    }
    }

