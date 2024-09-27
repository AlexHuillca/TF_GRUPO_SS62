package com.upc.closetlabel.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
    private Usuario idUsuario;

    @OneToMany(mappedBy = "idCliente")
    private List<Pedido> pedidos = new ArrayList<>();

    @OneToMany(mappedBy = "clienteIdCliente")
    private List<Valoración> valoracións = new ArrayList<>();

}
