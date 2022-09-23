package com.CodeMasters.proyecto.controlador;
import com.CodeMasters.proyecto.entidades.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.CodeMasters.proyecto.servicios.serviciosEmpleado;

import java.util.List;

public class controladorEmpleado {

    @Autowired
    serviciosEmpleado serviciosEmpleado;

    @GetMapping
    public List<Empleado> findAllEmpleado() {
        return serviciosEmpleado.findAllEmpleado();
    }

    @PostMapping
    public Empleado saveEmpleado(@RequestBody Empleado emp) {
        return serviciosEmpleado.saveEmpleado(emp);
    }

    @PutMapping
    public Empleado updateEmpleado(@RequestBody Empleado emp) {
        return serviciosEmpleado.updateEmpleado(emp);
    }

    @DeleteMapping
    public void deleteEmpleado(@RequestBody long id) {
        serviciosEmpleado.deleteEmpleado(id);
    }
}