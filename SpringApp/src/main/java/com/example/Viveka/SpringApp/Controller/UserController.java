package com.example.Viveka.SpringApp.Controller;

import com.example.Viveka.SpringApp.Models.User;
import com.example.Viveka.SpringApp.Services.RoleServices;
import com.example.Viveka.SpringApp.Services.UserServices;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/User")
public class UserController {
   private BCryptPasswordEncoder passswordEncoder = new BCryptPasswordEncoder();
    private final UserServices userServices;



    public UserController(UserServices userServices,RoleServices roleServices) {
        this.userServices = userServices;

    }


    @GetMapping
    public List<User> findAllUser(){
        return userServices.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") Long id){
        return userServices.findUserById(id);
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

        String pwd = user.getPassword();
        String encryptedPwd = passswordEncoder.encode(pwd);
        user.setPassword(encryptedPwd);
        return userServices.saveUser(user);
    }
    }

