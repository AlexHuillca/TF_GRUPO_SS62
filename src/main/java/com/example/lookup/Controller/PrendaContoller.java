package com.example.lookup.Controller;

import com.upc.closetlabel.DTO.PrendaDTO;
import com.upc.closetlabel.Entities.Prenda;
import com.upc.closetlabel.Servicio.PrendaSAervice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrendaContoller {

    @Autowired
    private PrendaSAervice prendaSAervice;

    ModelMapper mp;


    @PostMapping("/prenda")
    public ResponseEntity<PrendaDTO>save(@RequestBody PrendaDTO prendaDTO)
    {
        Prenda p= mp.map(prendaDTO,Prenda.class);

        prendaSAervice.save(p);

        return  new ResponseEntity<PrendaDTO>(prendaDTO, HttpStatus.OK);
    }


    @GetMapping("/prendas")
    public ResponseEntity<List<PrendaDTO>>list()
    {
        return new ResponseEntity<List<PrendaDTO>>(Arrays.asList(mp.map(prendaSAervice.list(),PrendaDTO.class)),HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/prenda/{id}")

    public ResponseEntity<String>delete(@RequestBody Integer id)
    {
        return new ResponseEntity<String>(prendaSAervice.delelte(id),HttpStatus.OK);
    }


}
