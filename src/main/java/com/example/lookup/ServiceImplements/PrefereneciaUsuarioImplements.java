package com.example.lookup.ServiceImplements;

import com.upc.closetlabel.Entities.PreferenciasUsuario;
import com.upc.closetlabel.Entities.Usuario;
import com.upc.closetlabel.Repository.PreferenciaUsarioRepository;
import com.upc.closetlabel.Repository.UsarioRepository;
import com.upc.closetlabel.Servicio.PreferenciaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefereneciaUsuarioImplements implements PreferenciaUsuarioService {
    @Autowired
    private PreferenciaUsarioRepository preferenciaUsarioRepository;
    private UsarioRepository usarioRepository;
    @Override
    public PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuario)
    {
        return preferenciaUsarioRepository.save(preferenciasUsuario);
    }

    @Override
    public List<PreferenciasUsuario> list() {
        return null;
    }


    @Override
    public List<PreferenciasUsuario> list(Integer idusuario)
    {
        return usarioRepository.findById(idusuario).map(Usuario::getPreferenciasUsuarios).orElseThrow();
    }

    @Override
    public String eliminar(Integer id)
    {
        if(preferenciaUsarioRepository.findById(id)==null)
        {
            return "La preferencia no existe";
        }else {
            preferenciaUsarioRepository.deleteById(id);
            return"Preferencia de suario eliminada";}

    }

}
