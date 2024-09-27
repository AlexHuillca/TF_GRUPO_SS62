package com.upc.closetlabel.DTO;

import com.upc.closetlabel.Entities.Descuento;
import com.upc.closetlabel.Entities.PrendaTienda;
import jakarta.persistence.*;
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
