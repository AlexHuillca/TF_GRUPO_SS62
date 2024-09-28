package com.example.lookup.repository;

import com.example.lookup.entities.PrendaTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaTiendaRepository extends JpaRepository<PrendaTienda,Long>
{
}
