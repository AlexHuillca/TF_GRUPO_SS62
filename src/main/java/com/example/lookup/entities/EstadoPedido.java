package com.example.lookup.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.util.LinkedHashSet;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado", nullable = false)
    private Integer id;

    @Column(name = "nombre_estado", length = 50, nullable = false)
    private String nombreEstado;

    @OneToMany(mappedBy = "estadoPedido")
    private Set<Pedido> pedidos = new LinkedHashSet<>();
}
