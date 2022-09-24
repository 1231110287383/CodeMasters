package com.CodeMasters.proyecto.controlador;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import com.CodeMasters.proyecto.servicios.movimientoDineroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientoDinero")
public class movimientoDineroControlador {

    @Autowired
    movimientoDineroServicio movimientoDineroServicio;

    @GetMapping("/ListaMovimientoDinero")
    public List<MovimientoDinero> listamovimientoDinero() {
        return movimientoDineroServicio.listaMovimientoDinero();
    }

    @GetMapping("/MovimentoDinero/{id}")
    public MovimientoDinero movimientoDineroPorId(@PathVariable("id") long id){
        return movimientoDineroServicio.MovimentoDineroPorId(id);
    }

    @PostMapping("/GuardarMovimientoDinero")
    public MovimientoDinero guardarMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDineroServicio.guardarMovimientoDinero(movimientoDinero);
    }

    @DeleteMapping("/EliminarMovimientoDinero")
    public boolean eliminarMovimentoDinero(@RequestBody long id){
        return movimientoDineroServicio.eliminarMovimientoDinero(id);
    }





}
