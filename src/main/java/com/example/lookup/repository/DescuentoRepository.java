package com.upc.closetlabel.Repository;

import com.upc.closetlabel.Entities.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescuentoRepository extends JpaRepository<Descuento,Integer> {

}
