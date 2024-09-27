package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.Entities.Descuento;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface DescuentoService {
    Descuento save(Descuento d);

    List<Descuento> list();

    String delete(Integer id);
}
