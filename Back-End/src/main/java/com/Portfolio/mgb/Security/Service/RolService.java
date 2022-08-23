/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolName;
import com.portfolio.mgb.Security.Repository.inRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    inRolRepository irolRepository;
    
    public Optional<Rol> getByRolName (RolName rolName){
        return irolRepository.findByRolName(rolName);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}

/**
 * @author Sol
 */