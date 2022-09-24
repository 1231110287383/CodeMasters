package com.CodeMasters.proyecto.controlador;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import com.CodeMasters.proyecto.servicios.movimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientoDinero")
public class movimientoDineroControlador {

    @Autowired
    movimientoDineroServicios movimientoDineroServicio;

    @GetMapping
    public List<MovimientoDinero> getmovimientoDinero() {
        return movimientoDineroServicio.getAllMovimientoDinero();
    }

    @GetMapping
    public MovimientoDinero movimientoDineroPorId(@PathVariable("id") long id){
        return movimientoDineroServicio.getMovimentoDineroById(id);
    }

    @PostMapping
    public MovimientoDinero saveOrUpdateMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDineroServicio.saveOrUpdateMovimientoDinero(movimientoDinero);
    }

    @DeleteMapping
    public boolean deleteMovimentoDinero(@RequestBody long id){
        return movimientoDineroServicio.deleteMovimientoDinero(id);
    }





}
