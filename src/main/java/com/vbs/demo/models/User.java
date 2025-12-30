package com.vbs.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data//geter seter method
@AllArgsConstructor
@NoArgsConstructor
public class User{

    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generates unique values
    int id;
    @Column(nullable = false,unique = true)

    String username;
    @Column(nullable = false)

    String password;
    @Column(nullable = false,unique = true)

    String email;
    @Column(nullable = false)

    String name;
    @Column(nullable = false)

    String role;
    @Column(nullable = false)

    double balance;



}
