
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Habilidad;
import java.util.List;


public interface ISHabilidad {
    
    public List<Habilidad> verHabilidad();
    
    public void crearHabilidad (Habilidad hab);
    
    public void borrarHabilidad (Long idhab);
    
    public Habilidad buscarHabilidad(Long idhab);
    
}
