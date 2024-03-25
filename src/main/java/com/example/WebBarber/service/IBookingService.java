package com.example.WebBarber.service;

import com.example.WebBarber.model.Booking;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IBookingService {
    //    public void bookService(int id, int user_Id, String status, Date time);
    Iterable<Booking> findAll();

    Optional<Booking> findById(int id);

    Booking save(Booking booking);

    void remove(int id);

    List<Booking> findAllByUserId(int id);
}
