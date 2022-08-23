/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.InterUserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("com.portfolio.mgb.Security.Repository.InterUserRepository")
public class UserService {
    @Autowired
    InterUserRepository interUserRepository;
    
    public Optional<Usuario> getByUserName(String userName){
        return interUserRepository.findByUserName(userName);
    }
    
    public boolean existsByUserName(String userName){
        return interUserRepository.existsByUserName(userName);
    }
    
    public boolean existsByEmail(String email){
        return interUserRepository.existByEmail(email);
    }
    
    public void save(Usuario user){
        interUserRepository.save(user);
    }
}

/**
 * @author Sol
 */