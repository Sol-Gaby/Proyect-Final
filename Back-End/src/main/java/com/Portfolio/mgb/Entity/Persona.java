
package com.portfolio.mgb.Entity;

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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 50, message = "No cumple con los requerimientos")
    private String name;
    
    @NotNull
    @Size(min = 3, max = 50, message = "No cumple con los requerimientos")
    private String surname;
    
    @Size(min = 3, max = 50, message = "No cumple con los requerimientos")
    private String image;
}
/**
 * @author Sol
 */