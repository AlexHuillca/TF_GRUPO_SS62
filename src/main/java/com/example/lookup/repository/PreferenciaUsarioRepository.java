package com.example.lookup.repository;

import com.upc.closetlabel.Entities.PreferenciasUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenciaUsarioRepository extends JpaRepository<PreferenciasUsuario,Integer> {


}
