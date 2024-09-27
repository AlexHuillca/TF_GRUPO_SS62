package com.upc.closetlabel.DTO;

import com.upc.closetlabel.Entities.Pedido;
import com.upc.closetlabel.Entities.Usuario;
import com.upc.closetlabel.Entities.Valoración;
import jakarta.persistence.*;
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

    private Usuario idUsuario;

    private Set<Pedido> pedidos = new LinkedHashSet<>();

    private Set<Valoración> valoracións = new LinkedHashSet<>();
}
