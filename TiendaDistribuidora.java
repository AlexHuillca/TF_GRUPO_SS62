package com.upc.closetlabel.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tienda_distribuidora")
public class TiendaDistribuidora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda", nullable = false)
    private Integer id;

    @Column(name = "nombre_tienda", length = 100)
    private String nombreTienda;

    @Column(name = "prenda_id_prenda")
    private Integer prendaIdPrenda;

    @OneToMany(mappedBy = "idTienda")
    private List<Descuento> descuentos = new ArrayList<>();

    @OneToMany(mappedBy = "idTienda")
    private List<PrendaTienda> prendaTiendas = new ArrayList<>();

}
