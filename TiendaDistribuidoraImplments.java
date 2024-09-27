package com.upc.closetlabel.ServicieImplments;

import com.upc.closetlabel.Entities.TiendaDistribuidora;
import com.upc.closetlabel.Repository.TiendaDistribuidoraRepository;
import com.upc.closetlabel.Servicio.TiendaDistribuidoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaDistribuidoraImplments implements TiendaDistribuidoraService {

    @Autowired
    TiendaDistribuidoraRepository tiendaDistribuidoraRepository;

    @Override
    public TiendaDistribuidora save ( TiendaDistribuidora t)
    {
        return tiendaDistribuidoraRepository.save(t);
    }

    @Override
    public List<TiendaDistribuidora>list( )
    {
        return tiendaDistribuidoraRepository.findAll();
    }

    @Override
    public String delete(Integer id)
    {
        if(tiendaDistribuidoraRepository.findById(id)== null)
        {
            return "no se encontro en la base de datos";
        }

        else {tiendaDistribuidoraRepository.deleteById(id);
            return "eliminado de la base de datos";

        }
    }
}
