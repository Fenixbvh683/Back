
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
public class Navbar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idnav;
    
    @NotNull
    private String urlnav;

    public Navbar() {
    }

    public Navbar(Long idnav, String urlnav) {
        this.idnav = idnav;
        this.urlnav = urlnav;
    }
    
    
}
