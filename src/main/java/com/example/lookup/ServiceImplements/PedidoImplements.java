package com.upc.closetlabel.ServicieImplments;

import com.upc.closetlabel.Entities.Pedido;
import com.upc.closetlabel.Repository.PedidoRepository;
import com.upc.closetlabel.Servicio.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoImplements implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    @Override
    public Pedido save ( Pedido p)
    {
        return pedidoRepository.save(p);
    }

    @Override
    public List<Pedido>list()
    {
        return pedidoRepository.findAll();
    }


    @Override
    public String delete(Integer id)
        {
            if(pedidoRepository.findById(id)== null)
            {
                return "no se encontro el pedido";
            }
            else {

                pedidoRepository.deleteById(id);
                return "pedido eliminado";
            }


        }
}
