package com.example.lookup.dtos;

import com.example.lookup.entities.Cliente;
import com.example.lookup.entities.MetodoPago;
import com.example.lookup.entities.Prenda;
import com.example.lookup.entities.Valoracion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
private Integer id;

    private LocalDate fechaPedido;

    private String estadoPedido;

    private String direccionEntrega;

    private BigDecimal totalPedido;

    private String estadoEnvio;

    private Integer numeroSeguimiento;

    private Cliente idCliente;

    private MetodoPago idMetodoPago;


    private Set<Prenda> prendas = new LinkedHashSet<>();

    private Set<Valoracion> valoracións = new LinkedHashSet<>();
}
