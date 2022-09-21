package com.CodeMasters.proyecto.controlador;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import com.CodeMasters.proyecto.servicios.movimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class movimientoDineroControlador {

    @Autowired
    movimientoDineroServicios movimientoDineroServicio;

    @GetMapping("/enterprises/movements")
    public List<MovimientoDinero> vermovimientoDinero() {
        return movimientoDineroServicio.getAllMovimientoDinero();
    }

    @PostMapping("/enterprises/[id]/movements/post")
    public MovimientoDinero guardarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDineroServicio.saveOrUpdateMovimientoDinero(movimientoDinero);
    }

    @GetMapping("/enterprises/[id]/movements/get")
    public MovimientoDinero movimientoDineroPorId(@PathVariable("id") long id){
        return movimientoDineroServicio.getMovimentoDineroById(id);
    }

    @PatchMapping("/enterprises/[id]/movements/patch")
    public MovimientoDinero actualizarMovimientoDinero(@PathVariable("id")long id, @RequestBody MovimientoDinero x){
        MovimientoDinero m = movimientoDineroServicio.getMovimentoDineroById(id);
        m.setConceptoMovimiento(x.getConceptoMovimiento());
        m.setMontoDinero(x.getMontoDinero());
        m.setUsuarioMovimiento(x.getUsuarioMovimiento());
        return movimientoDineroServicio.saveOrUpdateMovimientoDinero(m);
    }



}
