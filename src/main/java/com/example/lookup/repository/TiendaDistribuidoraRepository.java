package com.upc.closetlabel.Repository;

import com.upc.closetlabel.Entities.TiendaDistribuidora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaDistribuidoraRepository extends JpaRepository<TiendaDistribuidora,Integer> {
}
