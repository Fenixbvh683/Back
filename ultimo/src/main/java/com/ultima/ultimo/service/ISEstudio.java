
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Estudio;
import java.util.List;


public interface ISEstudio {
    
    public List<Estudio> verEstudio();
    
    public void crearEstudio (Estudio est);
    
    public void borrarEstudio (Long idest);
    
    public Estudio buscarEstudio(Long idest);
    
}
