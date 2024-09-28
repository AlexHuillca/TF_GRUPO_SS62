package com.example.lookup.Controller;

import com.example.lookup.Services.PrendaTiendaService;
import com.example.lookup.dtos.PrendaTiendaDTO;
import com.example.lookup.entities.PrendaTienda;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrendaTiendaController {

    @Autowired
    private PrendaTiendaService prendaTIendaService;
    ModelMapper mp;


    @PostMapping("/prendatienda")
    public ResponseEntity<PrendaTiendaDTO>save(PrendaTiendaDTO prendaTiendaDTO)
    {

        PrendaTienda p = mp.map(prendaTiendaDTO,PrendaTienda.class);
        return new ResponseEntity<PrendaTiendaDTO>(prendaTiendaDTO, HttpStatus.OK);
    }

    @GetMapping("/prendastiendas")
    public ResponseEntity<List<PrendaTiendaDTO>>list()
    {
        return new ResponseEntity<List<PrendaTiendaDTO>>(Arrays.asList(mp.map(prendaTIendaService.list(),PrendaTiendaDTO[].class)),HttpStatus.OK);
    }

    @DeleteMapping("/Eliminar/prendatienda/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id)
    {
        return new ResponseEntity<String>(prendaTIendaService.delete(id),HttpStatus.OK);
    }
}
