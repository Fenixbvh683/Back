
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
public class Estudio {
    
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idest;
    
    @NotNull
    private String nombreest;
    
    @NotNull
   private String descripcionest;
    
    @NotNull
    private String ciudadest;
    
    @NotNull
    private String imgest;

    public Estudio() {
    }

    public Estudio(Long idest, String nombreest, String descripcionest, String ciudadest, String imgest) {
        this.idest = idest;
        this.nombreest = nombreest;
        this.descripcionest = descripcionest;
        this.ciudadest = ciudadest;
        this.imgest = imgest;
    }
    
    
}
