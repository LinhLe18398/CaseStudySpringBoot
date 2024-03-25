package com.example.WebBarber.repository;

import com.example.WebBarber.model.Booking;
import com.example.WebBarber.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookingRepository extends JpaRepository<Booking,Integer> {
    List<Booking> findAllByUserId(int id);

}
