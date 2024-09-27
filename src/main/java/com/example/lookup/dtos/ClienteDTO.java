package com.example.lookup.dtos;


import com.example.lookup.entities.Pedido;
import com.example.lookup.entities.User;
import com.example.lookup.entities.Valoracion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private Integer id;

    private String nombreCliente;

    private User idUsuario;

    private Set<Pedido> pedidos = new LinkedHashSet<>();

    private Set<Valoracion> valoracións = new LinkedHashSet<>();
}
