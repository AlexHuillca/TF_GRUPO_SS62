package com.upc.closetlabel.Controller;

import com.upc.closetlabel.DTO.ClienteDTO;
import com.upc.closetlabel.Entities.Cliente;
import com.upc.closetlabel.Servicio.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CLientecontroller {

    @Autowired
    private ClienteService clienteService;

    ModelMapper mp;


    @PostMapping("/cliente")
    public ResponseEntity<ClienteDTO>save (@RequestBody ClienteDTO clienteDTO)
    {
        Cliente c = mp.map(clienteDTO,Cliente.class);
        clienteService.save(c);

        return new ResponseEntity<ClienteDTO>(clienteDTO, HttpStatus.OK);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDTO>> list()
    {
        return new ResponseEntity<List<ClienteDTO>>(Arrays.asList(mp.map(clienteService.list(),ClienteDTO[].class)),HttpStatus.OK);
    }


    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> delete( @PathVariable Integer id)
        {
        return new ResponseEntity<String>(clienteService.delete(id),HttpStatus.OK);
        }
}
