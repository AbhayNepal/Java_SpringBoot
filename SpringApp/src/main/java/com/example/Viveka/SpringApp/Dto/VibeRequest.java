package com.example.Viveka.SpringApp.Dto;

import com.example.Viveka.SpringApp.Models.Role;
import com.example.Viveka.SpringApp.Models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VibeRequest {
    private Role role;
    private User user;
}
