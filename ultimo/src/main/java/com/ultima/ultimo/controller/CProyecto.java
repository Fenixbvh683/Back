
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Proyecto;
import com.ultima.ultimo.service.ISProyecto;
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
public class CProyecto {
    
    @Autowired 
    private ISProyecto proServ;
    
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto pro) {
        proServ.crearProyecto(pro);
    } 
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto () {
    return proServ.verProyecto();
    }
    
    
    
    @DeleteMapping ("/delete/proyecto/{idpro}")
    public void borrarProyecto (@PathVariable Long idpro) {
        proServ.borrarProyecto(idpro);
    }
    
    
    
    @PutMapping ("/editar/proyecto/{idpro}")
    public Proyecto editProyecto(@PathVariable Long idpro,
                               @RequestParam("nombrepro") String nuevoNombrepro,
                               @RequestParam("descripcionpro") String nuevoDescripcionpro,
                               @RequestParam("ciudadpro") String nuevoCiudadpro,
                               @RequestParam("imgpro") String nuevoImgpro){
    
    Proyecto proyecto = proServ.buscarProyecto(idpro);
    
            proyecto.setNombrepro(nuevoNombrepro);
            proyecto.setDescripcionpro(nuevoDescripcionpro);
            proyecto.setImgpro(nuevoImgpro);
           
            
            
            proServ.crearProyecto(proyecto);
            return proyecto; 
    }
    
        @GetMapping("/proyecto/traer/perfil")
        public Proyecto buscarProyecto(){
            return proServ.buscarProyecto((long)1);
        }
}
