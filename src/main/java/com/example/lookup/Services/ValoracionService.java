package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.DTO.ValoracionDTOResumen;
import com.upc.closetlabel.Entities.Valoración;

import java.util.List;

public interface ValoracionService {
    List<ValoracionDTOResumen>resumen_comentario();

    Valoración save(Valoración v);

    String Eliminar(Integer id);
}
