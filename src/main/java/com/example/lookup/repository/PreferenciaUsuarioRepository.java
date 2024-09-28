package com.example.lookup.repository;

import com.example.lookup.entities.PreferenciasUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenciaUsuarioRepository extends JpaRepository<PreferenciasUsuario, Long> {
}
