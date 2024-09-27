
package com.upc.closetlabel.DTO;

import com.upc.closetlabel.Entities.Prenda;
import com.upc.closetlabel.Entities.TiendaDistribuidora;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescuentoDTO {
    private Integer id;

    private String codigoDescuento;

    private BigDecimal porcentajeDescuento;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Prenda idPrenda;

    private TiendaDistribuidora idTienda;
}
