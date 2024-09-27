package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.Entities.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface ClienteService {
    Cliente save(Cliente c);

    List<Cliente> list();

    String delete(Integer id);
}
