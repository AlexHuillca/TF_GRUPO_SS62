package com.example.lookup.Services;

import com.example.lookup.entities.PreferenciasUsuario;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PreferenciaUsuarioService {
    public PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuario);
    public List<PreferenciasUsuario> list();
    public String eliminar(Long id);
}
