package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "nombre_cliente", length = 100)
    private String nombreCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private User idUsuario;

    @OneToMany(mappedBy = "idCliente")
    private List<Pedido> pedidos = new ArrayList<>();

    @OneToMany(mappedBy = "clienteIdCliente")
    private List<Valoracion> valoracions = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public User getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(User idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Valoracion> getValoracions() {
        return valoracions;
    }

    public void setValoracions(List<Valoracion> valoracions) {
        this.valoracions = valoracions;
    }
}
