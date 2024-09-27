package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca", nullable = false)
    private Integer id;

    @Column(name = "nombre_marca", length = 50)
    private String nombreMarca;

    @OneToMany(mappedBy = "idMarca")
    private Set<Prenda> prendas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(Set<Prenda> prendas) {
        this.prendas = prendas;
    }
}