package com.example.lookup.ServiceImplements;

import com.example.lookup.Services.PrendaTIendaService;
import com.example.lookup.entities.PrendaTienda;
import com.example.lookup.repository.PrendaTientda_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrendaTiendaImplements implements PrendaTIendaService {

    @Autowired
    private PrendaTientda_repository prendaTientdaRepository;

    @Override
    public PrendaTienda save(PrendaTienda p)
    {
        return prendaTientdaRepository.save(p);
    }

    @Override
    public List<PrendaTienda>list()
    {
        return prendaTientdaRepository.findAll();
    }

    @Override
    public String delete(Integer id)
    {
        if(prendaTientdaRepository.findById(id)==null)
        {
            return" nose encontro la prenda seleccionada";
        }else {prendaTientdaRepository.deleteById(id);
        return "prenda eliminada de la base de datos";}
    }
}
