package com.CodeMasters.proyecto.servicios;

import com.CodeMasters.proyecto.entidades.Empresa;
import com.CodeMasters.proyecto.repositorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmpresaService {

    @Autowired //Conectamos esta clase con el repository de Empresa
    EmpresaRepository empresaRepository; //Creamos un objeto tipo EmpresaRepository para poder usar los metodos que dicha clase hereda

    //Metodo que retornará la lista de empresas usando metodos heredados del jpaRepository
    public List<Empresa> findAllEmpresa(){
        return empresaRepository.findAll();
    }

    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(long id){
        return empresaRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Empresa
    public Empresa saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp = empresaRepository.save(empresa);
        return emp;
    }

    //Metodo para eliminar empresas registradas teniendo el id
    public boolean deleteEmpresa(long id){
        empresaRepository.deleteById(id);  //Eliminar

        if (this.empresaRepository.findById(id).isPresent()){  //Verificacion del servicio eliminacion
            return false;
        }
        return true;
    }


}
