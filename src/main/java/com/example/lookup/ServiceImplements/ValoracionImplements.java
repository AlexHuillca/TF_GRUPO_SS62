package com.upc.closetlabel.ServicieImplments;

import com.upc.closetlabel.DTO.ValoracionDTOResumen;
import com.upc.closetlabel.Entities.Valoración;
import com.upc.closetlabel.Repository.ValoracionRepositorio;
import com.upc.closetlabel.Servicio.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionImplements implements ValoracionService {

    @Autowired
    private ValoracionRepositorio valoracionRepositorio;

    @Override
    public List<ValoracionDTOResumen>resumen_comentario(){
        return valoracionRepositorio.ResumenComentarios();
    }



    @Override
    public Valoración save (Valoración v)
    {
        return  valoracionRepositorio.save(v);
    }

    @Override
    public String Eliminar(Integer id)
    {
        if(valoracionRepositorio.findById(id)==null)
        {
            return "no se encontro la volariacion";
        }else {

            valoracionRepositorio.deleteById(id);
            return "valoracion eliminada";
        }
    }
}
