/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Controller;

import com.portfolio.mgb.Security.Dto.JwtDto;
import com.portfolio.mgb.Security.Dto.LoginUser;
import com.portfolio.mgb.Security.Dto.NewUser;
import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Enums.RolName;
import com.portfolio.mgb.Security.Service.RolService;
import com.portfolio.mgb.Security.Service.UserService;
import com.portfolio.mgb.Security.jwt.JwtProvider;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    UserService userService;
    
    @Autowired
    RolService rolService;
    
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) 
            return new ResponseEntity(new Message("campos invalidos"), HttpStatus.BAD_REQUEST);

        if (userService.existsByUserName(newUser.getUserName()))
            return new ResponseEntity(new Message("Nombre de usuario en existencia"), HttpStatus.BAD_REQUEST);
        
        if (userService.existsByEmail(newUser.getEmail()))
            return new ResponseEntity(new Message("Email existente"), HttpStatus.BAD_REQUEST);
        
        Usuario user = new Usuario(newUser.getName(), newUser.getUserName(), newUser.getEmail(), passwordEncoder.encode(newUser.getPassword()));
        
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolName(RolName.ROLE_USER).get());
        
//si problea futuro surgir capaz los corches hay que corregir...(sacar posiblemente o poner los que le saque al if de user admin)//
        if(newUser.getRoles().contains("admin"))
            roles.add(rolService.getByRolName(RolName.ROLE_ADMIN).get());
        user.setRoles(roles);
        userService.save(user);
        
        return new ResponseEntity(new Message("El usuario se guardo correctamente"), HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Message("Campos incorrectos"), HttpStatus.BAD_REQUEST);
        
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword()));
    
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        String jwt = jwtProvider.generateToken(authentication);
        
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}

/** 
 * Anotacion: la clase message no se importa porque al ser parte del mismo paquete y de tipo método publico el controlador lo puede utilizar libremente
 * @author Sol
 */
