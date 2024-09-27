package com.example.lookup.ServiceImplements;

import com.example.lookup.Services.DetallePedidoService;
import com.example.lookup.dtos.DetallePedidoDTO;
import com.example.lookup.entities.DetallePedido;
import com.example.lookup.exceptions.DetallePedidoNotFoundException;
import com.example.lookup.exceptions.IncompleteDataException;
import com.example.lookup.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public DetallePedido findById(Integer id) {
        DetallePedido detallePedidoFound = detallePedidoRepository.findById(id).orElse(null);
        if (detallePedidoFound == null) {
            throw new DetallePedidoNotFoundException("No se encontró un DetallePedido con el id: " + id);
        }
        return detallePedidoFound;
    }

    @Override
    public DetallePedido create(DetallePedidoDTO detallePedidoDTO) {
        // Validar que cantidad y precio sean mayores a 0
        if (detallePedidoDTO.getCantidad() <= 0 || detallePedidoDTO.getPrecio() <= 0) {
            throw new IncompleteDataException("Cantidad y precio deben ser mayores a 0");
        }

        // Validar si el Pedido existe
        Pedido pedido = pedidoRepository.findById(detallePedidoDTO.getPedidoId())
                .orElseThrow(() -> new DetallePedidoNotFoundException("No se encontró el Pedido con id: " + detallePedidoDTO.getPedidoId()));

        // Crear el nuevo DetallePedido
        DetallePedido nuevoDetallePedido = new DetallePedido();
        nuevoDetallePedido.setCantidad(detallePedidoDTO.getCantidad());
        nuevoDetallePedido.setPrecio(detallePedidoDTO.getPrecio());
        nuevoDetallePedido.setPedido(pedido);

        return detallePedidoRepository.save(nuevoDetallePedido);
    }

    @Override
    public DetallePedido update(Integer id, DetallePedidoDTO detallePedidoDTO) {
        DetallePedido detallePedidoFound = detallePedidoRepository.findById(id)
                .orElseThrow(() -> new DetallePedidoNotFoundException("No se encontró un DetallePedido con el id: " + id));

        // Validar que cantidad y precio sean mayores a 0
        if (detallePedidoDTO.getCantidad() <= 0 || detallePedidoDTO.getPrecio() <= 0) {
            throw new IncompleteDataException("Cantidad y precio deben ser mayores a 0");
        }

        detallePedidoFound.setCantidad(detallePedidoDTO.getCantidad());
        detallePedidoFound.setPrecio(detallePedidoDTO.getPrecio());

        return detallePedidoRepository.save(detallePedidoFound);
    }

    @Override
    public void delete(Integer id) {
        if (!detallePedidoRepository.existsById(id)) {
            throw new DetallePedidoNotFoundException("No se encontró un DetallePedido con el id: " + id);
        }
        detallePedidoRepository.deleteById(id);
    }

    @Override
    public List<DetallePedido> list() {
        return detallePedidoRepository.findAll();
    }
}
