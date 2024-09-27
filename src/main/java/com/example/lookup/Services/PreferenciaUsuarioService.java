package com.example.lookup.Services;

import com.example.lookup.entities.PreferenciasUsuario;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PreferenciaUsuarioService {
    PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuario);



    List<PreferenciasUsuario> list(Integer idusuario);

    String eliminar(Integer id);

    List<PreferenciasUsuario> list(Long idusuario);

    String eliminar(Long id);
}
