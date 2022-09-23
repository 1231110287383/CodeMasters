package com.CodeMasters.proyecto.controlador;

import com.CodeMasters.proyecto.entidades.Empresa;
import com.CodeMasters.proyecto.servicios.EmpresaService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class EmpresaControlador {
    @Autowired
    EmpresaService EmpresaService;

    @GetMapping
    public List<Empresa> verEmpresa() {
        return EmpresaService.getAllEmpresas();
    }

    @PostMapping
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return EmpresaService.saveOrUpdateEmpresa(empresa);
    }

    @GetMapping
    public Empresa EmpresaPorId(@PathVariable("id") long id){
        return EmpresaService.getEmpresaById(id);
    }
}
