package com.example.Viveka.SpringApp.Models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
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
