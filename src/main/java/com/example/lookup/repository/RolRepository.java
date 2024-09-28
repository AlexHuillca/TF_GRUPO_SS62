package com.example.lookup.repository;

import com.example.lookup.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RolRepository extends JpaRepository<Rol, Long> {
}