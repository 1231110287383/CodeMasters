package com.CodeMasters.proyecto.servicios;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import com.CodeMasters.proyecto.repositorio.movimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class movimientoDineroServicios {
    @Autowired
    private com.CodeMasters.proyecto.repositorio.movimientoDineroRepositorio movimientoDineroRepositorio;


    public List<MovimientoDinero> getAllMovimientoDinero(){
        List<MovimientoDinero> movimientoDineroList = new ArrayList<>();
        movimientoDineroRepositorio.findAll().forEach(movimientoDinero -> movimientoDineroList.add(movimientoDinero));
        return movimientoDineroList;
    }

    public Optional<MovimientoDinero> getMovimientoDineroById(long id){
        return movimientoDineroRepositorio.findById(id);
    }

    public MovimientoDinero saveOrUpdaeMovimientoDineroRepositorio(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepositorio.save(movimientoDinero);
    }

    public boolean deleteMovimientoDinero(long id) {
        movimientoDineroRepositorio.deleteById(id);
        if(this.movimientoDineroRepositorio.findById(id).isPresent()){return false;}
        return true;
    }
}

