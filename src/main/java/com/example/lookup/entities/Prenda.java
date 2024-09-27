package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prenda", nullable = false)
    private Integer id;

    @Column(name = "nombre_prenda", length = 100)
    private String nombrePrenda;

    @Column(name = "tipo_prenda", length = 100)
    private String tipoPrenda;

    @Column(name = "color_prenda", length = 100)
    private String colorPrenda;

    @Column(name = "talla", length = 30)
    private String talla;

    @Column(name = "precio_original")
    private BigDecimal precioOriginal;

    @Column(name = "precio_final")
    private BigDecimal precioFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca")
    private Marca idMarca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private CategoriaPrenda idCategoria;

    @OneToMany(mappedBy = "idPrenda")
    private Set<Descuento> descuentos = new LinkedHashSet<>();



    @OneToMany(mappedBy = "prendaIdPrenda")
    private Set<PrendaTienda> prendaTiendas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getColorPrenda() {
        return colorPrenda;
    }

    public void setColorPrenda(String colorPrenda) {
        this.colorPrenda = colorPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public BigDecimal getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(BigDecimal precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public BigDecimal getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public CategoriaPrenda getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaPrenda idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Set<Descuento> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Set<Descuento> descuentos) {
        this.descuentos = descuentos;
    }

    public Set<PrendaTienda> getPrendaTiendas() {
        return prendaTiendas;
    }

    public void setPrendaTiendas(Set<PrendaTienda> prendaTiendas) {
        this.prendaTiendas = prendaTiendas;
    }
}