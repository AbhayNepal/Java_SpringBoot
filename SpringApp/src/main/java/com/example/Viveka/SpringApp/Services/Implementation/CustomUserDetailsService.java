package com.example.Viveka.SpringApp.Services.Implementation;

import com.example.Viveka.SpringApp.Models.User;
import com.example.Viveka.SpringApp.Repository.UserRepository;
import com.example.Viveka.SpringApp.Services.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username);
        CustomUserDetails userDetails =null;
         if(user!=null){
             userDetails = new CustomUserDetails();
             userDetails.setUser(user);
         }
         else {
             throw new UsernameNotFoundException("User does not exist with the name"+ username);
         }
         return  userDetails;
    }

}
