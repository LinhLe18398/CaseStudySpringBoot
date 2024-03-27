package com.example.WebBarber.service;

import com.example.WebBarber.model.Service;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface ISerService {
    Page<Service> findAll(Pageable pageable);
    Optional<Service> findById(int id);
    Service save(Service service);
    void remove(int id);
    Page<Service> findAllByName(Pageable pageable, String keyword);
}
