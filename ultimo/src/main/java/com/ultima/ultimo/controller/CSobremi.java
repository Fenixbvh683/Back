
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Sobremi;
import com.ultima.ultimo.service.ISSobremi;
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
public class CSobremi {
    
    @Autowired 
    private ISSobremi sobServ;
    
    
    @PostMapping ("/new/sobremi")
    public void agregarSobremi (@RequestBody Sobremi sob) {
        sobServ.crearSobremi(sob);
    } 
    
    @GetMapping ("/ver/sobremi")
    @ResponseBody
    public List<Sobremi> verSobremi () {
    return sobServ.verSobremi();
    }
    
    
    
    @DeleteMapping ("/delete/sobremi/{idmi}")
    public void borrarsobremi (@PathVariable Long idmi) {
        sobServ.borrarSobremi(idmi);
    }
    
    
    
    @PutMapping ("/editar/sobremi/{idmi}")
    public Sobremi editSobremi(@PathVariable Long idmi,
                               @RequestParam("descripcionmi") String nuevoDescripcionmi){
    
    Sobremi sobremi = sobServ.buscarSobremi(idmi);
    
            sobremi.setDescripcionmi(nuevoDescripcionmi);
            
            
           
            sobServ.crearSobremi(sobremi);
            return sobremi; 
    }
    
        @GetMapping("/sobremi/traer/perfil")
        public Sobremi buscarSobremi(){
            return sobServ.buscarSobremi((long)1);
        }
    
}
