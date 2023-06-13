package com.example.Viveka.SpringApp.Services;

import com.example.Viveka.SpringApp.Models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleServices {
    List<Role> findAllRoles();

    Optional<Role> findRoleById(Long Id);
    Role updateRole(Role role);
    void deleteRole(Long Id);
    Role saveRole(Role role);
}
