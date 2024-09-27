package com.example.lookup.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class DetallePedidoDTO {
    private Integer id;
    private Double precio;
    private Integer cantidad;
    private Integer pedidoId;
}
