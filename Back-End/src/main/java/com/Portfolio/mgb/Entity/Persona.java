package com.Portfolio.mgb.Entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 50, message = "No cumple con los requisitos")
    private String nombre;
    
    @NotNull
    @Size(min = 3, max = 50, message = "No cumple con los requisitos")
    private String apellido;
    
    @NotNull
    @Size(min = 3, max = 50, message = "No cumple con los requisitos")
    private String img;
    
}
/**
 * @author Sol
 */