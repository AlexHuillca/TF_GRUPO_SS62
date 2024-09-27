package com.example.lookup.Services;

import com.upc.closetlabel.Entities.PreferenciasUsuario;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PreferenciaUsuarioService {
    PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuario);

    List<PreferenciasUsuario> list();

    List<PreferenciasUsuario> list(Integer idusuario);

    String eliminar(Integer id);
}
