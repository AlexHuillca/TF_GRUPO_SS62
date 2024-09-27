package com.upc.closetlabel.Controller;

import com.upc.closetlabel.DTO.TiendaDistribuidoraDTO;
import com.upc.closetlabel.Entities.TiendaDistribuidora;
import com.upc.closetlabel.Repository.TiendaDistribuidoraRepository;
import com.upc.closetlabel.Servicio.TiendaDistribuidoraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TiendaDistribuidoraController {
    @Autowired
    private TiendaDistribuidoraService tiendaDistribuidoraService;

    ModelMapper mp;

    @PostMapping("/prendadistribuidora")
    public ResponseEntity<TiendaDistribuidoraDTO> save (TiendaDistribuidoraDTO tiendaDistribuidoraDTO)
    {
        TiendaDistribuidora t = mp.map(tiendaDistribuidoraDTO, TiendaDistribuidora.class);
        tiendaDistribuidoraService.save(t);

        return new ResponseEntity<TiendaDistribuidoraDTO>(tiendaDistribuidoraDTO,HttpStatus.OK);
    }

    @GetMapping("/tiendasdistribuidoras")
    public ResponseEntity<List<TiendaDistribuidoraDTO>>list()
    {
        return new ResponseEntity<List<TiendaDistribuidoraDTO>>(Arrays.asList(mp.map(tiendaDistribuidoraService.list(),TiendaDistribuidoraDTO[].class)),HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String>delete(@PathVariable Integer id)
    {
        return new ResponseEntity<String>(tiendaDistribuidoraService.delete(id),HttpStatus.OK);
    }
}
