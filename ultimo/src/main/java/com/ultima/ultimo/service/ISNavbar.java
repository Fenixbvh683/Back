
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Navbar;
import java.util.List;


public interface ISNavbar {
    
    public List<Navbar> verNavbar();
    
    public void crearNavbar (Navbar nav);
    
    public void borrarNavbar (Long idnav);
    
    public Navbar buscarNavbar(Long idnav);
}
