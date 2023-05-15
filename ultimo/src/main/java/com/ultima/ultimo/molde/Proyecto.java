
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
public class Proyecto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpro;
    
    @NotNull
    private String nombrepro;
    
    @NotNull
   private String descripcionpro;
    
    @NotNull
    private String imgpro;

    public Proyecto() {
    }

    public Proyecto(Long idpro, String nombrepro, String descripcionpro, String imgpro) {
        this.idpro = idpro;
        this.nombrepro = nombrepro;
        this.descripcionpro = descripcionpro;
        this.imgpro = imgpro;
    }
    
    
}
