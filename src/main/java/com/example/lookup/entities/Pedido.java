package com.example.lookup.entities;

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
    private Set<Prenda> prendas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "pedidoIdPedido")
    private Set<Valoracion> valoracions = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Integer getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(Integer numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public MetodoPago getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(MetodoPago idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(Set<Prenda> prendas) {
        this.prendas = prendas;
    }

    public Set<Valoracion> getValoracions() {
        return valoracions;
    }

    public void setValoracions(Set<Valoracion> valoracions) {
        this.valoracions = valoracions;
    }
}
