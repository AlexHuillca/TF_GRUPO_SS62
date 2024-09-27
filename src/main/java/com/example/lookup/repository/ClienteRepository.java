package com.upc.closetlabel.Repository;

import com.upc.closetlabel.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer> {


}
