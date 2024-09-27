package com.example.lookup.Controller;

import com.example.lookup.Services.PreferenciasService;
import com.example.lookup.entities.PreferenciasUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PreferenciaController {

    @Autowired
    PreferenciasService preferenciasService;

    @PostMapping("/preferencia/register")
    public ResponseEntity<PreferenciasUsuario> createPreferencia(@RequestBody PreferenciasUsuario prefe) {
        PreferenciasUsuario newPrefer = preferenciasService.save(prefe);
        if (newPrefer==null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(newPrefer, HttpStatus.CREATED);
    }


    @PutMapping("/preferencia")
    public ResponseEntity<PreferenciasUsuario> updatePreferencia(@RequestBody PreferenciasUsuario prefe) {
        PreferenciasUsuario updPrefer = preferenciasService.update(prefe);
        if (updPrefer==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(updPrefer, HttpStatus.OK);
    }


    @GetMapping("/preferencia/{id}")
    public ResponseEntity<PreferenciasUsuario> getPrefrById(@PathVariable("id") Long id) {
        PreferenciasUsuario preferencia = preferenciasService.findbyId(id);
        return ResponseEntity.ok(preferencia);
    }

    @DeleteMapping("/preferencia/{id}")
    public ResponseEntity<HttpStatus> deletePrefrById(@PathVariable("id") Long id) {
        preferenciasService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //COMENTARIO
}
