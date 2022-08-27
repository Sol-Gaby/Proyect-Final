/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.InPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class PersonaController {

    @Autowired
    InPersonaService inpersonaService;

    @GetMapping("persona/traer")
    public List<Persona> getPersona() {
        return inpersonaService.getPersonas();
    }

    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona) {
        inpersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        inpersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("name") String nuevoName,
            @RequestParam("surname") String nuevoSurname,
            @RequestParam("image") String nuevoImage) {

        Persona persona = inpersonaService.findPersona(id);

        persona.setName(nuevoName);
        persona.setSurname(nuevoSurname);
        persona.setImage(nuevoImage);

        inpersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/persona/get/perfil")
    public Persona findPersona() {
        return inpersonaService.findPersona((long) 1);
    }

}
/**
 *
 * @author Sol
 */
