package com.example.lookup.Controller;

import com.upc.closetlabel.DTO.PreferenciadeusuarioDTO;
import com.upc.closetlabel.Entities.PreferenciasUsuario;
import com.upc.closetlabel.Servicio.PreferenciaUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PreferenciaUsuarioController {


    @Autowired
    private PreferenciaUsuarioService preferenciaUsuarioService;

    ModelMapper mp;


    @PostMapping("/AgregarPreferencia")
    public ResponseEntity<PreferenciadeusuarioDTO> save (@RequestBody PreferenciadeusuarioDTO preferenciadeusuarioDTO)
    {
        mp  = new ModelMapper();
        PreferenciasUsuario p = mp.map(preferenciadeusuarioDTO,PreferenciasUsuario.class);

        preferenciaUsuarioService.save(p);
        return new ResponseEntity<PreferenciadeusuarioDTO>(preferenciadeusuarioDTO, HttpStatus.OK);
    }


    @GetMapping("/preferencias/{id}")
    public ResponseEntity<List<PreferenciadeusuarioDTO>>list(@PathVariable Integer id)
    {
        mp= new ModelMapper();
        return new ResponseEntity<List<PreferenciadeusuarioDTO>>(Arrays.asList(mp.map(preferenciaUsuarioService.list(id),PreferenciadeusuarioDTO[].class)),HttpStatus.OK);
    }


    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> delete(@RequestBody Integer id)
    {
        mp= new ModelMapper();

        return  new ResponseEntity<String>(preferenciaUsuarioService.eliminar(id),HttpStatus.OK);
    }
}