package com.upc.closetlabel.ServicieImplments;

import com.upc.closetlabel.Entities.Cliente;
import com.upc.closetlabel.Repository.ClienteRepository;
import com.upc.closetlabel.Servicio.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImplments implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente save ( Cliente c)
    {
        return  clienteRepository.save(c);
    }


    @Override
    public List<Cliente>list()
        {
        return clienteRepository.findAll();

        }

        @Override
    public String delete(Integer id)
        {
            if(clienteRepository.findById(id)==null)
            {
                return "no se encontro al cliente";
            }else {
                clienteRepository.deleteById(id);
                return "cliente eliminado";
            }
        }
}
