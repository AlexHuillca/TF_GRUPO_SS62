package com.example.lookup.ServiceImplements;

import com.example.lookup.entities.PreferenciasUsuario;
import com.example.lookup.exceptions.IncompleteDataException;
import com.example.lookup.exceptions.ResourceNotFoundException;
import com.example.lookup.repository.PreferenciasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferenciasServiceImpl implements PreferenciasService {

    @Autowired
    private PreferenciasRepository preferenciasRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PreferenciasUsuario save(PreferenciasUsuario preferenciasUsuarios) {
        if (preferenciasUsuarios.getIdUsuario() == null || preferenciasUsuarios.getIdUsuario().isEnabled()){
            throw new IncompleteDataException("El usuario no puede ser nulo");
        }

        if (preferenciasUsuarios.getTipoEvento() == null || preferenciasUsuarios.getTipoEvento().describeConstable().isEmpty()){
            throw new IncompleteDataException("El tipo de evento no puede estar vacio");
        }

        if (preferenciasUsuarios.getTipoPrendaFavorito() == null || preferenciasUsuarios.getTipoPrendaFavorito().describeConstable().isEmpty()){
            throw new IncompleteDataException("El tipo de prenda no puede estar vacio");
        }

        if (preferenciasUsuarios.getTallaFavorita() == null || preferenciasUsuarios.getTallaFavorita().describeConstable().isEmpty()){
            throw new IncompleteDataException("La talla no puede estar vacia");
        }
        return preferenciasRepository.save(preferenciasUsuarios);
    }

    @Override
    public PreferenciasUsuario findbyId(Long id) {
        PreferenciasUsuario preferencia = preferenciasRepository.findById(id).orElse(null);
        if(preferencia == null){
            throw new ResourceNotFoundException("No existe la preferencia con el id: "+String.valueOf(id));
        }
        return preferencia;
    }

    @Override
    public PreferenciasUsuario update(PreferenciasUsuario preferenciasUsuarios) {
        if (preferenciasUsuarios.getId() == null){
            throw new IncompleteDataException("El id no puede ser nulo");
        }

        PreferenciasUsuario preferencia = preferenciasRepository.findById(preferenciasUsuarios.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No existe la preferencia con el id: "+String.valueOf(preferenciasUsuarios.getId())));


        modelMapper.map(preferenciasUsuarios,preferencia);
        return preferenciasRepository.save(preferencia);
    }

    @Override
    public void delete(Long id) {
        PreferenciasUsuario prefr = findbyId(id);
        if(prefr == null){
            throw new ResourceNotFoundException("La preferencia con id: " + id + "no se encuentra");
        }

        preferenciasRepository.delete(prefr);

    }
}
