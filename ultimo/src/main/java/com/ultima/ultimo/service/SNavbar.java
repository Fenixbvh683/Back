
package com.ultima.ultimo.service;

import com.ultima.ultimo.molde.Navbar;
import com.ultima.ultimo.repository.RNavbar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SNavbar implements ISNavbar{
    
    @Autowired
    public RNavbar navRepo;

    @Override
    public List<Navbar> verNavbar() {
       return navRepo.findAll();
    }

    @Override
    public void crearNavbar(Navbar nav) {
        navRepo.save(nav);
    }

    @Override
    public void borrarNavbar(Long idnav) {
        navRepo.deleteById(idnav);
    }

    @Override
    public Navbar buscarNavbar(Long idnav) {
       return navRepo.findById(idnav).orElse(null);
    }
    
}
