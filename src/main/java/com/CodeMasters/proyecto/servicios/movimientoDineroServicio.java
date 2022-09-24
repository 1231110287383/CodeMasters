package com.CodeMasters.proyecto.servicios;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class movimientoDineroServicio {
    @Autowired
    private com.CodeMasters.proyecto.repositorio.movimientoDineroRepositorio movimientoDineroRepositorio;


    public List<MovimientoDinero> listaMovimientoDinero() {
        return movimientoDineroRepositorio.findAll();
    }

    public MovimientoDinero MovimentoDineroPorId(long id) {
        return movimientoDineroRepositorio.findById(id).get();
    }

    public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero movimiento = movimientoDineroRepositorio.save(movimientoDinero);
        return movimiento;
    }

    public boolean eliminarMovimientoDinero(long id) {
        movimientoDineroRepositorio.deleteById(id);
        if (this.movimientoDineroRepositorio.findById(id).isPresent()) {
            return false;
        }
        return true;
    }

}
