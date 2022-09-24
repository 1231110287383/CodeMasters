package com.CodeMasters.proyecto.repositorio;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface movimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long> {


















    //@Query(value = "select * from movimiento_dinero where Empleado_id in(select id from empleado where empresa_id = ?1)", nativeQuery = true)
    //public abstract ArrayList<MovimientoDinero> findByEmpresa(long id);
}


