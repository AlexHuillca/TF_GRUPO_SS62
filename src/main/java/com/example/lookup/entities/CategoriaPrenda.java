package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "categoria_prenda")
public class CategoriaPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Integer id;

    @Column(name = "nombre_categoria", length = 50)
    private String nombreCategoria;

    @Column(name = "descripcion_categoria", length = 100)
    private String descripcionCategoria;

    @OneToMany(mappedBy = "idCategoria")
    private Set<Prenda> prendas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(Set<Prenda> prendas) {
        this.prendas = prendas;
    }
}