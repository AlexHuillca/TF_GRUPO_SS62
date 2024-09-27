package com.example.lookup.Services;

import com.upc.closetlabel.Entities.Prenda;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public interface PrendaSAervice {
    Prenda save(Prenda p);

    List<Prenda> list();

    String  delelte(Integer id);
}
