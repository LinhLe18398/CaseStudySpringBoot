package com.example.WebBarber.service;

import com.example.WebBarber.model.Booking;
import com.example.WebBarber.repository.IBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class BookingService implements IBookingService {
    @Autowired
    IBookingRepository iBookingRepository;

    @Override
    public Iterable<Booking> findAll() {
        return iBookingRepository.findAll();
    }

    @Override
    public Optional<Booking> findById(int id) {
        return iBookingRepository.findById(id);
    }

    @Override
    public Booking save(Booking booking) {
        return iBookingRepository.save(booking);
    }

    @Override
    public void remove(int id) {
        iBookingRepository.deleteById(id);
    }

    @Override
    public List<Booking> findAllByUserId(int id) {
        return iBookingRepository.findAllByUserId(id);
    }
}
