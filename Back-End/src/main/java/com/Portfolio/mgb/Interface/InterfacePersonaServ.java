
package com.portfolio.mgb.Interface;


import com.portfolio.mgb.Entity.Persona;
import java.util.List;



public interface InterfacePersonaServ {
   //para traeer  una lista del tipo persona
    public List<Persona> getPersona();
    
    //para guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //para eliminar un objeto del tipo persona por medio de su id
    public void deletePersona(Long id);
    
    //buscar un objeto del tipo persona por medio de su id
    public Persona findPersona(Long in);
    
}
/**
 * @author Sol
 */