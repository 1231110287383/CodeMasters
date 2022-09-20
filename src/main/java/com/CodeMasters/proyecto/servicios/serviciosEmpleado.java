package com.CodeMasters.proyecto.servicios;
import com.CodeMasters.proyecto.Empleado;
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


    public List<Empleado> getAllEmpleado() {
        List<Empleado> Listaempleados = new ArrayList<>();
        empleadoRepositorio.findAll().forEach(empleado -> Listaempleados.add(empleado));
        return Listaempleados;
    }


    public Optional<Empleado> getEmpleadoById(Integer id) {

        return empleadoRepositorio.findById(id);
    }


    public ArrayList<Empleado> obtenerPorEmpresa(Integer id) {
        return empleadoRepositorio.findByEmpresa(id);
    }


    public boolean guardaroActEmpleado(Empleado empl) {
        Empleado emp = empleadoRepositorio.save(empl);
        if (empleadoRepositorio.findById(emple.getId()) != null) {
            return true;
        }
        return false;
    }


    public boolean deleteEmpleado(Integer id) {
        empleadoRepositorio.deleteById(id);
        if (this.empleadoRepositorio.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
}