package com.example.WebBarber.repository;

import com.example.WebBarber.model.Service;
import com.example.WebBarber.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IServiceRepository extends JpaRepository<Service,Integer> {


}
