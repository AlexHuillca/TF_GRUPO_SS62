package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "preferencias_usuario")
public class PreferenciasUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preferencia", nullable = false)
    private Integer id;

    @Column(name = "color_favorito")
    private Integer colorFavorito;

    @Column(name = "tipo_prenda_favorito")
    private Integer tipoPrendaFavorito;

    @Column(name = "talla_favorita")
    private Integer tallaFavorita;

    @Column(name = "tipo_evento")
    private Integer tipoEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

}