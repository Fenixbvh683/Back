
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Habilidad;
import com.ultima.ultimo.service.ISHabilidad;
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
public class CHabilidad {
    @Autowired 
    private ISHabilidad habServ;
    
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad (@RequestBody Habilidad hab) {
        habServ.crearHabilidad(hab);
    } 
    
    @GetMapping ("/ver/habilidad")
    @ResponseBody
    public List<Habilidad> verHabilidad () {
    return habServ.verHabilidad();
    }
    
    
    
    @DeleteMapping ("/delete/habilidad/{id}")
    public void borrarHabilidad (@PathVariable Long idhab) {
        habServ.borrarHabilidad(idhab);
    }
    
    
    
    @PutMapping ("/editar/habilidad/{idhab}")
    public Habilidad editHabilidad(@PathVariable Long idhab,
                               @RequestParam("nombrehab") String nuevoNombrehab,
                               @RequestParam("porcentajehab") int nuevoPorcentajehab,
                               @RequestParam("colorhab") String nuevoColorhab){
                               
    Habilidad habilidad = habServ.buscarHabilidad(idhab);
    
            habilidad.setNombrehab(nuevoNombrehab);
            habilidad.setPorcentajehab(nuevoPorcentajehab);
            habilidad.setColorhab(nuevoColorhab);
           
            habServ.crearHabilidad(habilidad);
            return habilidad; 
    }
    
        @GetMapping("/habilidad/traer/perfil")
        public Habilidad buscarHabilidad(){
            return habServ.buscarHabilidad((long)1);
        }
}
