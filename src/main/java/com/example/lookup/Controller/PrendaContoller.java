package com.example.lookup.Controller;

import com.example.lookup.Services.PrendaService;
import com.example.lookup.dtos.PrendaDTO;
import com.example.lookup.entities.Prenda;
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
    private PrendaService prendaService;

    ModelMapper mp;


    @PostMapping("/prenda")
    public ResponseEntity<PrendaDTO>save(@RequestBody PrendaDTO prendaDTO)
    {
        Prenda p= mp.map(prendaDTO,Prenda.class);

        prendaService.save(p);

        return  new ResponseEntity<PrendaDTO>(prendaDTO, HttpStatus.OK);
    }


    @GetMapping("/prendas")
    public ResponseEntity<List<PrendaDTO>>list()
    {
        return new ResponseEntity<List<PrendaDTO>>(Arrays.asList(mp.map(prendaService.list(),PrendaDTO.class)),HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/prenda/{id}")

    public ResponseEntity<String>delete(@RequestBody Long id)
    {
        return new ResponseEntity<String>(prendaService.delete(id),HttpStatus.OK);
    }


}
