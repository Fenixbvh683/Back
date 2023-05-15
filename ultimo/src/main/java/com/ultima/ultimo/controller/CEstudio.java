
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Estudio;
import com.ultima.ultimo.service.ISEstudio;
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
public class CEstudio {
    
    @Autowired 
    private ISEstudio estServ;
    
    
    @PostMapping ("/new/estudio")
    public void agregarEstudio (@RequestBody Estudio est) {
        estServ.crearEstudio(est);
    } 
    
    @GetMapping ("/ver/estudio")
    @ResponseBody
    public List<Estudio> verEstudio () {
    return estServ.verEstudio();
    }
    
    
    
    @DeleteMapping ("/delete/estudio/{idest}")
    public void borrarEstudio (@PathVariable Long idest) {
        estServ.borrarEstudio(idest);
    }
    
    
    
    @PutMapping ("/editar/estudio/{idest}")
    public Estudio editEstudio(@PathVariable Long idest,
                               @RequestParam("nombreest") String nuevoNombreest,
                               @RequestParam("descripcionest") String nuevoDescripcionest,
                               @RequestParam("ciudadest") String nuevoCiudadest,
                               @RequestParam("imgest") String nuevoImgest){
    
    Estudio estudio = estServ.buscarEstudio(idest);
    
            estudio.setNombreest(nuevoNombreest);
            estudio.setDescripcionest(nuevoDescripcionest);
            estudio.setCiudadest(nuevoCiudadest);
            estudio.setImgest(nuevoImgest);
           
            
            
            estServ.crearEstudio(estudio);
            return estudio; 
    }
    
        @GetMapping("/estudio/traer/perfil")
        public Estudio buscarEstudio(){
            return estServ.buscarEstudio((long)1);
        }
}
