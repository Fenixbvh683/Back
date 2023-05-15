
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Persona;
import com.ultima.ultimo.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona implements ISPersona{
    
    @Autowired 
    public RPersona persoRepo;

    @Override
    public List<Persona> verPersona() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    
}
