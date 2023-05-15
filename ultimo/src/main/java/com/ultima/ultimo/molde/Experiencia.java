
package com.ultima.ultimo.molde;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idexp;
    
    @NotNull
    private String nombreexp;
    
    @NotNull
   private String descripcionexp;
    
    @NotNull
    private String ciudadexp;
    
    @NotNull
    private String imgexp;

    public Experiencia() {
    }

    public Experiencia(Long idexp, String nombreexp, String descripcionexp, String ciudadexp, String imgexp) {
        this.idexp = idexp;
        this.nombreexp = nombreexp;
        this.descripcionexp = descripcionexp;
        this.ciudadexp = ciudadexp;
        this.imgexp = imgexp;
    }
    
    
}
