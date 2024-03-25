package com.example.WebBarber.service;

import com.example.WebBarber.model.Role;
import com.example.WebBarber.model.User;
import com.example.WebBarber.repository.IRoleRepository;
import com.example.WebBarber.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    IRoleRepository iRoleRepository;
    @Override
    public List<User> findByRole(int id){
        Role role = iRoleRepository.findOneById(id);
       return iUserRepository.findAllByRole(role);

    }
}
