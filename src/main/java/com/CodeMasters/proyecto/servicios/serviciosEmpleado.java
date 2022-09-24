package com.CodeMasters.proyecto.servicios;
import com.CodeMasters.proyecto.entidades.Empleado;
import com.CodeMasters.proyecto.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class serviciosEmpleado {
    @Autowired // conectamos esta clase con el reporitorio del empleado
    EmpleadoRepositorio empleadoRepositorio; // creamos un objeto de tipo repositorio empleados

    public List<Empleado> findAllEmpleado(){
        return empleadoRepositorio.findAll();
    }
    public Empleado saveEmpleado(Empleado emp){
        return empleadoRepositorio.save(emp);
    }

    public Empleado updateEmpleado(Empleado emp){
        return empleadoRepositorio.save(emp);
    }


   // public Optional<Empleado> getEmpleadoById(Long id) {

     //   return empleadoRepositorio.findById(id);
  //  }


  //  public ArrayList<Empleado> obtenerPorEmpresa(Integer id) {
  //      return empleadoRepositorio.findByEmpresaId(id);
   // }

    public boolean deleteEmpleado(long id) {
        empleadoRepositorio.deleteById(id);
        if (this.empleadoRepositorio.findById(id).isPresent()) {
            return false;
        }
        return true;
    }

}