package com.upc.closetlabel.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Integer id;

    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @Column(name = "estado_pedido", length = 50)
    private String estadoPedido;

    @Column(name = "direccion_entrega", length = 200)
    private String direccionEntrega;

    @Column(name = "total_pedido")
    private BigDecimal totalPedido;

    @Column(name = "estado_envio", length = 50)
    private String estadoEnvio;

    @Column(name = "numero_seguimiento")
    private Integer numeroSeguimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPago idMetodoPago;

    @OneToMany(mappedBy = "idPedido")
    private Set<DetallePago> detallePagos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPedido")
    private Set<Prenda> prendas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "pedidoIdPedido")
    private Set<Valoración> valoracións = new LinkedHashSet<>();

}
