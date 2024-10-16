package com.example.lookup.ServiceImplements;

import com.example.lookup.Services.PreferenciaUsuarioService;
import com.example.lookup.entities.Preferencias_usuarios;
import com.example.lookup.repository.PreferenciaUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefereneciaUsuarioImplements implements PreferenciaUsuarioService {
    @Autowired
    private PreferenciaUsuarioRepository preferenciaUsarioRepository;

    @Override
    public Preferencias_usuarios save(Preferencias_usuarios preferenciasUsuario)
    {
        return preferenciaUsarioRepository.save(preferenciasUsuario);
    }

    @Override
    public List<Preferencias_usuarios> list() {
        return preferenciaUsarioRepository.findAll();
    }

    @Override
    public String eliminar(Long id)
    {
        if(preferenciaUsarioRepository.findById(id)==null)
        {
            return "La preferencia no existe";
        }else {
            preferenciaUsarioRepository.deleteById(id);
            return"Preferencia de suario eliminada";}

    }

}
