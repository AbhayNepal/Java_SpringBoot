package com.example.Viveka.SpringApp.Services.Implementation;

import com.example.Viveka.SpringApp.Models.User;
import com.example.Viveka.SpringApp.Repository.UserRepository;
import com.example.Viveka.SpringApp.Services.UserServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;

    public UserServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long Id) {
        return userRepository.findById(Id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long Id) {
        userRepository.deleteById(Id);
    }
}
