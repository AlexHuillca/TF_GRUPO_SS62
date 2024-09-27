package com.upc.closetlabel.DTO;

import com.upc.closetlabel.Entities.Cliente;
import com.upc.closetlabel.Entities.Pedido;
import jakarta.persistence.*;
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
