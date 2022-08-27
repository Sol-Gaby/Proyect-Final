/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;

public interface InPersonaService {
    
    //para traer un objeto del tipo persona
    public List<Persona> getPersonas();
    
    //para guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //para eliminar un objeto del tipo persona
    public void deletePersona(Long id);
    
    //buscar un bojeto del tipo persona por id
    public Persona findPersona(Long id);
}
/**
 *
 * @author Sol
 */