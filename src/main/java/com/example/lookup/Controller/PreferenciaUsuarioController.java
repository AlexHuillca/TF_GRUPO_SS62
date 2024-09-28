package com.example.lookup.Controller;

import com.example.lookup.Services.PreferenciaUsuarioService;
import com.example.lookup.dtos.PreferenciadeusuarioDTO;
import com.example.lookup.entities.PreferenciasUsuario;
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
    public ResponseEntity<List<PreferenciadeusuarioDTO>>list(@PathVariable Long id)
    {
        mp= new ModelMapper();
        return new ResponseEntity<List<PreferenciadeusuarioDTO>>(Arrays.asList(mp.map(preferenciaUsuarioService.list(),PreferenciadeusuarioDTO[].class)),HttpStatus.OK);
    }


    @DeleteMapping("/eliminar/preferencia/{id}")
    public ResponseEntity<String> delete(@RequestBody Long id)
    {
        mp= new ModelMapper();

        return  new ResponseEntity<String>(preferenciaUsuarioService.eliminar(id),HttpStatus.OK);
    }
}
