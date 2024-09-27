package com.upc.closetlabel.Repository;

import com.upc.closetlabel.DTO.ValoracionDTOResumen;
import com.upc.closetlabel.Entities.Valoración;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoracionRepositorio extends JpaRepository<Valoración,Integer> {

    @Query("SELECT new com.upc.closetlabel.DTO.ValoracionDTOResumen(v.comentarioValoracion, v.puntuacionValoracion)"
    + "from Valoración v")
    List<ValoracionDTOResumen>ResumenComentarios();

}
