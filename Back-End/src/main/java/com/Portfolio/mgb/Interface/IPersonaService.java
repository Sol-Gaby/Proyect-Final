
package com.Portfolio.mgb.Interface;

import com.Portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traere una lista de personas con el metodo get personas
    public List<Persona> getPersonas();
    
    //metodo para guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //para eliminar un ususario(objeto)
    public void deletePersona(Long Id);
    
    //para buscar una persona por el ID
    public Persona findPersona(long Id);
}
/**
 * @author Sol
 */