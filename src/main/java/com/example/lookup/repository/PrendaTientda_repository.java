package com.example.lookup.repository;

import com.example.lookup.entities.PrendaTienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaTientda_repository extends JpaRepository<PrendaTienda,Integer>
{
}
