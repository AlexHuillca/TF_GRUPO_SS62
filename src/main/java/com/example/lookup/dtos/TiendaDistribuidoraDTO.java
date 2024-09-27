package com.example.lookup.dtos;

import com.example.lookup.entities.Descuento;
import com.example.lookup.entities.PrendaTienda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TiendaDistribuidoraDTO {


    private Integer id;

    private String nombreTienda;

    private Integer prendaIdPrenda;

    private List<Descuento> descuentos = new ArrayList<>();

    private List<PrendaTienda> prendaTiendas = new ArrayList<>();
}
