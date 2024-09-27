package com.upc.closetlabel.Controller;

import com.upc.closetlabel.DTO.PedidoDTO;
import com.upc.closetlabel.Entities.Pedido;
import com.upc.closetlabel.Servicio.PedidoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    ModelMapper mp ;




    @PostMapping("/pedido")
    public ResponseEntity<PedidoDTO> save(@RequestBody PedidoDTO pedidoDTO)
    {
        Pedido p = mp.map(pedidoDTO,Pedido.class);

        pedidoService.save(p);

        return new ResponseEntity<PedidoDTO>(pedidoDTO,HttpStatus.OK);
    }

    @GetMapping("/pedidos")

    public ResponseEntity<List<PedidoDTO>>list()
    {
        return  new ResponseEntity<List<PedidoDTO>>(Arrays.asList(mp.map(pedidoService.list(),PedidoDTO[].class)),HttpStatus.OK);
    }

    @DeleteMapping("/elimianrpedidios/{id}")

    public ResponseEntity<String> delete(@PathVariable Integer id)
    {
        return new ResponseEntity<String>(pedidoService.delete(id),HttpStatus.OK);
    }
}
