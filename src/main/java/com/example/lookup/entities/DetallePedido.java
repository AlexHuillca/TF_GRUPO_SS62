package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="detalle_pedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_pedido", nullable = false)
    private Integer id;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

}
