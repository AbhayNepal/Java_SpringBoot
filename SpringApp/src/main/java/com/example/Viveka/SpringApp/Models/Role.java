package com.example.Viveka.SpringApp.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    public Role(){

    }
    public Role(String name){
        this.name = name;
    }



}
