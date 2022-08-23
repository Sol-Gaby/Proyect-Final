/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;
    @NotNull
    private String name;
    @NotNull
    @Column(unique = true)
    private String userName;
    @NotNull
    private String emial;
    @NotNull
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();
    
    //parte de los contructores
    public Usuario(){
    }
    
    public Usuario(String name, String userName, String email, String password){
    this.name = name;
    this.userName = userName;
    this.emial = email;
    this.password = password;
    }
    
    //parte de getters//
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmial() {
        return emial;
    }

    public String getPassword() {
        return password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }
    
    //parte de los setters//
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    
    
}

/**
 * @author Sol
 */