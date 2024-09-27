package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "valoración")
public class Valoracion {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentarioValoracion() {
        return comentarioValoracion;
    }

    public void setComentarioValoracion(String comentarioValoracion) {
        this.comentarioValoracion = comentarioValoracion;
    }

    public Integer getPuntuacionValoracion() {
        return puntuacionValoracion;
    }

    public void setPuntuacionValoracion(Integer puntuacionValoracion) {
        this.puntuacionValoracion = puntuacionValoracion;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Cliente getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Cliente clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public Pedido getPedidoIdPedido() {
        return pedidoIdPedido;
    }

    public void setPedidoIdPedido(Pedido pedidoIdPedido) {
        this.pedidoIdPedido = pedidoIdPedido;
    }
}
