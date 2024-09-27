package com.example.lookup.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferenciadeusuarioDTO {
    private Integer id;

    private Integer colorFavorito;

    private Integer tipoPrendaFavorito;

    private Integer tallaFavorita;

    private Integer tipoEvento;

    private User idUsuario;

}
