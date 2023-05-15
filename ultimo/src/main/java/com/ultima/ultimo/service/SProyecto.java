
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Proyecto;
import com.ultima.ultimo.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto implements ISProyecto{
    
    @Autowired
    public RProyecto proRepo;

    @Override
    public List<Proyecto> verProyecto() {
       return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long idpro) {
        proRepo.deleteById(idpro);
    }

    @Override
    public Proyecto buscarProyecto(Long idpro) {
       return proRepo.findById(idpro).orElse(null);
    }
    
}
