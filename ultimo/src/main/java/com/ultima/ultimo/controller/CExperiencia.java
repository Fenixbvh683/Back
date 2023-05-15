
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Experiencia;
import com.ultima.ultimo.service.ISExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    
    @Autowired 
    private ISExperiencia expServ;
    
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiemcia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    } 
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia () {
    return expServ.verExperiencia();
    }
    
    
    
    @DeleteMapping ("/delete/experiencia/{idexp}")
    public void borrarExperiencia (@PathVariable Long idexp) {
        expServ.borrarExperiencia(idexp);
    }
    
    
    
    @PutMapping ("/editar/experiencia/{idexp}")
    public Experiencia editExperiencia(@PathVariable Long idexp,
                               @RequestParam("nombreexp") String nuevoNombreexp,
                               @RequestParam("descripcionexp") String nuevoDescripcionexp,
                               @RequestParam("ciudadexp") String nuevoCiudadexp,
                               @RequestParam("imgexp") String nuevoImgexp){
    
    Experiencia experiencia = expServ.buscarExperiencia(idexp);
                experiencia.setNombreexp(nuevoNombreexp);
                experiencia.setDescripcionexp(nuevoDescripcionexp);
                experiencia.setCiudadexp(nuevoCiudadexp);
                experiencia.setImgexp(nuevoImgexp);
           
            
            
            expServ.crearExperiencia(experiencia);
            return experiencia; 
    }
    
        @GetMapping("/experiencia/traer/perfil")
        public Experiencia buscarExperiencia(){
            return expServ.buscarExperiencia((long)1);
        }
}
