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

}