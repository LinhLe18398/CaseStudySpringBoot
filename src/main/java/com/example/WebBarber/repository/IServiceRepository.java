package com.example.WebBarber.repository;

import com.example.WebBarber.model.Service;
import com.example.WebBarber.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {

    Page<Service> findAllByNameContains(Pageable pageable,String keyword);
}
