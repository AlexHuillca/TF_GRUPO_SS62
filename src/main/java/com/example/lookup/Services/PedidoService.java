package com.upc.closetlabel.Servicio;

import com.upc.closetlabel.Entities.Pedido;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PedidoService {
    Pedido save(Pedido p);

    List<Pedido> list();

    String delete(Integer id);
}
