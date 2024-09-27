package com.upc.closetlabel.ServicieImplments;

import com.upc.closetlabel.Entities.Descuento;
import com.upc.closetlabel.Repository.DescuentoRepository;
import com.upc.closetlabel.Servicio.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescuentoImplements implements DescuentoService {

    @Autowired
    private DescuentoRepository descuentoRepository;

    @Override
    public Descuento save(Descuento d)
    {
        return descuentoRepository.save(d);
    }


    @Override
    public List<Descuento> list()
    {
        return descuentoRepository.findAll();
    }
    @Override
    public String delete(Integer id)
    {
        if(descuentoRepository.findById(id)== null)
        {
            return "no se encontro el descuento";
        }
        else descuentoRepository.deleteById(id);
        return "descuento eliminado de la base de datos";
    }
}
