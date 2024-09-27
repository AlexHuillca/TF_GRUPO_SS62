package com.upc.closetlabel.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "prenda_tienda")
public class PrendaTienda {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tienda")
    private TiendaDistribuidora idTienda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prenda_id_prenda")
    private Prenda prendaIdPrenda;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "stock_disponible")
    private Integer stockDisponible;

    @Column(name = "disponible")
    private Boolean disponible;

}
