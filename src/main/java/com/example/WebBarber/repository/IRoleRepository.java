package com.example.WebBarber.repository;

import com.example.WebBarber.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Integer> {
    public Role findOneById(int id);

}
