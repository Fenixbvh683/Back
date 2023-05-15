
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
public class Sobremi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmi;
    
    @NotNull
    private String descripcionmi;

    public Sobremi() {
    }

    public Sobremi(Long idmi, String descripcionmi) {
        this.idmi = idmi;
        this.descripcionmi = descripcionmi;
    }

    
    
}
