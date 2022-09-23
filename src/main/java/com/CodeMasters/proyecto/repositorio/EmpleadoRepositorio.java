package com.CodeMasters.proyecto.repositorio;
import com.CodeMasters.proyecto.entidades.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

    //ArrayList<Empleado> findByEmpresaId(Long id);
}
