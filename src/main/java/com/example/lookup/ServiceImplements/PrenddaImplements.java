package com.example.lookup.ServiceImplements;

import com.upc.closetlabel.Entities.Prenda;
import com.upc.closetlabel.Repository.Prendarepository;
import com.upc.closetlabel.Servicio.PrendaSAervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenddaImplements implements PrendaSAervice {


    @Autowired
    Prendarepository prendarepository;

    @Override
    public Prenda save(Prenda p)
    {
        return  prendarepository.save(p);
    }

    @Override

    public List<Prenda> list()
    {
        return  prendarepository.findAll();
    }
    @Override
    public String  delelte(Integer id)
    {
        if(prendarepository.findById(id)== null)
        {
            return " nose encontro la prenda";
        }else {prendarepository.deleteById(id);
            return "prenda eliminada";}
    }
}