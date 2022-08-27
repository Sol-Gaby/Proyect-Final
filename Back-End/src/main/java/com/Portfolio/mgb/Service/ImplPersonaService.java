/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.InPersonaService;
import com.portfolio.mgb.Repository.InPersonaRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplPersonaService implements InPersonaService{
    @Autowired InPersonaRepo inpersonaRepo;

    @Override
    public List<Persona> getPersonas() {
    List<Persona> persona = inpersonaRepo.findAll();
    return persona;
    }

    @Override
    public void savePersona(Persona persona) {
    inpersonaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
    inpersonaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = inpersonaRepo.findById(id).orElse(null);
        return persona;
    }
}
/**
 *
 * @author Sol
 */