package com.Portfolio.mgb.Service;

import com.Portfolio.mgb.Entity.Persona;
import com.Portfolio.mgb.Interface.IPersonaService;
import com.Portfolio.mgb.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long Id) {
        ipersonaRepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(long Id) {
        Persona persona = ipersonaRepository.findById(Id).orElse(null);
        return persona;
    }

}
/**
 * @author Sol-8/8/2022
 */
