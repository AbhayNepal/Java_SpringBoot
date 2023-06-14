package com.example.Viveka.SpringApp.Repository;

import com.example.Viveka.SpringApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);
}