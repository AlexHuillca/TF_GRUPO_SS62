package com.example.lookup.dtos;

import com.example.lookup.entities.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrendaDTO {
    private Long id;
    private String nombrePrenda;
    private String tipoPrenda;
    private String colorPrenda;
    private String talla;
    private BigDecimal precioOriginal;
    private BigDecimal precioFinal;
    private Marca idMarca;
//    private Pedido idPedido;
    private CategoriaPrenda idCategoria;
    private Set<Descuento> descuentos = new LinkedHashSet<>();
    private Set<PrendaTienda> prendaTiendas = new LinkedHashSet<>();
}
