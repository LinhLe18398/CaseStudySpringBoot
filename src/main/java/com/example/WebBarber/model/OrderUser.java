package com.example.WebBarber.model;

import jakarta.persistence.*;

@Entity
public class OrderUser {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Service service;
    @ManyToOne
    private Booking booking;
}
