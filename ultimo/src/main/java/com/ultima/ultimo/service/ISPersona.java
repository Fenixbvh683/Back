
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Persona;
import java.util.List;


public interface ISPersona {
    
    public List<Persona> verPersona();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona(Long id);
}
