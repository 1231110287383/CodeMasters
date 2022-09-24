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

    @GetMapping ("/ListaEmpresa")
    public List<Empresa> verEmpresa() {
        return EmpresaService.findAllEmpresa();
    }

    @PostMapping ("/GuardarEmpresa")
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return EmpresaService.saveOrUpdateEmpresa(empresa);
    }

    @GetMapping ("/BuscarEmpresa/{id}")
    public Empresa EmpresaPorId(@PathVariable("id") long id){
        return EmpresaService.getEmpresaById(id);
    }

    @DeleteMapping ("/EliminarEmpresa")
    public void deleteEmpresa(@RequestBody long id) {
        EmpresaService.deleteEmpresa(id);
    }
}
