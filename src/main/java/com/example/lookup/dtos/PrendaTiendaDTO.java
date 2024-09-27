package com.upc.closetlabel.DTO;

import com.upc.closetlabel.Entities.Prenda;
import com.upc.closetlabel.Entities.TiendaDistribuidora;
import jakarta.persistence.*;
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
