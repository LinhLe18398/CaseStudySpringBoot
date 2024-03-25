package com.example.WebBarber.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private String urlImage;
    @ManyToOne
    private Role role;



}
