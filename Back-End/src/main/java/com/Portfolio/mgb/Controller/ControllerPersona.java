
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.InterfacePersonaServ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPersona {
    @Autowired InterfacePersonaServ ipersonaServ;
    
  //para trar/get objetos del tipo persona
    @GetMapping("/persona/traer")
    public List<Persona> getPersona(){
    return ipersonaServ.getPersona();
    }
   //para crear/Post un objeto del tipo persona
    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona){
    ipersonaServ.savePersona(persona);
    return "La persona fue creada correctamente";
    }
   //para eliminar/delete un objeto del tipo persona
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    ipersonaServ.deletePersona(id);
    return "La persona fue eliminada correctamente";
    }
   //URL:puerto/persona/editar/4/nombre, apellido, imgen
    @PutMapping("/persona/editar/{id}")
    public Persona ediPersona(@PathVariable Long id, 
            @RequestParam("name") String newName,
            @RequestParam("surname") String newSurname,
            @RequestParam("image") String newImage){
        Persona persona = ipersonaServ.findPersona(id);
        
        persona.setName(newName);
        persona.setSurname(newSurname);
        persona.setImage(newImage);
        
        ipersonaServ.savePersona(persona);
        return persona;
    }
    
 }
/**
 * @author Sol
 */