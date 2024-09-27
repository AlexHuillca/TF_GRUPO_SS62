package com.upc.closetlabel.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "valoración")
public class Valoración {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valoracion", nullable = false)
    private Integer id;

    @Column(name = "comentario_valoracion", length = 300)
    private String comentarioValoracion;

    @Column(name = "puntuacion_valoracion")
    private Integer puntuacionValoracion;

    @Column(name = "fecha_comentario")
    private LocalDate fechaComentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id_cliente")
    private Cliente clienteIdCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id_pedido")
    private Pedido pedidoIdPedido;

}
