package com.example.lookup.dtos;

import com.example.lookup.entities.User;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PreferenciadeusuarioDTO {
    private Long idPreferencia;
    private Integer colorFavorito;
    private Integer tipoPrendaFavorito;
    private Integer tallaFavorita;
    private Integer tipoEvento;
    private User idUsuario;
}
