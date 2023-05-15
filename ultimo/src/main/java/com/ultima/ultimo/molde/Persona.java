
package com.ultima.ultimo.molde;

import com.sun.istack.NotNull;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String nombre;
    
    @NotNull
   private String apellido;
    
    @NotNull
    private String profesion;
    
    @NotNull
    private String ciudad;
    
    @NotNull
    private String pais;
    
    @NotNull
    private String imgfoto;
    
   @Basic
    private String estuinfo1;
    private String estu1img;
    private String estuinfo2;
    private String estu2img;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String ciudad, String pais, String imgfoto, String estuinfo1, String estu1img, String estuinfo2, String estu2img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.imgfoto = imgfoto;
        this.estuinfo1 = estuinfo1;
        this.estu1img = estu1img;
        this.estuinfo2 = estuinfo2;
        this.estu2img = estu2img;
    }
    
    
}
