package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="preferencias_usuarios")
public class Preferencias_usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color_favorito;
    private String tipo_prenda_favorito;
    private String talla_favorita;
    private String tipo_evento;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;
}
