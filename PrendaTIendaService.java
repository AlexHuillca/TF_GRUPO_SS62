package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.Entities.PrendaTienda;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PrendaTIendaService {
    PrendaTienda save(PrendaTienda p);

    List<PrendaTienda> list();

    String delete(Integer id);
}
