package com.example.lookup.repository;

import ch.qos.logback.core.net.server.Client;
import com.example.lookup.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer> {


}
