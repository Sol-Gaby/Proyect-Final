/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mgb.Security.Repository;

import com.portfolio.mgb.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterUserRepository extends JpaRepository<Usuario, Integer>{
Optional <Usuario> findByUserName(String userName);

boolean existsByUserName(String userName);
boolean existByEmail(String email);
}

/**
 * @author Sol
 */