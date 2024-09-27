package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "descuentos")
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_descuento", nullable = false)
    private Integer id;

    @Column(name = "codigo_descuento", length = 50)
    private String codigoDescuento;

    @Column(name = "porcentaje_descuento")
    private BigDecimal porcentajeDescuento;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prenda")
    private Prenda idPrenda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tienda")
    private TiendaDistribuidora idTienda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Prenda getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Prenda idPrenda) {
        this.idPrenda = idPrenda;
    }

    public TiendaDistribuidora getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(TiendaDistribuidora idTienda) {
        this.idTienda = idTienda;
    }
}
