package com.example.jwtauthtutorial.repository;

import com.example.jwtauthtutorial.model.ERole;
import com.example.jwtauthtutorial.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
