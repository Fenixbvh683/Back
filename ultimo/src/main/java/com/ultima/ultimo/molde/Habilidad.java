
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
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhab;
    
    @NotNull
    private String nombrehab;
    
    @NotNull
    private String colorhab;
    
    @NotNull
   private int porcentajehab;

    public Habilidad() {
    }

    public Habilidad(Long idhab, String nombrehab, String colorhab, int porcentajehab) {
        this.idhab = idhab;
        this.nombrehab = nombrehab;
        this.colorhab = colorhab;
        this.porcentajehab = porcentajehab;
    }

    
    
    
    
}
