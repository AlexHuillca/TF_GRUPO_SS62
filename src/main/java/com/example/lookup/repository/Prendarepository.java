package com.example.lookup.repository;

import com.upc.closetlabel.Entities.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Prendarepository extends JpaRepository<Prenda,Integer> {
}
