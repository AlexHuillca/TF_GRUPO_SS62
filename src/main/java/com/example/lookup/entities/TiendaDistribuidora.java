package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Integer getPrendaIdPrenda() {
        return prendaIdPrenda;
    }

    public void setPrendaIdPrenda(Integer prendaIdPrenda) {
        this.prendaIdPrenda = prendaIdPrenda;
    }

    public List<Descuento> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<Descuento> descuentos) {
        this.descuentos = descuentos;
    }

    public List<PrendaTienda> getPrendaTiendas() {
        return prendaTiendas;
    }

    public void setPrendaTiendas(List<PrendaTienda> prendaTiendas) {
        this.prendaTiendas = prendaTiendas;
    }
}
