package com.example.WebBarber.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String imgUrl;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


}
