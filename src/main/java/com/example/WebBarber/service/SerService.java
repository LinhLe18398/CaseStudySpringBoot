package com.example.WebBarber.service;

import com.example.WebBarber.model.Service;
import com.example.WebBarber.repository.IServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import java.util.Optional;
@org.springframework.stereotype.Service
public class SerService implements ISerService {
    @Autowired
    IServiceRepository iServiceRepository;

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return iServiceRepository.findAll( pageable);
    }

    @Override
    public Optional<Service> findById(int id) {
        return iServiceRepository.findById(id);
    }

    @Override
    public Service save(Service service) {
        return iServiceRepository.save(service);
    }

    @Override
    public void remove(int id) {
        iServiceRepository.deleteById(id);
    }

    @Override
    public Page<Service> findAllByName(Pageable pageable, String keyword) {
        return iServiceRepository.findAllByNameContains((org.springframework.data.domain.Pageable) pageable,keyword);
    }
}
