package com.example.lookup.Services;

import com.example.lookup.entities.Preferencias_usuarios;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PreferenciaUsuarioService {
    public Preferencias_usuarios save(Preferencias_usuarios preferenciasUsuario);
    public List<Preferencias_usuarios> list();
    public String eliminar(Long id);
}
