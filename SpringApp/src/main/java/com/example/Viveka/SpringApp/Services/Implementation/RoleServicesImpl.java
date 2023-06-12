package com.example.Viveka.SpringApp.Services.Implementation;

import com.example.Viveka.SpringApp.Models.Role;
import com.example.Viveka.SpringApp.Repository.RoleRepository;
import com.example.Viveka.SpringApp.Services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServicesImpl implements RoleServices {
    @Autowired
    private final RoleRepository roleRepository;

    public RoleServicesImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long Id) {
    roleRepository.deleteById(Id);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }
}
