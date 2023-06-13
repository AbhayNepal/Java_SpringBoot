package com.example.Viveka.SpringApp.Services;

import com.example.Viveka.SpringApp.Models.User;
import java.util.*;
public interface UserServices {
    List<User> findAllUsers();
    Optional<User> findUserById(Long Id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long Id);

}
