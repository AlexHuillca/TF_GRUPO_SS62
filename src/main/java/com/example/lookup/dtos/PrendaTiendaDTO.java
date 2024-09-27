package com.example.lookup.dtos;

import com.example.lookup.entities.Prenda;
import com.example.lookup.entities.TiendaDistribuidora;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrendaTiendaDTO {

    private TiendaDistribuidora idTienda;

    private Prenda prendaIdPrenda;

    private LocalDate fechaIngreso;

    private Integer stockDisponible;

    private Boolean disponible;
}
