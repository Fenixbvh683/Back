
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Proyecto;
import java.util.List;


public interface ISProyecto {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto (Proyecto pro);
    
    public void borrarProyecto (Long idpro);
    
    public Proyecto buscarProyecto(Long idpro);
    
}
