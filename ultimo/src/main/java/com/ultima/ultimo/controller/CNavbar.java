
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Navbar;
import com.ultima.ultimo.service.ISNavbar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CNavbar {
    @Autowired 
    private ISNavbar navServ;
    
    
    @PostMapping ("/new/navbar")
    public void agregarNavbar (@RequestBody Navbar nav) {
        navServ.crearNavbar(nav);
    } 
    
    @GetMapping ("/ver/navbar")
    @ResponseBody
    public List<Navbar> verNavbar () {
    return navServ.verNavbar();
    }
    
    
    
    @DeleteMapping ("/delete/navbar/{idnav}")
    public void borrarNavbar (@PathVariable Long idnav) {
        navServ.borrarNavbar(idnav);
    }
    
    
    
    @PutMapping ("/editar/navbar/{idnav}")
    public Navbar editNavbar(@PathVariable Long idnav,
                               @RequestParam("urlnav") String nuevoUrlnav){
    
    Navbar navbar = navServ.buscarNavbar(idnav);
    
            navbar.setUrlnav(nuevoUrlnav);
            
            
           
            navServ.crearNavbar(navbar);
            return navbar; 
    }
    
        @GetMapping("/navbar/traer/perfil")
        public Navbar buscarNavbar(){
            return navServ.buscarNavbar((long)1);
        }
}
