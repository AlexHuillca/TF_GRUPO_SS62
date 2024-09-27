package com.example.lookup.Services;


import com.example.lookup.dtos.DetallePedidoDTO;
import com.example.lookup.entities.DetallePedido;

import java.util.List;

public interface DetallePedidoService {

    DetallePedido findById(Integer id);

    DetallePedido create(DetallePedidoDTO detallePedidoDTO);

    DetallePedido update(Integer id, DetallePedidoDTO detallePedidoDTO);

    void delete(Integer id);

    List<DetallePedido> list();
}