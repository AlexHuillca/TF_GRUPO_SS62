package com.example.lookup.dtos;

import com.example.lookup.entities.Cliente;
import com.example.lookup.entities.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValoracionDTO {
    private Integer id;

    private String comentarioValoracion;

    private Integer puntuacionValoracion;

    private LocalDate fechaComentario;

    private Cliente clienteIdCliente;

    private Pedido pedidoIdPedido;
}
