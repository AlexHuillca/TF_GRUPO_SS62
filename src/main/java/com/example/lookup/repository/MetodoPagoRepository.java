package com.example.lookup.repository;

import com.example.lookup.entities.EstadoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MetodoPagoRepository extends JpaRepository<MetodoPagoRepository, Integer> {
}