package com.example.lookup.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "metodo_pago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_pago", nullable = false)
    private Integer id;

    @Column(name = "tipo_pago", length = 50)
    private String tipoPago;

    @Column(name = "detalle_registro", length = 100)
    private String detalleRegistro;

    @OneToMany(mappedBy = "idMetodoPago")
    private Set<Pedido> pedidos = new LinkedHashSet<>();

}
