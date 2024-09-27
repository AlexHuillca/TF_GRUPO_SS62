package com.example.lookup.Services;

import com.example.lookup.entities.PreferenciasUsuario;

public interface PreferenciasService {
    public PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuarios);
    public PreferenciasUsuario findbyId(Long id);
    public PreferenciasUsuario update(PreferenciasUsuario preferenciasUsuarios);
    public void delete(Long id);

}
