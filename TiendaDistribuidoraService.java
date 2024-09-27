package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.Entities.TiendaDistribuidora;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface TiendaDistribuidoraService {
    TiendaDistribuidora save(TiendaDistribuidora t);

    List<TiendaDistribuidora> list();

    String delete(Integer id);
}
