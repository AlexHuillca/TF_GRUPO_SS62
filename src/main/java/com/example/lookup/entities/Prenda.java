package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prenda")
    private Integer id;

    @Column(name = "nombre_prenda", length = 100, nullable = false)
    private String nombrePrenda;

    @Column(name = "tipo_prenda", length = 100, nullable = false)
    private String tipoPrenda;

    @Column(name = "color_prenda", length = 100,nullable = false)
    private String colorPrenda;

    @Column(name = "talla", length = 30, nullable = false)
    private String talla;

    @Column(name = "precio_original", nullable = false)
    private BigDecimal precioOriginal;

    @Column(name = "precio_final", nullable = false)
    private BigDecimal precioFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca")
    private Marca idMarca;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_pedido")
//    private Pedido idPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private CategoriaPrenda idCategoria;

    @OneToMany(mappedBy = "idPrenda")
    private Set<Descuento> descuentos = new LinkedHashSet<>();


    @OneToMany(mappedBy = "prendaIdPrenda")
    private Set<PrendaTienda> prendaTiendas = new LinkedHashSet<>();
}