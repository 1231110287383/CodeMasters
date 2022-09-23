package com.CodeMasters.proyecto.servicios;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class movimientoDineroServicios {
    @Autowired
    private com.CodeMasters.proyecto.repositorio.movimientoDineroRepositorio movimientoDineroRepositorio;


    public List<MovimientoDinero> getAllMovimientoDinero() {
        return movimientoDineroRepositorio.findAll();
    }

    public MovimientoDinero getMovimentoDineroById(long id) {
        return movimientoDineroRepositorio.findById(id).get();
    }

    public MovimientoDinero saveOrUpdateMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero movimiento = movimientoDineroRepositorio.save(movimientoDinero);
        return movimiento;
    }

    public boolean deleteMovimientoDinero(long id) {
        movimientoDineroRepositorio.deleteById(id);
        if (this.movimientoDineroRepositorio.findById(id).isPresent()) {
            return false;
        }
        return true;
    }

}
