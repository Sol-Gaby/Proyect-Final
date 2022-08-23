/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Entity;

import com.portfolio.mgb.Security.Enums.RolName;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /*en el campo de nombre solo recibira caracteres alfanumericos y no puede quedar sin completar*/
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolName rolName;
    
    //generamos su constructor(vacio en este caso)//
    public Rol(){        
    }
    
    public Rol(RolName rolName){
        this.rolName = rolName;
    }
    
    //parte de los Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolName getRolName() {
        return rolName;
    }

    public void setRolName(RolName rolName) {
        this.rolName = rolName;
    }

   
}

/**
 * @author Sol
 */