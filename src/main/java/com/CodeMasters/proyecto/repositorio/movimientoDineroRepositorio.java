package com.CodeMasters.proyecto.repositorio;

import com.CodeMasters.proyecto.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long> {

}


