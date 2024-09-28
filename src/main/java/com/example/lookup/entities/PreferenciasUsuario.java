package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "preferencias_usuario")
public class PreferenciasUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preferencia", nullable = false)
    private Long idPreferencia;

    @Column(name = "color_favorito", nullable = false)
    private Integer colorFavorito;

    @Column(name = "tipo_prenda_favorito", nullable = false)
    private Integer tipoPrendaFavorito;

    @Column(name = "talla_favorita", nullable = false)
    private Integer tallaFavorita;

    @Column(name = "tipo_evento", nullable = false)
    private Integer tipoEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private User idUsuario;
}