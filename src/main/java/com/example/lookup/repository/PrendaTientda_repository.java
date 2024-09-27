package com.upc.closetlabel.Repository;

import com.upc.closetlabel.Entities.PrendaTienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaTientda_repository extends JpaRepository<PrendaTienda,Integer>
{
}
