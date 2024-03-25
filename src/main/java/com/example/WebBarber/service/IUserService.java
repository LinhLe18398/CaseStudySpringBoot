package com.example.WebBarber.service;

import com.example.WebBarber.model.User;

import java.util.List;

public interface IUserService {
    List<User> findByRole(int id);
}
