package com.example.Viveka.SpringApp.Controller;

import com.example.Viveka.SpringApp.Models.Role;
import com.example.Viveka.SpringApp.Services.RoleServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Role")
public class RoleController {
    private final RoleServices roleServices;


    public RoleController(RoleServices roleServices) {
        this.roleServices = roleServices;

    }

    @GetMapping
    public List<Role> findAllRoles(){
        return roleServices.findAllRoles();
    }


    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable("id") Long id){
        roleServices.deleteRole(id);
    }

    @PutMapping
    public Role updateRole(@RequestBody Role role){
        return roleServices.saveRole(role);
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role){
        return roleServices.saveRole(role);
    }
    }

