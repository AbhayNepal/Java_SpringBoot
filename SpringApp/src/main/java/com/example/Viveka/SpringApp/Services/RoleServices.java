package com.example.Viveka.SpringApp.Services;

import com.example.Viveka.SpringApp.Models.Role;

import java.util.List;

public interface RoleServices {
    List<Role> findAllRoles();
    Role updateRole(Role role);
    void deleteRole(Long Id);
    Role saveRole(Role role);
}
